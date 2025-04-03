import java.util.Scanner;

public class PistolasImperio {
    private static final int MAX_PISTOLAS = 100;
    private static String[][] pistolas = new String[MAX_PISTOLAS][2]; // [ID, NombreSoldado]
    private static int totalPistolas = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    /**
     * Ejecuta el menú principal del programa y gestiona la interacción con el usuario.
     */
    public static void menu() {
        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 0); // 0 para salir
    }

    /**
     * Muestra el menú principal con las opciones disponibles.
     */
    private static void mostrarOpciones() {
        System.out.println("\n--- Gestión de Pistolas Imperiales ---");
        System.out.println("1. Agregar pistola");
        System.out.println("2. Eliminar pistola");
        System.out.println("3. Listar pistolas");
        System.out.println("4. Buscar pistola");
        System.out.println("0. Salir");
        System.out.print("Ingrese opción: ");
    }

    /**
     * Obtiene y valida la opción ingresada por el usuario.
     * @return La opción seleccionada.
     */
    private static int obtenerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Ingrese un número.");
            scanner.next(); // Limpiar entrada inválida
        }
        return scanner.nextInt();
    }

    /**
     * Ejecuta la acción correspondiente según la opción seleccionada.
     * @param opcion Opción ingresada por el usuario.
     */
    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1: agregarPistola(); break;
            case 2: eliminarPistola(); break;
            case 3: listarPistolas(); break;
            case 4: buscarPistola(); break;
            case 0: System.out.println("Saliendo..."); break;
            default: System.out.println("Opción inválida.");
        }
    }

    /**
     * Agrega una nueva pistola al inventario, registrando su ID y el nombre del soldado.
     */
    private static void agregarPistola() {
        if (totalPistolas < MAX_PISTOLAS) {
            System.out.print("ID de la pistola: ");
            pistolas[totalPistolas][0] = scanner.next();
            System.out.print("Nombre del soldado: ");
            pistolas[totalPistolas][1] = scanner.next();
            totalPistolas++;
            System.out.println("Pistola agregada.");
        } else {
            System.out.println("Inventario lleno.");
        }
    }

    /**
     * Elimina una pistola del inventario según su ID.
     */
    private static void eliminarPistola() {
        System.out.print("ID de la pistola a eliminar: ");
        String id = scanner.next();
        for (int i = 0; i < totalPistolas; i++) {
            if (pistolas[i][0].equals(id)) {
                reordenarInventario(i);
                totalPistolas--;
                System.out.println("Pistola eliminada.");
                return;
            }
        }
        System.out.println("Pistola no encontrada.");
    }

    /**
     * Reorganiza el inventario después de eliminar una pistola, evitando espacios vacíos.
     * @param indice Índice de la pistola eliminada.
     */
    private static void reordenarInventario(int indice) {
        for (int i = indice; i < totalPistolas - 1; i++) {
            pistolas[i][0] = pistolas[i + 1][0];
            pistolas[i][1] = pistolas[i + 1][1];
        }
    }

    /**
     * Muestra en pantalla todas las pistolas registradas en el inventario.
     */
    private static void listarPistolas() {
        if (totalPistolas == 0) {
            System.out.println("Inventario vacío.");
            return;
        }
        System.out.println("\n--- Pistolas Registradas ---");
        for (int i = 0; i < totalPistolas; i++) {
            System.out.println("ID: " + pistolas[i][0] + ", Soldado: " + pistolas[i][1]);
        }
    }

    private static void buscarPistola() {
        System.out.print("Ingrese ID o nombre del soldado: ");
        String criterio = scanner.next();
        for (int i = 0; i < totalPistolas; i++) {
            if (pistolas[i][0].equals(criterio) || pistolas[i][1].equals(criterio)) {
                System.out.println("ID: " + pistolas[i][0] + ", Soldado: " + pistolas[i][1]);
                return;
            }
        }
        System.out.println("Pistola no encontrada.");
    }
}