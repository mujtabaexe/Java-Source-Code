
public class Diagonal_Access_Matrix_2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3,},
        {4, 5, 6},
        {7, 8, 9}

        };
        int k = 2;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]); // Printing main diagonal
                System.out.println(arr[i][k]); // Printing secindary diagonal 
                k--;
                i++;
            }
        }
    }
}
