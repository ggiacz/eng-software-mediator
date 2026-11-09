package mediator;

public interface Painel {

    String liberarLicenca(String prefixo);

    String liberarCruzamento(String prefixo);

    String atenderEmergencia(String prefixo);
}
