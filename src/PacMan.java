public class PacMan extends Personagens{
    public PacMan(int velocidade){
        setVelocidade(velocidade);
        /*pacPosicaoX = posicaoX;
        pacPosicaoY = posicaoY;*/
    }
    private float pontuacao;

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public static int pacPosicaoX=1;
    public static int pacPosicaoY=1;
    //pode colocar um boolean "comeu" true ou false que conta com um temporizador pra deixar ele naquele estado mas isso é pro futuro

}