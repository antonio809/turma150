package programas;

import java.util.Scanner;

public class EstruturasRedeskstops {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("N�mero Inteiro: ");
        double num = entrada.nextInt();

        double maior = num;
        double menor = num;

        while (num != 0) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            System.out.print("N�mero Inteiro: ");
            num = entrada.nextDouble();
        }

        System.out.println("Maior n�mero: " + maior);
        System.out.println("Menor n�mero: " + menor);

        entrada.close();
    }
}
