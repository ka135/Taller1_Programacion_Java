import java.util.Scanner;

public class Divicion {
    public Divicion() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Divisor");
        System.out.println("Ingrese el dividendo y el divisor");
        double divd = (double)sc.nextInt();
        double divs = (double)sc.nextInt();
        double dividir = divd / divs;
        double residuo = divd % divs;
        if (residuo != 0.0) {
            System.out.println("La división no es exacta.");
        } else {
            System.out.println("La división es exacta.");
        }

        System.out.println("cosiente: " + dividir);
        System.out.println("Residuo: " + residuo);
    }
}
