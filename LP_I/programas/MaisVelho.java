
package programas;
import java.util.Scanner;

 
public class MaisVelho {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ariovaldo: ");
        int ari = entrada.nextInt();
        
        System.out.print("Malvadeza: ");
        int mal = entrada.nextInt();
        
        System.out.print("Caledônio: ");
        int cal = entrada.nextInt();
        
        if(ari == mal && mal == cal){
            System.out.println("As idades são iguais."); 
        }else if(ari > mal && ari > cal){
            System.out.println("Ariovaldo é o mais velho.");
        }else if(mal > ari && mal > cal){
            System.out.println("Malvadeza é o mais velho.");
        }else{
            System.out.println("Caledônio é o mais velho.");
        }
    }
}
