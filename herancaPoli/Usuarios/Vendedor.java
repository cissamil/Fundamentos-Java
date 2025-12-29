package herancaPoli.Usuarios;

public class Vendedor extends Usuario {

    private int quantidadeVendas = 0;

    public Vendedor(String nome, String email, String senha){
        super(nome, email, senha, false);


    }

    public int getquantidadeVendas(){
        return quantidadeVendas;
    }

    public void realizarVenda(){
        quantidadeVendas++;
        System.out.println("Venda realizada! Total de vendas: " + quantidadeVendas);
    }
}
