package programas;

import java.util.Scanner;


public class EstruturaRepetitva1 {
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("M�dia de n�meros positivos");
        
        System.out.print("Insira n�meros positivos - negativo sai: ");
        double num = entrada.nextDouble();
        
        double soma = 0;
        int qtdNumeros = 0;
        
        while(num > 0){
            soma = soma + num;
            qtdNumeros = qtdNumeros + 1;
            System.out.print("Insira n�meros positivos - negativo sai: ");
            num = entrada.nextDouble();
            
        }
        double media = soma / qtdNumeros;
        System.out.println("M�dia = " + media);
        
        
        entrada.close();
    }
}
