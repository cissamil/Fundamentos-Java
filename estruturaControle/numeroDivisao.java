
package estruturaControle;
import java.util.Scanner;
public class numeroDivisao {
    public static void main(String args[]){
        var scanner = new Scanner(System.in);
        System.out.printf("Digite um divisor fixo: ");
        int  num1 = scanner.nextInt();
        int  num2;
        
        do {
         System.out.printf("Digite um dividendo: ");
         num2 = scanner.nextInt();
        
        if (num2 < num1) {
            System.out.printf("UM NUMERO MENOR QUE O PRIMEIRO!\n");
            continue;
        }

        // se não for menor, verificar divisibilidade
    } while (num2 % num1 == 0 || num2 < num1);

    }
}
