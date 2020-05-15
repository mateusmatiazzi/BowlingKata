public class Frame {
    int pontuacaoDaPrimeiraBola;
    int pontuacaoDaSegundaBola;

    public Frame () {
        pontuacaoDaPrimeiraBola = 0;
        pontuacaoDaSegundaBola = 0;
    }

    public void setPontuacaoDasDuasBolas(int pontuacaoDaPrimeiraBola, int pontuacaoDaSegundaBola){
        setPontuacaoDaPrimeiraBola(pontuacaoDaPrimeiraBola);
        setPontuacaoDaSegundaBola(pontuacaoDaSegundaBola);
    }

    public int getPontuacaoDaPrimeiraBola() {
        return pontuacaoDaPrimeiraBola;
    }

    public void setPontuacaoDaPrimeiraBola(int pontuacaoDaPrimeiraBola) {
        this.pontuacaoDaPrimeiraBola = pontuacaoDaPrimeiraBola;
    }

    public int getPontuacaoDaSegundaBola() {
        return pontuacaoDaSegundaBola;
    }

    public void setPontuacaoDaSegundaBola(int pontuacaoDaSegundaBola) {
        this.pontuacaoDaSegundaBola = pontuacaoDaSegundaBola;
    }
}
