public class Controle {
    private Televisao tvControlada = new Televisao();

    Controle() {

    }

    public void aumentarVolume() {
        int volumeAtual = this.tvControlada.getVolume();
        
        if (volumeAtual < 100) {
            this.tvControlada.setVolume(volumeAtual+1);
        }
    }

    public void diminuirVolume() {
        int volumeAtual = this.tvControlada.getVolume();
        
        if (volumeAtual > 0) {
            this.tvControlada.setVolume(volumeAtual-1);
        }
    }

    public void canalAcima() {
        int canalAtual = this.tvControlada.getCanal();
    
        this.tvControlada.setCanal(canalAtual+1);
    }

    public void canalAbaixo() {
        int canalAtual = this.tvControlada.getCanal();
    
        if (canalAtual > 0) {
            this.tvControlada.setCanal(canalAtual-1);
        }
    }

    public void mudarCanal(int canal) {
        if (canal > 0) {
            this.tvControlada.setCanal(canal);
        }
    }
    
    public int[] getValores() {
        return new int[] {this.tvControlada.getCanal(), this.tvControlada.getVolume()};
    }
}
