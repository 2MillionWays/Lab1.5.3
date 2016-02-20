package ross.goncharuk;

public class Main {
    static public void main(String[] args) {

        System.out.println("* | 1 2 3 4 5 6 7 8 9");
        System.out.println("-----------------------");

        int n = 9;
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= n; j += i) {
                if (i == 1) {
                    if (j == 1) {
                        n = 1;
                        System.out.print(i + " | ");
                    }
                    n = 9;
                    System.out.print(j + " ");
                    if (j == 9) {
                        System.out.println();
                    }
                } else if (i == 2) {
                    if (j == 2) {
                        n = 2;
                        System.out.print(i + " | ");
                    }
                    n = 18;
                    System.out.print(j + " ");
                    if (j == 18) {
                        System.out.println();
                    }
                } else if (i == 3) {
                    if (j == 3) {
                        n = 3;
                        System.out.print(i + " | ");
                    }
                    n = 27;
                    System.out.print(j + " ");
                    if (j == 27) {
                        System.out.println();
                    }
                } else if (i == 4) {
                    if (j == 4) {
                        n = 4;
                        System.out.print(i + " | ");
                    }
                    n = 36;
                    System.out.print(j + " ");
                    if (j == 36) {
                        System.out.println();
                    }
                } else if (i == 5) {
                    if (j == 5) {
                        n = 5;
                        System.out.print(i + " | ");
                    }
                    n = 45;
                    System.out.print(j + " ");
                    if (j == 45) {
                        System.out.println();
                    }
                } else if (i == 6) {
                    if (j == 6) {
                        n = 6;
                        System.out.print(i + " | ");
                    }
                    n = 54;
                    System.out.print(j + " ");
                    if (j == 54) {
                        System.out.println();
                    }
                } else if (i == 7) {
                    if (j == 7) {
                        n = 7;
                        System.out.print(i + " | ");
                    }
                    n = 63;
                    System.out.print(j + " ");
                    if (j == 63) {
                        System.out.println();
                    }
                } else if (i == 8) {
                    if (j == 8) {
                        n = 8;
                        System.out.print(i + " | ");
                    }
                    n = 72;
                    System.out.print(j + " ");
                    if (j == 72) {
                        System.out.println();
                    }
                } else if (i == 9) {
                    if (j == 9) {
                        n = 9;
                        System.out.print(i + " | ");
                    }
                    n = 81;
                    System.out.print(j + " ");
                    if (j == 81) {
                        System.out.println();
                    }
                }
            }

        }


    }
}