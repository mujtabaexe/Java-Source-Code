public class ExceptionHandling {
    public static void main(String[] args) {
        try {            
            // int a = 10/0;
            boolean isOkay = getData();
            if (!isOkay) {
                throw new Exception("Could not fetch the data");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

    public static boolean getData() {
        return false;
    }
}
