import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>(); // Inicializa un ArrayList de Strings
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Sofia");
        nombres.add(3,"Catito");
        nombres.add(4,"Catopunk");

        System.out.println(nombres); // Imprime el ArrayList
        System.out.println(nombres.size());  //tamaño del array
        System.out.println(nombres.get(3));
        System.out.println(nombres.indexOf("Catopunk"));
        System.out.println(nombres.isEmpty());//Deberia decirme false

    }
}