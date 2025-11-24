package Classe.carro;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
    var scanner = new Scanner(System.in);

    System.out.println("Carro Yellows, use o seu agora:");
    Carro carro = new Carro();
    int opcao = 0;

     while (true) {
            System.out.println("\n--- MENU DO CARRO ---");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar marcha");
            System.out.println("8 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;

                case 2:
                    carro.desligar();
                    break;

                case 3:
                    carro.acelerar();
                    break;

                case 4:
                    carro.diminuirVelocidade();
                    break;

                case 5:
                    System.out.println("Para qual lado deseja virar? (esquerda/direita)");
                    String lado = scanner.next().toLowerCase();
                    carro.virar(lado);
                    break;

                case 6:
                    carro.verificarVelocidade();
                    break;

                case 7:
                    System.out.println("Digite a nova marcha (0 a 6): ");
                    int m = scanner.nextInt();
                    carro.trocarMarcha(m);
                    break;

                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
   }
}
}
