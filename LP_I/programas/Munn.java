
package programas;
import java.util.Scanner;


public class Munn {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um número: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Insira outro número: ");
        int num2 = entrada.nextInt();
        
       if(num1 > num2){
           System.out.println("O primeiro número é maior.");
       }else{
           System.out.println("O segundo número é maior.");
       }

    }
}
