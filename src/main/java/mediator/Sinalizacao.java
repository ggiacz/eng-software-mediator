package mediator;

public class Sinalizacao implements Painel {

    private static Sinalizacao instancia = new Sinalizacao();

    private Sinalizacao() {
    }

    public static Sinalizacao getInstancia() {
        return instancia;
    }

    @Override
    public String liberarLicenca(String prefixo) {
        return "Licenca de circulacao concedida para o trem: " + prefixo;
    }

    @Override
    public String liberarCruzamento(String prefixo) {
        return "Cruzamento no patio liberado para o trem: " + prefixo;
    }

    @Override
    public String atenderEmergencia(String prefixo) {
        return "Trecho interditado e prioridade concedida para o trem: " + prefixo;
    }
}
