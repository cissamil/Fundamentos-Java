/*

    uma classe pai que tenha as propriedades Hora, minuto e segundo com seus respectivos getters e setters (atendendo as regras do funcionamento de um relógio) 
    e um método que deverá retornar a hora no formato HH:MM:SS 
    
    a partir dessa classe crie 2 implementações, uma chamada relógio Americando
    outra chamada relógio Brasileiro, lembrando que para o relógio americano não existem as horas de 13 até 24. 
    Defina também na super classe um método que ficará por responsabilidade da classe que extende-la definir seu funcionamemnto
    esse método deve receber um relógio ( independente da implementação)
     deve-se extrair as informações dele e usa-la no objeto que recebeu para setar as novas informações do relógio.

*/

package herancaPoli.Relogio;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora){
        if(hora >=0 && hora <24){
            this.hora = hora;

        } else{
            System.out.println("Hora inválida! Deve estar entre 0 e 23.");
        }

    }

    public int getMinuto(){
        return minuto;

    }

    public void setMinuto(int minuto){
        if(minuto>=0 && minuto < 60){
            this.minuto = minuto;
        } else{
            System.out.println("Minuto inválido! Deve estar entre 0 e 59.");
        }
    }

    public int getSegundo(){
        return segundo;
    }

    public void setSegundo(int segundo){
        if(segundo >=0 && segundo <60){
            this.segundo = segundo;
        } else{
            System.out.println("Segundo inválido! Deve estar entre 0 e 59.");
        }
    }

    public String exibirHorario(){
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
    
}
