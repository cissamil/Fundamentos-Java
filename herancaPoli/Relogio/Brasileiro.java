package herancaPoli.Relogio;

public class Brasileiro extends Horario {
    @Override
    public void ajustarHorario(Horario outroRelogio) {
        this.setHora(outroRelogio.getHora());
        this.setMinuto(outroRelogio.getMinuto());
        this.setSegundo(outroRelogio.getSegundo());

    }
}
