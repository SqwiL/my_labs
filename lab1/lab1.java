public class lab1 {
    public static void main(String[] args) {
        final long a[] = new long[7];
        for (int i = 0 ; i < a.length; ++i) {
            a[i] = 3 + 2 * i;
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println();
        final double x[] = new double[19];
        for (int i = 0; i < x.length; ++i) {
            x[i] = (Math.random() * 20) - 9;
            System.out.printf("%.2f",x[i]);
            System.out.print(" ");
        }
        System.out.println();
        final double A[][] = new double[7][19];
        for(int i = 0; i < 7 ; ++i) {
            System.out.println();
            for(int j = 0; j < 19 ; ++j) {
                if (a[i] == 9) {
                    A[i][j] = (Math.asin(Math.pow((Math.E),(Math.cbrt(-(Math.pow((Math.PI)/((Math.PI) / 2 + Math.abs(x[j])),2)))))));
                    if (A[i][j] > 0) {
                        System.out.print(" ");
                        System.out.printf("%.2f",A[i][j]);
                        System.out.print("  ");
                    }
                    else {
                        System.out.printf("%.2f",A[i][j]);
                        System.out.print("  ");
                    }
                }
                else if (a[i] == 5 || a[i] == 7 || a[i] == 15) {
                    A[i][j] = (Math.cos(Math.log(Math.pow(Math.sin(x[j]), 2))));
                    if (A[i][j] > 0) {
                        System.out.print(" ");
                        System.out.printf("%.2f",A[i][j]);
                        System.out.print("  ");
                    }
                    else {
                        System.out.printf("%.2f",A[i][j]);
                        System.out.print("  ");
                    }
                }
                else {
                    A[i][j] = (Math.cbrt(Math.pow((Math.E), Math.log(Math.abs(x[j])))));
                    if (A[i][j] > 0) {
                        System.out.print(" ");
                        System.out.printf("%.2f",A[i][j]);
                        System.out.print("  ");
                    }
                    else {
                        System.out.printf("%.2f",A[i][j]);
                        System.out.print("  ");
                    }
                }
            }
        }
        System.out.println();
    }