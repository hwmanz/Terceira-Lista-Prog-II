public class Televisao {
    private int canal = 0;
    private int volume = 0;

    Televisao() {

    }

    protected void setCanal(int canal) {
        this.canal = canal;
    }

    protected int getCanal() {
        return this.canal;
    }

    protected void setVolume(int volume) {
        this.volume = volume;
    }

    protected int getVolume() {
        return this.volume;
    }
}