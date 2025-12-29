package herancaPoli.Usuarios;

//testes
public class Main {
    public static void main(String args[]){
    

    Gerente gerente1 = new Gerente("Clarissa", "clarissa@email.com", "senha1234");
    Vendedor vendedor1 = new Vendedor("João", "joao@email.com", "senha1234");
    Atendente atendente1 = new Atendente("Maria", "maria@email.com", "senha1234");
    
    vendedor1.realizarLogin();
    atendente1.realizarLogin();
    gerente1.realizarLogin();    

    vendedor1.realizarVenda();
    atendente1.receberPagamento(150.0);
    gerente1.gerarRelatorioFinanceiro();

    vendedor1.alterarSenha("1234", "senha1234");

    vendedor1.getquantidadeVendas();
    System.out.println("O vendedor " + vendedor1.getNome() + " realizou " + vendedor1.getquantidadeVendas() + " vendas.");
    

    //polimorfismo
    Usuario[] listaUsuarios = {gerente1, vendedor1, atendente1};

        for (Usuario u : listaUsuarios) {
            u.realizarLogoff();
        }
 }
}
