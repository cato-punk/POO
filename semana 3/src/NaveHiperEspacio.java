import java.util.Scanner;

public class NaveHiperEspacio {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 6); // 6 para salir
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Naver Hiper Espacio ---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Inversa");
        System.out.println("5. División");
        System.out.println("6. Salir.");
        System.out.print("Ingrese opción: ");

    }

    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                operacionSuma();
                break;
            case 2:
                operacionResta();
                break;
            case 3:
                operacionMultiplicacion();
                break;
            case 4:
                operacionInversa();
                break;
            case 5:
                operacionDivision();
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida.");

        }


    }

    public static void operacionSuma(Scanner sc) {
        double[][] matrizA = leerMatriz(sc, "A");
        double[][] matrizB = leerMatriz(sc, "B");
        double[][] matrizC = leerMatriz(sc, "C");
        double[][] resultado = new double[2][2]; //especifcar los 2x2

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        imprimirMatriz(resultado);


    }

    public static void operacionResta(Scanner sc) {
        double[][] matrizA = leerMatriz(sc, "A");
        double[][] matrizB = leerMatriz(sc, "B");
        double[][] resultado = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        imprimirMatriz(resultado);

    }

    public static void operacionMultiplicacion(Scanner sc){
        double[][] matrizA = leerMatriz(sc , "A");
        double[][] matrizB = leerMatriz(sc , "B");
        double[][] resultado = new double[2][2];

        for (int i = 0; i < 2; i++){
            for (int j; j < 2; j++){
                resultado[i][j] = matrizA[i][0] * matrizB[0][j] + matrizA[i][1]* matrizB[1][j];
            }
        }
        imprimirMatriz(resultado);
    }



    public static double[][] leerMatriz(Scanner sc, String nombre) {
        System.out.println("por favor ingrese los elementos de la matriz 2x2 de la matriz" + nombre);
        double[][] matriz = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(double[][] matriz){
        System.out.println("Resultado");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}