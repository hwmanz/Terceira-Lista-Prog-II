public class Elevador {
    private int andarAtual;
    private int andares;
    private int capacidadeMax;
    private int numPessoas;

    public Elevador() {

    }

    public void inicializa(int capacidade, int andares) {
        if (capacidade >= 1) {
            this.capacidadeMax = capacidade;
        }

        if (andares >= 1) {
            this.andares = andares;
        }
    }

    public void entra() {
        if (!(this.numPessoas == this.capacidadeMax)) {
            numPessoas++;
        }
    }

    public void sai() {
        if (this.numPessoas > 0) {
            this.numPessoas--;
        }
    }

    public void sobe() {
        if (this.andarAtual < this.andares) {
            this.andarAtual++;
        }
    }

    public void desce() {
        if (this.andarAtual > 0) {
            this.andarAtual--;
        }
    }

    public void setAndar(int andar) {
        if (andar >= 0 && andar <= this.andares) {
            this.andarAtual = andar;
        }
    }

    public int getAndar() {
        return this.andarAtual;
    }

    public void setAndarMax(int andar) {
        if (andar >= 0 && andar <= this.andarAtual) {
            this.andares = andar;
        }
    }

    public int getAndarMax() {
        return this.andares;
    }

    public void setPessoas(int pessoas) {
        if (pessoas >= 0 && pessoas <= this.capacidadeMax) {
            this.numPessoas = pessoas;
        }
    }

    public int setPessoas() {
        return this.numPessoas;
    }

    public void setCapacidadeMax(int capacidade) {
        if (capacidade >= 0 && capacidade <= this.numPessoas) {
            this.capacidadeMax = capacidade;
        }
    }
}