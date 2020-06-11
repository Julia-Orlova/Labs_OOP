/**
 * C2 = 0, операція О1 = +
 * C3 = 2, С = 2
 * C5 = 3, операція О2 = +
 * С7 = 6, тип індексів i та j - double
 */

public class Lab1 {
    public static void main(String[] args) {
        double S = 0;
        double a = 1;
        double n = 2;
        double b = 1;
        double m = 2;

        for (double i = a; i <= n; i++) {
            if (i == -2){
                System.out.println("ZeroDivisionError");
                System.exit(1);
            }
            else {
                for (double j = b; j <= m; j++) {
                    S = S + (i + j) / (i + 2);
                }
            }
        }
        System.out.println(S);
    }
}
