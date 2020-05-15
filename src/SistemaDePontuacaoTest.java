import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SistemaDePontuacaoTest {

    SistemaDePontuacao sistemaDePontuacao = new SistemaDePontuacao();
    Frame frame = new Frame();

    @ParameterizedTest
    @CsvSource({"8, 0", "2, 4", "1, 5", "1, 3", "0, 2"})
    public void deveRetornarAPontuacaoDoJogadorQueAcertouMenosDeDezPinos(int pontuacaoDaPrimeiraBola, int pontuacaoDaSegundaBola){
        int expected = pontuacaoDaPrimeiraBola + pontuacaoDaSegundaBola;

        frame.setPontuacaoDasDuasBolas(pontuacaoDaPrimeiraBola, pontuacaoDaSegundaBola);
        int actual = sistemaDePontuacao.retornarPontuacaoDoJogadorComMenosDeDezPinos(frame);

        assertEquals(expected, actual);
    }

}