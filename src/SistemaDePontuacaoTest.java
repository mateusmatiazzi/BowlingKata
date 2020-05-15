import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SistemaDePontuacaoTest {

    SistemaDePontuacao sistemaDePontuacao = new SistemaDePontuacao();

    @ParameterizedTest
    @CsvSource({"8", "4", "5", "1", "2"})
    public void deveRetornarAPontuacaoDoJogadorQueAcertouMenosDeDezPinos(int pontuacaoNoFrame){

        int actual = sistemaDePontuacao.retornarPontuacaoDoJogadorComMenosDeDezPinos(pontuacaoNoFrame);

        assertEquals(pontuacaoNoFrame, actual);
    }
}