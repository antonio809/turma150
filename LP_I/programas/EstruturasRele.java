
package programas;

import java.util.Scanner;


public class EstruturasRele {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Divisão de dois números: ");
        System.out.print("Primeiro Número: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Segundo Número: ");
        double num2 = entrada.nextDouble();
        
        
        while(num2 == 0){
            System.out.println("Segundo Número deve ser positivo!");
            
            System.out.print("Segundo Número: ");
            num2 = entrada.nextDouble();
        }
        double resultado = num1 / num2;
        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
    }
}
