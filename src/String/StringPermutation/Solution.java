public class Solution {
    void permutation(String str) {
        if (str == null || str.length() == 0) {
            return;
        }

        char[] ca = str.toCharArray();
        permutation(ca);
    }

    void permutation(char[] ca) {
        
    }
}
