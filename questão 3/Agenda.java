public class Agenda {
    private Contato[] contatos = new Contato[10];
    private int numContatos = 0;

    public Agenda() {

    }

    public void adicionarContato(int dia, int mes, int ano, String nome, String numero, String email) {
        Contato contato = new Contato(dia, mes, ano, nome, numero, email);
        this.contatos[this.numContatos] = contato;
        this.numContatos++;
    }

    public void removerContato(String nome) {
        int index = buscaPessoa(nome);

        for (int i = index; i < this.numContatos; i++) {
            this.contatos[i] = this.contatos[i+1];
        }

        this.numContatos--;
    }

    public int buscaPessoa(String nome) {
        for (int i = 0; i < this.numContatos; i++) {
            if (this.contatos[i].informaNome() == nome) {
                return i;
            }
        }

        return -1;
    }

    public void imprimeAgenda() {
        for (int i = 0; i < this.numContatos; i++) {
            this.imprimeContato(i);
        }
    }

    public void imprimeContato(int index) {
        Contato contatoAtual = this.contatos[index];

        System.out.printf("Contato #%d\nNome: %s\nIdade: %d\nNúmero: %s\nEmail: %s\n\n", index, contatoAtual.informaNome(), contatoAtual.informaIdade(), contatoAtual.informaNumero(), contatoAtual.informaEmail());
    }
}
