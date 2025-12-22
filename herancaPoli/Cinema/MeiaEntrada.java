package herancaPoli.Cinema;

public class MeiaEntrada extends Ingresso {
    public MeiaEntrada(double valor, String nomeFilme, boolean dublado){
        super(valor, nomeFilme, dublado);

    }

      //metodo o seu valor deve ser de metade do valor do ingresso normal
    @Override
    public double valorReal(){
        return super.getValor() / 2;
    }
    
}
