import java.util.Arrays;
import java.util.Scanner;

public class Ordenamiento {
    public Ordenamiento() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] areg = new int[4];
        int[] fin = new int[4];
        System.out.println("Ordenamiento");
        System.out.println("Ingrese cuatro numeros");

        int i;
        for(i = 0; i < areg.length; ++i) {
            areg[i] = sc.nextInt();
        }

        Arrays.sort(areg);
        System.out.println("Los numeros son: ");

        for(i = 0; i < areg.length; ++i) {
            System.out.println(areg[i]);
        }

    }
}