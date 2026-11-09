package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TremTest {

    @Test
    void deveSolicitarLicenca() {
        TremCarga trem = new TremCarga();

        assertEquals(
                "O CCO recebeu a solicitacao.\n" +
                "A Sinalizacao respondeu conforme mensagem a seguir.\n" +
                ">>Licenca de circulacao concedida para o trem: C101",
                trem.solicitarLicenca("C101")
        );
    }

    @Test
    void deveSolicitarCruzamento() {
        TremCarga trem = new TremCarga();

        assertEquals(
                "O CCO recebeu a solicitacao.\n" +
                "A Sinalizacao respondeu conforme mensagem a seguir.\n" +
                ">>Cruzamento no patio liberado para o trem: M202",
                trem.solicitarCruzamento("M202")
        );
    }

    @Test
    void deveInformarEmergencia() {
        TremCarga trem = new TremCarga();

        assertEquals(
                "O CCO recebeu a emergencia.\n" +
                "A Sinalizacao respondeu conforme mensagem a seguir.\n" +
                ">>Trecho interditado e prioridade concedida para o trem: G303",
                trem.informarEmergencia("G303")
        );
    }
}
