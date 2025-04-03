import java.util.*;
public class matriz2x2
{
    public static void main(){
        int i;
        int j;
        int[][] matriz =new int[2][2];

        Scanner dato = new Scanner (System.in);  // que los ingrese
        System.out.println("Escribir datos de la matriz ");

        for (i=0;i<=1;i++){
            for (j=0;j<=1;j++){
                System.out.print("Escribir valor " + i + " , " + j + " : ");
                matriz [i][j] = dato.nextInt();
            }
        }
        System.out.println("MATRIZ 2x2");
        for (i=0;i<=1;i++){
            for (j=0;j<=1;j++){
                System.out.print(matriz[i][j]+"");
            }
            System.out.println("");
        }
    }
}