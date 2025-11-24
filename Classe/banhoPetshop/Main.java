package Classe.banhoPetshop;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        var scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao YellowShop, a melhor banho & tosa da cidade!");

        Maquina maquina = new Maquina();
        int opcao = -1;

        while(opcao != 0){
            System.out.println("\n--- MENU DA MAQUINA DE BANHO ---");
            System.out.println("1 - Colocar pet na maquina");
            System.out.println("2 - Retirar pet da maquina");
            System.out.println("3 - Dar banho no pet");
            System.out.println("4 - Limpar maquina");
            System.out.println("5 - Abastecer com agua");
            System.out.println("6 - Abastecer com shampoo");
            System.out.println("7 - Verificar nivel de agua");
            System.out.println("8 - Verificar nivel de shampoo");
            System.out.println("9 - Verificar se tem pet na maquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    maquina.colocarPet();
                    break;
                case 2:
                    maquina.retirarPet();
                    break;
                case 3:
                    maquina.darBanho();
                    break;
                case 4:
                    maquina.limparMaquina();
                    break;
                case 5:
                    maquina.abastecerAgua();
                    break;
                case 6:
                    maquina.abastecerShampoo();
                    break;
                case 7:
                    maquina.verificarAgua();
                    break;
                case 8:
                    maquina.verificarShampoo();
                    break;
                case 9:
                    maquina.verificarTemPet();
                    break;
                case 0:
                    System.out.println("Desligando a maquina. Volte sempre!");
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
            }
        }
        scanner.close();
    }
}
