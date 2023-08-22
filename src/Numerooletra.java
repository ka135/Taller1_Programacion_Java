import java.util.Scanner;

public class Numerooletra {
    public Numerooletra() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero o letra");
        System.out.print("Ingrese un caracter ");
        char caracter = scanner.next().charAt(0);
        if (Character.isLetter(caracter)) {
            System.out.println("Es una letra");
        } else if (Character.isDigit(caracter)) {
            System.out.println("Es un número");
        } else {
            System.out.println("No es ni letra ni número.");
        }

        scanner.close();
    }
}
