
package programas;
import java.util.Scanner;


public class ForArthur {
        public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            
            System.out.print("Insira um n�mero inteiro: ");
            int num = entrada.nextInt();
            
            while(num <= 0){
                System.out.println("N�mero inv�lido!");
                System.out.println("Insira uma n�mero positivo!");
                
                System.out.print("Informe um n�mero inteiro: ");
                num = entrada.nextInt();
            }
            double soma = 0;
            System.out.println(" Informe " + num + " n�meros ");
             
            for(int i = 1; i <= num ; i++){
             
                System.out.printf("N�mero %d: ", i );
                double num1 = entrada.nextDouble();
                soma = soma + num1;
                
            }
            System.out.println("fumiga 3.0: " + soma);
            System.out.println("Fim do programa.");
            entrada.close();
    }
}
