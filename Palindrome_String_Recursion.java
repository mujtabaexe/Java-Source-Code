public class Palindrome_String_Recursion {
    public static void main(String[] args) {
        String s = "dad";
        int l = s.length()-1;
        int i = 0;
        System.out.println(rev(s, l, i));
        System.out.println(palindrome(s, "", s));
    }
    public static boolean rev(String s, int l, int i){
        char ch1=s.charAt(l);
        char ch2=s.charAt(i);

        if(ch1!=ch2){
            return false;
        }
        if(l==i && ch1==ch2){
            return true;
        }
        return rev(s,l-1,i+1);
    }

    public static boolean palindrome(String org, String rev, String remaining) {
        if (rev.length() == org.length()) {
            return rev.equals(org);
        }

        rev += org.charAt(remaining.length() - 1);
        remaining = remaining.substring(0, remaining.length() - 1);


        return palindrome(org, rev, remaining);
    }
}
