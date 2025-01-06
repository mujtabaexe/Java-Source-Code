


public class Sum_Rows_Cols_2DArray {

    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3,},
                        {4, 5, 6},
                        {7, 8, 9}

        };
        int sumRows = 0;
        int sumCols = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for ( int j = 0 ; j<arr.length ; j++){
                sumRows += arr[i][j];
                sumCols += arr[j][i];

            }
            System.out.println(sumRows);
            System.out.println(sumCols);
            sumRows=0;
            sumCols=0;
        }
    }
}
