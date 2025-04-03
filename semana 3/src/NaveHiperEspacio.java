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
        } while (opcion != 0); // 0 para salir
    }
    public static void mostrarMenu() {
        System.out.println("\n--- Naver Hiper Espacio ---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. Inversa");
        System.out.println("5. División");
        System.out.println("0. Salir.");
        System.out.print("Ingrese opción: ");

    }

    /**
     * Ejecuta la opción elegida llamando al método específico para cada operación.
     * TODO: Evaluar la opción ingresada y redirigir a la operación correspondiente.
     */
    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1: operacionSuma(); break;
            case 2: operacionResta(); break;
            case 3: operacionMultiplicacion(); break;
            case 4: operacionInversa(); break;
            case 5: operacionDivision(); break;
            case 0: System.out.println("Saliendo..."); break;
            default: System.out.println("Opción inválida.");

    }

    /**
     * Realiza la operación de suma de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, sumar elemento a elemento e imprimir el resultado.
     */
    public static void operacionSuma(Scanner sc) {
        // TODO: Invocar leerMatriz para ambas matrices, sumar y llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de resta de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, restar elemento a elemento e imprimir el resultado.
     */
    public static void operacionResta(Scanner sc) {
        // TODO: Invocar leerMatriz para ambas matrices, restar y llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de multiplicación de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, multiplicarlas utilizando la suma de productos y mostrar el resultado.
     */
    public static void operacionMultiplicacion(Scanner sc) {
        // TODO: Invocar leerMatriz para ambas matrices, multiplicar y llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de cálculo de la inversa de una matriz 2x2.
     * TODO: Leer una matriz 2x2, calcular su determinante, verificar invertibilidad y mostrar la inversa.
     */
    public static void operacionInversa(Scanner sc) {
        // TODO: Invocar leerMatriz, calcular determinante, verificar y calcular la inversa, luego llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de división de matrices resolviendo A * X = B.
     * TODO: Leer la matriz A, verificar que sea invertible, calcular su inversa, leer la matriz B y mostrar el resultado de A^-1 * B.
     */
    public static void operacionDivision(Scanner sc) {
        // TODO: Invocar leerMatriz para A y B, calcular inversa de A, multiplicar por B y llamar a imprimirMatriz.
    }

    /**
     * Lee una matriz 2x2 desde la entrada estándar.
     * TODO: Solicitar al usuario cada elemento de la matriz especificada y retornar la matriz.
     */
    public static double[][] leerMatriz(Scanner sc, String nombre) {
        // TODO: Implementar lectura de 2x2 elementos y retornar la matriz.
    }

    /**
     * Imprime una matriz 2x2 en formato sencillo.
     * TODO: Recorrer la matriz y mostrar cada uno de sus elementos.
     */
    public static void imprimirMatriz(double[][] matriz) {
        // TODO: Implementar impresión de cada elemento de la matriz.
    }

    /**
     * Calcula el determinante de una matriz 2x2.
     * TODO: Calcular y retornar el determinante utilizando la fórmula: ad - bc.
     */
    public static double determinante(double[][] matriz) {
        // TODO: Implementar el cálculo del determinante.
    }
}
