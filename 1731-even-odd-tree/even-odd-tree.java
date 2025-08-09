class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if (root == null) return false;
        
        Queue<TreeNode> sample = new LinkedList<>();
        sample.add(root);
        int count = 0; // level number
        
        while (!sample.isEmpty()) {
            int size = sample.size();
            ArrayList<Integer> temp = new ArrayList<>();
            boolean eve = (count % 2 == 0);
            
            for (int i = 0; i < size; i++) {
                TreeNode x = sample.poll();
                
        
                if (eve && x.val % 2 == 0) return false;
                if (!eve && x.val % 2 != 0) return false;
                
                if (!temp.isEmpty()) {
                    int prev = temp.get(temp.size() - 1);
                    if (eve && prev >= x.val) return false;
                    if (!eve && prev <= x.val) return false;
                }
                
                temp.add(x.val);
                
                if (x.left != null) sample.add(x.left);
                if (x.right != null) sample.add(x.right);
            }
            count++;
        }
        
        return true;
    }
}
