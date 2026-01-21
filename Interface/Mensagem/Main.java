import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Marketing m1 = new Marketing();
        String cupom = "Ganhou frete grátis";

        System.out.println("Selecione o servico:");
        System.out.println("0: WhatsApp");
        System.out.println("1: SMS");
        System.out.println("2: Redes Sociais");
        System.out.println("3: Email");
        int servico = scanner.nextInt();

        switch (servico){
        case 0 -> m1.disparar(cupom, msg -> System.out.println("Enviando para WhatsApp " + msg));
        case 1 -> m1.disparar(cupom, msg -> System.out.println("Enviando para SMS " + msg));
        case 2 -> m1.disparar(cupom, msg -> System.out.println("Enviando para Redes Sociais " + msg));
        case 3 -> m1.disparar(cupom, msg -> System.out.println("Enviando para E-mail " + msg));
        default -> System.out.println("Opcao invalida!!!");

        }

        scanner.close();
    }
}
