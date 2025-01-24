public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < 26;i++){
            sb.append((char)('a'+i));
        }
        System.out.println(sb);
        sb.deleteCharAt(0);
        sb.deleteCharAt(1);
        sb.deleteCharAt(2);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
    }
}
