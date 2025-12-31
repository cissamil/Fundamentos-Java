package herancaPoli.Relogio;

public class Americano extends Horario {
    @Override
    public void ajustarHorario(Horario outroRelogio) {

        if(outroRelogio.getHora() == 0){
            this.setHora(12);
        }
        else if(outroRelogio.getHora()>12){
            this.setHora(outroRelogio.getHora() - 12);
        } 

        else{
            this.setHora(outroRelogio.getHora());
        }

        this.setMinuto(outroRelogio.getMinuto());
   
        this.setSegundo(outroRelogio.getSegundo());
    }
  
}
