
package programas;

import java.util.Scanner;


public class Virgilio {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Mostra divisores de um n�mero.");
        System.out.print("N�mero: ");
        int num = teclado.nextInt();
        
        while(num < 0){
            System.out.println("N�mero deve ser maior do que zero!");
            System.out.print("N�mero: ");
            num = teclado.nextInt();
        }            
        System.out.println("Divisores de " + num);
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
        System.out.println("Fim do programa!");
        teclado.close();
    }
}

