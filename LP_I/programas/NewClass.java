
package programas;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num = 0;
        int soma = 0;
        do{ 
            soma = soma + num;
            System.out.println("Números positivos ou 0 - negativo sai: ");
            num = entrada.nextInt();                                                                                                                                                                                                                                                                                                                    
            
            if(num < 0){
                System.out.println("Informou número negativo!");
            }
        }while(num >= 0);
        System.out.printf("A soma é igual a %d\n", soma);
        
        
    }
}
