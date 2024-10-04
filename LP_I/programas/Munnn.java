
package programas;
import java.util.Scanner;


public class Munnn {
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
         
         System.out.print("Insira um número: ");
         double n = entrada.nextDouble();
         
         double r = Math.sqrt(n);
         
         System.out.println("A raiz de " + n + " é: " + r);
    }
}
