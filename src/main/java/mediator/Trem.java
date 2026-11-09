package mediator;

public abstract class Trem {
    public String solicitarLicenca(String prefixo) {
        return CCO.getInstancia().solicitarLicenca(prefixo);
    }

    public String solicitarCruzamento(String prefixo) {
        return CCO.getInstancia().solicitarCruzamento(prefixo);
    }

    public String informarEmergencia(String prefixo) {
        return CCO.getInstancia().informarEmergencia(prefixo);
    }
}
