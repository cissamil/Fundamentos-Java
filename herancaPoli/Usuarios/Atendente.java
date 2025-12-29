package herancaPoli.Usuarios;

public class Atendente extends Usuario{

    private double valorCaixa = 0.0;

    public Atendente(String nome, String email, String senha){
        super(nome, email, senha, false);
    }

    public double getValorCaixa(){
        return valorCaixa;
    }

    public void receberPagamento(double valor){
        valorCaixa += valor;
        System.out.println("Pagamento recebido: R$" + valor + ". Valor em caixa agora: R$" + valorCaixa);
    }

    public void fecharCaixa(){
        System.out.println("Fechando caixa. Valor total em caixa: R$" + valorCaixa);
        valorCaixa = 0.0;
    }

}