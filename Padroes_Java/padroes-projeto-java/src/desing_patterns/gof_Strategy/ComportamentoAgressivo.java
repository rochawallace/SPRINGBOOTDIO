package desing_patterns.gof_Strategy;

public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Robo está se movendo agressivamente.");
    }
}
