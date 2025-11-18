public class App {
    public static void main(String[] args) throws Exception {
        boolean superior = false;
        boolean superiorDerecha = false;
        boolean superiorIzquierda = false;
        boolean central = false;
        boolean inferiorIzquierda = false;
        boolean inferiorDerecha = false;
        boolean inferior = false;

        boolean salir = true;
        while (salir) {
            System.out.println("""
                    *****************************************
                    *                                       *
                    *       NÚMEROS DIGITALES v1.0          *
                    *                                       *
                    *****************************************
                    *                                       *
                    *   [1] Mostrar secuencia (0 a N)       *
                    *   [2] Número específico               *
                    *   [0] Salir                           *
                    *                                       *
                    *****************************************
                    """);

            int opcion = Integer.parseInt(System.console().readLine("Opción: "));
            if (opcion == 0) {
                salir = false;
            }
            if (opcion == 1) {
                int num = Integer.parseInt(System.console().readLine("Introduce un número del 0 al 9: "));
                for (int i = 1; i <= 7; i++) {
                    for (int digito = 0; digito <= num; digito++) {

                        switch (digito) {
                            case 0 -> {
                                superior = true;
                                superiorDerecha = true;
                                superiorIzquierda = true;
                                central = false;
                                inferiorIzquierda = true;
                                inferiorDerecha = true;
                                inferior = true;
                            }
                            case 1 -> {
                                superior = false;
                                superiorDerecha = false;
                                superiorIzquierda = false;
                                inferiorIzquierda = false;
                                inferiorDerecha = false;
                                inferior = false;
                                superiorDerecha = true;
                                inferiorDerecha = true;
                            }
                            case 2 -> {
                                superior = false;
                                superiorDerecha = false;
                                superiorIzquierda = false;
                                inferiorIzquierda = false;
                                inferiorDerecha = false;
                                inferior = false;
                                superior = true;
                                superiorDerecha = true;
                                central = true;
                                inferiorIzquierda = true;
                                inferior = true;
                            }
                            case 3 -> {
                                superior = false;
                                superiorDerecha = false;
                                superiorIzquierda = false;
                                inferiorIzquierda = false;
                                inferiorDerecha = false;
                                inferior = false;
                                superior = true;
                                superiorDerecha = true;
                                central = true;
                                inferiorDerecha = true;
                                inferior = true;
                            }
                            case 4 -> {
                                superior = false;
                                superiorDerecha = false;
                                superiorIzquierda = false;
                                inferiorIzquierda = false;
                                inferiorDerecha = false;
                                inferior = false;
                                superiorDerecha = true;
                                superiorIzquierda = true;
                                central = true;
                                inferiorDerecha = true;
                            }
                            case 5 -> {
                                superior = false;
                                superiorDerecha = false;
                                superiorIzquierda = false;
                                inferiorIzquierda = false;
                                inferiorDerecha = false;
                                inferior = false;
                                superior = true;
                                superiorIzquierda = true;
                                central = true;
                                inferiorDerecha = true;
                                inferior = true;
                            }
                            case 6 -> {
                                superior = false;
                                superiorDerecha = false;
                                superiorIzquierda = false;
                                inferiorIzquierda = false;
                                inferiorDerecha = false;
                                inferior = false;
                                superior = true;
                                superiorIzquierda = true;
                                central = true;
                                inferiorIzquierda = true;
                                inferiorDerecha = true;
                                inferior = true;
                            }
                            case 7 -> {
                                superior = false;
                                superiorDerecha = false;
                                superiorIzquierda = false;
                                inferiorIzquierda = false;
                                inferiorDerecha = false;
                                inferior = false;
                                central = false;
                                superior = true;
                                superiorDerecha = true;
                                inferiorDerecha = true;
                            }
                            case 8 -> {
                                superior = false;
                                superiorDerecha = false;
                                superiorIzquierda = false;
                                inferiorIzquierda = false;
                                inferiorDerecha = false;
                                inferior = false;
                                superior = true;
                                superiorDerecha = true;
                                superiorIzquierda = true;
                                central = true;
                                inferiorIzquierda = true;
                                inferiorDerecha = true;
                                inferior = true;
                            }
                            case 9 -> {
                                superior = false;
                                superiorDerecha = false;
                                superiorIzquierda = false;
                                inferiorIzquierda = false;
                                inferiorDerecha = false;
                                inferior = false;
                                superior = true;
                                superiorDerecha = true;
                                superiorIzquierda = true;
                                central = true;
                                inferiorDerecha = true;
                                inferior = true;
                            }
                        }

                        if (i == 1 && superior || i == 7 && inferior || i == 4 && central) {
                            System.out.print(" *** ");
                        } else if (i == 1 && !superior || i == 7 && !inferior || i == 4 && !central) {
                            System.out.print("     ");
                        }

                        if (i == 2 && superiorIzquierda || i == 3 && superiorIzquierda || i == 5 && inferiorIzquierda
                                || i == 6 && inferiorIzquierda) {
                            System.out.print("*   ");
                        } else if (i == 2 && !superiorIzquierda || i == 3 && !superiorIzquierda
                                || i == 5 && !inferiorIzquierda
                                || i == 6 && !inferiorIzquierda) {
                            System.out.print("    ");
                        }

                        if (i == 2 && superiorDerecha || i == 3 && superiorDerecha || i == 5 && inferiorDerecha
                                || i == 6 && inferiorDerecha) {
                            System.out.print("*");
                        } else if (i == 2 && !superiorDerecha || i == 3 && !superiorDerecha ||
                                i == 5 && !inferiorDerecha || i == 6 && !inferiorDerecha) {
                            System.out.print(" ");
                        }
                        System.out.print("  ");

                    }
                    System.out.println();
                }
            }
            if (opcion == 2) {
                int num = Integer.parseInt(System.console().readLine("Introduce un número del 0 al 9: "));
                switch (num) {
                    case 0 -> {
                        superior = true;
                        superiorDerecha = true;
                        superiorIzquierda = true;
                        central = false;
                        inferiorIzquierda = true;
                        inferiorDerecha = true;
                        inferior = true;
                    }
                    case 1 -> {
                        superior = false;
                        superiorDerecha = false;
                        superiorIzquierda = false;
                        inferiorIzquierda = false;
                        inferiorDerecha = false;
                        inferior = false;
                        superiorDerecha = true;
                        inferiorDerecha = true;
                    }
                    case 2 -> {
                        superior = false;
                        superiorDerecha = false;
                        superiorIzquierda = false;
                        inferiorIzquierda = false;
                        inferiorDerecha = false;
                        inferior = false;
                        superior = true;
                        superiorDerecha = true;
                        central = true;
                        inferiorIzquierda = true;
                        inferior = true;
                    }
                    case 3 -> {
                        superior = false;
                        superiorDerecha = false;
                        superiorIzquierda = false;
                        inferiorIzquierda = false;
                        inferiorDerecha = false;
                        inferior = false;
                        superior = true;
                        superiorDerecha = true;
                        central = true;
                        inferiorDerecha = true;
                        inferior = true;
                    }
                    case 4 -> {
                        superior = false;
                        superiorDerecha = false;
                        superiorIzquierda = false;
                        inferiorIzquierda = false;
                        inferiorDerecha = false;
                        inferior = false;
                        superiorDerecha = true;
                        superiorIzquierda = true;
                        central = true;
                        inferiorDerecha = true;
                    }
                    case 5 -> {
                        superior = false;
                        superiorDerecha = false;
                        superiorIzquierda = false;
                        inferiorIzquierda = false;
                        inferiorDerecha = false;
                        inferior = false;
                        superior = true;
                        superiorIzquierda = true;
                        central = true;
                        inferiorDerecha = true;
                        inferior = true;
                    }
                    case 6 -> {
                        superior = false;
                        superiorDerecha = false;
                        superiorIzquierda = false;
                        inferiorIzquierda = false;
                        inferiorDerecha = false;
                        inferior = false;
                        superior = true;
                        superiorIzquierda = true;
                        central = true;
                        inferiorIzquierda = true;
                        inferiorDerecha = true;
                        inferior = true;
                    }
                    case 7 -> {
                        superior = false;
                        superiorDerecha = false;
                        superiorIzquierda = false;
                        inferiorIzquierda = false;
                        inferiorDerecha = false;
                        inferior = false;
                        central = false;
                        superior = true;
                        superiorDerecha = true;
                        inferiorDerecha = true;
                    }
                    case 8 -> {
                        superior = false;
                        superiorDerecha = false;
                        superiorIzquierda = false;
                        inferiorIzquierda = false;
                        inferiorDerecha = false;
                        inferior = false;
                        superior = true;
                        superiorDerecha = true;
                        superiorIzquierda = true;
                        central = true;
                        inferiorIzquierda = true;
                        inferiorDerecha = true;
                        inferior = true;
                    }
                    case 9 -> {
                        superior = false;
                        superiorDerecha = false;
                        superiorIzquierda = false;
                        inferiorIzquierda = false;
                        inferiorDerecha = false;
                        inferior = false;
                        superior = true;
                        superiorDerecha = true;
                        superiorIzquierda = true;
                        central = true;
                        inferiorDerecha = true;
                        inferior = true;
                    }
                }
                for (int i = 1; i <= 7; i++) {
                    if (i == 1 && superior || i == 7 && inferior || i == 4 && central) {
                        System.out.print(" *** ");
                    } else if (i == 1 && !superior || i == 7 && !inferior || i == 4 && !central) {
                        System.out.print("     ");
                    }

                    if (i == 2 && superiorIzquierda || i == 3 && superiorIzquierda || i == 5 && inferiorIzquierda
                            || i == 6 && inferiorIzquierda) {
                        System.out.print("*   ");
                    } else if (i == 2 && !superiorIzquierda || i == 3 && !superiorIzquierda
                            || i == 5 && !inferiorIzquierda
                            || i == 6 && !inferiorIzquierda) {
                        System.out.print("    ");
                    }

                    if (i == 2 && superiorDerecha || i == 3 && superiorDerecha || i == 5 && inferiorDerecha
                            || i == 6 && inferiorDerecha) {
                        System.out.print("*");
                    } else if (i == 2 && !superiorDerecha || i == 3 && !superiorDerecha ||
                            i == 5 && !inferiorDerecha || i == 6 && !inferiorDerecha) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }

            }
        }

    }

}