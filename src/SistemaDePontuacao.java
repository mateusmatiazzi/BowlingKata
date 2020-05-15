public class SistemaDePontuacao {

    public int retornarPontuacaoDoJogadorComMenosDeDezPinos(Frame frame){
        return frame.getPontuacaoDaPrimeiraBola() + frame.getPontuacaoDaSegundaBola();
    }
}
