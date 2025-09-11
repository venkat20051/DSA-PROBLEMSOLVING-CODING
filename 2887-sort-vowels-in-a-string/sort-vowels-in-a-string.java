import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> k = new ArrayList<>();
        
        // Collect ASCII values of vowels
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                int ascii = (int) s.charAt(i);
                k.add(ascii);
            }
        }
        Collections.sort(k);
        
        String d = "";
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                char t = (char) k.get(r).intValue();
                r++;
                d = d + t;
            } else {
                d = d + s.charAt(i);
            }
        }
        return d;
    }
}
