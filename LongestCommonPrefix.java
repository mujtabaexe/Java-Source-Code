public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String prefix = "";
        char temp = '\u0000';
        boolean flag = true;
        for (int i = 0; i < strs[0].length(); i++) {
            temp = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
               if (strs[j].charAt(i)==temp) {
                System.out.println(strs[j].charAt(i));
                continue;
               }
               flag=false;
               break;
            }
            if (flag==false) {
                return prefix;
            }
            else
            {   
            prefix+=strs[0].charAt(i);

            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] names = {"flower","flowe"};
        System.out.println(longestCommonPrefix(names));
        
    }
}









public String longestCommonPrefix(String[] strs) {
    String prefix = "";

    if (strs.length == 1) return strs[0];
    else{
    prefix = strs[0];
    }
        
    for(int i = 0 ; i<strs.length(); i+=2) {
        String word1 = strs[i];
        String word2 = strs[i+1];
        for (int j=0; j<word1.length() ;j++){
            String check1 = word1.substring(j);
            String check2 = word2.substring(j);
            if (check1 == check2){
                prefix = check1;
            }
    return prefix;        

        }
    }
}