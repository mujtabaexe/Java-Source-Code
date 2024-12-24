class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        if (strs[0].length() <= 2) {
            return "";
        }

        String prefix = "";
        prefix = strs[0].substring(0,2);
            
        for(int i = 1 ; i<strs.length; i++) {
            String word = strs[i];
            String a = word.substring(0,2);
            if(!prefix.equals(a)){
                return "";
            }
        }
        return prefix;
    }
}