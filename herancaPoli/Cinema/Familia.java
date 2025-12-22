package herancaPoli.Cinema;

public class Familia extends Ingresso {

    public Familia(Double valor, String nomeFilme, boolean dublado){
        super(valor, nomeFilme, dublado);
    }

      //valor multiplicado pelo número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3
    public double valorReal(int numeroPessoas){
        double valorTotal = super.getValor() * numeroPessoas;
        if(numeroPessoas > 3){
            valorTotal = valorTotal * 0.95; 
        }
        return valorTotal;
    }
    
}
