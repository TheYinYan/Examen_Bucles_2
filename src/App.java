public class App {
    public static void main(String[] args) throws Exception {
        boolean superior = false;
        boolean superiorDerecha = false;
        boolean superiorIzquierda = false;
        boolean central = false;
        boolean inferiorIzquierda = false;
        boolean inferiorDerecha = false;
        boolean inferior = false;

        int repetir = 7;

        int num = Integer.parseInt(System.console().readLine("Introduce un número del 0 al 9: "));

        switch (num) {
            case 0 -> {
                superior = true;
                superiorDerecha = true;
                superiorIzquierda = true;
                inferiorIzquierda = true;
                inferiorDerecha = true;
                inferior = true;
            }
            case 1 -> {
                superiorDerecha = true;
                inferiorDerecha = true;
            }
            case 2 -> {
                superior = true;
                superiorDerecha = true;
                central = true;
                inferiorIzquierda = true;
                inferior = true;
            }
            case 3 -> {
                superior = true;
                superiorDerecha = true;
                central = true;
                inferiorDerecha = true;
                inferior = true;
            }
            case 4 -> {
                superiorDerecha = true;
                superiorIzquierda = true;
                central = true;
                inferiorDerecha = true;
            }
            case 5 -> {
                superior = true;
                superiorIzquierda = true;
                central = true;
                inferiorDerecha = true;
                inferior = true;
            }
            case 6 -> {
                superior = true;
                superiorIzquierda = true;
                central = true;
                inferiorIzquierda = true;
                inferiorDerecha = true;
                inferior = true;
            }
            case 7 -> {
                superior = true;
                superiorDerecha = true;
                inferiorDerecha = true;
            }
            case 8 -> {
                superior = true;
                superiorDerecha = true;
                superiorIzquierda = true;
                central = true;
                inferiorIzquierda = true;
                inferiorDerecha = true;
                inferior = true;
            }
            case 9 -> {
                superior = true;
                superiorDerecha = true;
                superiorIzquierda = true;
                central = true;
                inferiorDerecha = true;
                inferior = true;
            }
        }

        for (int i = 0; i <= repetir; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(((i == 1 && j == 1) ? " "
                        : (i == 1 && superior && j > 1 && j <= 4) ? "*"
                                : (i == 2 && j == 1 && superiorIzquierda || i == 3 && j == 1 && superiorIzquierda) ? "*"
                                        : (i == 2 && j == 5 && superiorDerecha || i == 3 && j == 5 && superiorDerecha)
                                                ? "*"
                                                : (i == 4 && central && j > 1 && j <= 4) ? "*"
                                                        : (i == 5 && j == 1 && inferiorIzquierda
                                                                || i == 6 && j == 1 && inferiorIzquierda) ? "*"
                                                                        : (i == 5 && j == 5 && inferiorDerecha
                                                                                || i == 6 && j == 5 && inferiorDerecha)
                                                                                        ? "*"
                                                                                        : (i == 7 && inferior && j > 1
                                                                                                && j <= 4) ? "*"
                                                                                                        : " "));
            }
            System.out.println();
        }
    }
}
