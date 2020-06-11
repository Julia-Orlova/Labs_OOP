/**
 * C5 = 3 виключне або
 * C7 = 6 тип елементів матриці float
 * C11 = 0 обчислити суму найменших елементів кожного стовпця матриці
 */

public class Lab2 {
    public static void main(String[] args) {
        float A[][] = {{-1, 2, 3, 1},
                       {4, 5, 6, 2},
                       {7, -8, 9, 3}};
        float B[][] = {{8, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        int arow = A.length;
        int acolumn = A[0].length;
        int brow = B.length;
        int bcolumn = B[0].length;

        float C[][] = new float[arow + brow][acolumn + bcolumn];

        for (int i = 0; i < (arow + brow); i++) {
            for (int j = 0; j < (acolumn + bcolumn); j++) {
                if (j < acolumn && i < arow) {
                    C[i][j] = A[i][j];
                }
                else if (j >= acolumn && i >= arow){
                    C[i][j] = B[i-arow][j- acolumn];
                }
                else {
                    C[i][j] = 0;
                }
            }
        }

        for (int i1 = 0; i1 < C.length; i1++) {
            for (int j1 = 0; j1 < C[0].length; j1++) {
                System.out.print(C[i1][j1]+"  ");
            }
            System.out.println();
        }

        float min;
        float S = 0;
        for (int j1 = 0; j1 < (bcolumn + acolumn); j1++){
            min = C[0][j1];
            for (int i1 = 0; i1 < (brow + arow); i1++){
                if (C[i1][j1] < min){
                    min = C[i1][j1];
                }
            }
            S += min;
        }
        System.out.println(S);
    }
}
