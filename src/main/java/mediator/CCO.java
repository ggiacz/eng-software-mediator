package mediator;

public class CCO {

    private static CCO instancia = new CCO();

    private CCO() {
    }

    public static CCO getInstancia() {
        return instancia;
    }

    public String solicitarLicenca(String prefixo) {
        return "O CCO recebeu a solicitacao.\n" +
                "A Sinalizacao respondeu conforme mensagem a seguir.\n" +
                ">>" + Sinalizacao.getInstancia().liberarLicenca(prefixo);
    }

    public String solicitarCruzamento(String prefixo) {
        return "O CCO recebeu a solicitacao.\n" +
                "A Sinalizacao respondeu conforme mensagem a seguir.\n" +
                ">>" + Sinalizacao.getInstancia().liberarCruzamento(prefixo);
    }

    public String informarEmergencia(String prefixo) {
        return "O CCO recebeu a emergencia.\n" +
                "A Sinalizacao respondeu conforme mensagem a seguir.\n" +
                ">>" + Sinalizacao.getInstancia().atenderEmergencia(prefixo);
    }
}
