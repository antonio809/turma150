package programas;
import java.util.Scanner;

public class Aula09102 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int v[] = new int[6];
        int a = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("v[" + (i+1) + "] : ");
            v[i] = entrada.nextInt();

            a = a + v[i];

        }
        
        System.out.println("Soma dos números: " + a);
        System.out.println("Números em ordem invertida: ");
        
        for(int i = 5; i > 0; i--){
            System.out.println("número: " + i + " = " + v[i]);
            
        }

    }
}
