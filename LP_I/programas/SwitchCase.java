
package programas;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha uma op��o:");
        System.out.println("1 - Alimento n�o-perec�vel");
        System.out.println("2 - Alimento perec�vel");
        System.out.println("3 - Vestu�rio");
        System.out.println("4 - Limpeza");
        System.out.println("5 - Fim");
        System.out.print("=> ");
        
        int opcao = entrada.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Alimento n�o-perec�vel");
                break;
            case 2:
                System.out.println("Alimento perec�vel");
                break;
            case 3: 
                System.out.println("Vestu�rio");
                break;
            case 4:
                System.out.println("Limpeza");
                break;
            default:
                System.out.println("Produto n�o Cadastrado.");
                break;
        }
        entrada.close();
    }
}
