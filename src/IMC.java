import java.util.Scanner;

public class IMC {
    public IMC() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indice de masa corporal");
        System.out.println("Ingrese su estatura, peso(kg) y edad");
        int estatura = sc.nextInt();
        double peso = (double)sc.nextInt();
        int edad = sc.nextInt();
        double altura = (double)(estatura * estatura);
        double calculo = peso / altura;
        if (edad < 45) {
            if (calculo < 22.0) {
                System.out.println("Bajo");
            } else {
                System.out.println("Medio");
            }
        } else if (calculo < 22.0) {
            System.out.println("Medio");
        } else {
            System.out.println("alto");
        }

    }
}
