import java.util.Scanner;

public class Añosbisiestos {
    public Añosbisiestos() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Año bisiesto");
        System.out.println("Ingrese el año");
        int año = sc.nextInt();
        if ((año % 4 != 0 || año % 100 == 0) && (año % 100 != 0 || año % 400 != 0)) {
            System.out.println(año + " no es bisiesto");
        } else {
            System.out.println(año + " es bisiesto");
        }

    }
}