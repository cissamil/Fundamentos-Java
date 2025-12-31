package herancaPoli.Relogio;

public abstract class Horario {
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

    public abstract void ajustarHorario(Horario outroRelogio);
    
}
