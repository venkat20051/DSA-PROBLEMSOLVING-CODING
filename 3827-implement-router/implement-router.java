import java.util.*;

class Router {
    private int memoryLimit;
    private Queue<int[]> queue; // FIFO
    private Set<String> seen;   // duplicate check
    private Map<Integer, TreeMap<Integer, Integer>> prefixMap; // dest -> (timestamp -> prefix sum)

    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
        this.queue = new LinkedList<>();
        this.seen = new HashSet<>();
        this.prefixMap = new HashMap<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        String key = source + "#" + destination + "#" + timestamp;
        if (seen.contains(key)) return false;

        // Evict if full
        if (queue.size() == memoryLimit) {
            int[] old = queue.poll();
            String oldKey = old[0] + "#" + old[1] + "#" + old[2];
            seen.remove(oldKey);
            removeFromPrefix(old[1], old[2]);
        }

        queue.offer(new int[]{source, destination, timestamp});
        seen.add(key);
        addToPrefix(destination, timestamp);

        return true;
    }

    public int[] forwardPacket() {
        if (queue.isEmpty()) return new int[0];

        int[] packet = queue.poll();
        String key = packet[0] + "#" + packet[1] + "#" + packet[2];
        seen.remove(key);
        removeFromPrefix(packet[1], packet[2]);
        return packet;
    }

    public int getCount(int destination, int startTime, int endTime) {
        if (!prefixMap.containsKey(destination)) return 0;
        TreeMap<Integer, Integer> map = prefixMap.get(destination);

        Map.Entry<Integer, Integer> end = map.floorEntry(endTime);
        Map.Entry<Integer, Integer> start = map.floorEntry(startTime - 1);

        int sumEnd = (end == null ? 0 : end.getValue());
        int sumStart = (start == null ? 0 : start.getValue());
        return sumEnd - sumStart;
    }

    // ---- Helpers for prefix sums ----
    private void addToPrefix(int destination, int timestamp) {
        prefixMap.putIfAbsent(destination, new TreeMap<>());
        TreeMap<Integer, Integer> map = prefixMap.get(destination);

        int prev = (map.isEmpty() ? 0 : map.lastEntry().getValue());
        map.put(timestamp, prev + 1);
    }

    private void removeFromPrefix(int destination, int timestamp) {
        TreeMap<Integer, Integer> map = prefixMap.get(destination);
        if (map == null) return;

        // Rebuild suffix (since prefix sums after this timestamp shift by -1)
        NavigableMap<Integer, Integer> tail = map.tailMap(timestamp, true);
        List<Integer> keys = new ArrayList<>(tail.keySet());
        for (int t : keys) {
            map.put(t, map.get(t) - 1);
            if (map.get(t) == 0 && t == keys.get(keys.size() - 1)) {
                map.remove(t);
            }
        }
        if (map.isEmpty()) prefixMap.remove(destination);
    }
}
