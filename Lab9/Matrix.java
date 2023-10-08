public class Matrix {
    public static void main(String[] args) {
        int firstRowSum = 5;
        int secondRowSum = 4;
        int[] columnSum = {1, 1, 2, 1, 0, 2, 1, 2};

        if (isGood(firstRowSum, secondRowSum, columnSum)){
            for (int i = 0; i < 2; i++){
                int n = 0;
                do {
                    System.out.print(matrix(firstRowSum, secondRowSum, columnSum)[i][n] + " ");
                    n++;
                } while (n < columnSum.length);
                System.out.format("\n");
            }
        } else System.out.println("[ ]");
    }

    public static boolean isGood(int firstRowSum, int secondRowSum, int[] columnSum){
        for (int i = 0; i < columnSum.length; i++){
            if (columnSum[i] != 0 && columnSum[i] != 1 && columnSum[i] != 2) return false;
        }

        int sum = 0;
        for (int j = 0; j < columnSum.length; j++){
            sum = sum + columnSum[j];
        }

        return sum == firstRowSum + secondRowSum;
    }

    public static int[][] matrix(int firstRowSum, int secondRowSum, int[] columnSum){
        int[][] matrix = new int[2][columnSum.length];
        int nDwojek = 0;

        for (int j = 0; j < columnSum.length; j++){
            if (columnSum[j] == 2) nDwojek++;
        }

        firstRowSum = firstRowSum - nDwojek;
        secondRowSum = secondRowSum - nDwojek;

        for (int i = 0; i < columnSum.length; i++){
            if (nDwojek > 0 && columnSum[i] == 2){
                matrix[0][i] = 1;
                matrix[1][i] = 1;
                nDwojek--;
            } else if (firstRowSum > 0 && columnSum[i] == 1) {
                matrix[0][i] = 1;
                matrix[1][i] = 0;
                firstRowSum--;
            } else if (secondRowSum > 0 && columnSum[i] == 1) {
                matrix[0][i] = 0;
                matrix[1][i] = 1;
                secondRowSum--;
            } else {
                matrix[0][i] = 0;
                matrix[1][i] = 0;
            }
        }
        return matrix;
    }
}
