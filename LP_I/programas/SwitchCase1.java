
package programas;
import java.util.Scanner;


public class SwitchCase1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um n�mero: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Digite a opera��o: ");
        char operacao = entrada.next().charAt(0);
        //entrada.nextLine();
        
        System.out.print("Digite outro n�mero: ");
        double num2 = entrada.nextDouble();
        
        double resultado;
        
        switch(operacao){
            case '+':
                resultado = num1 + num2;
                System.out.print("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.print("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.print("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.print("Resultado: " + num1 + " / " + num2 + " = " + resultado);
            default:
                System.out.println("Opera��o Inv�lida.");
                break;
        }
        entrada.close();
    }  
}
