/* 
  - Crie uma hierarquia de classes para tratar os tipos de ingresso 
# Atributos do ingresso: valor, nome do filme e se é dublado ou legendado. 
# Ingresso tem subtipo: Meia entrada e família. 

    - Metodo
  Cada ingresso deve ter um método que retorna o seu valor real de acordo com o tipo:
 # meia entrada: o seu valor deve ser de metade do valor do ingresso normal
 # ingressos família: deve-se retornar o valor multiplicado pelo número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3

*/

package herancaPoli.Cinema;

public class Ingresso {
  private double valor;
  private String nomeFilme;
  private boolean dublado;

  //construtor
  public Ingresso(double valor, String nomeFilme, boolean dublado){
    this.valor = valor;
    this.nomeFilme = nomeFilme;
    this.dublado = dublado;
    }
  

//getters e setters
  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String getNomeFilme() {
    return nomeFilme;
  }

  public void setNomeFilme(String nomeFilme) {
    this.nomeFilme = nomeFilme;
  }

  public boolean isDublado() {
    return dublado;
  }

  public void setDublado(boolean dublado) {
    this.dublado = dublado;
  }

  //metodo
  public double valorReal(){
    return this.valor;
  }



}