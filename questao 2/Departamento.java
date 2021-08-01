import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Pessoa> pessoal = new ArrayList<Pessoa>();

    public Departamento() {
        
    }

    public Departamento(String nome) {
        if (!(nome.isEmpty())) {
            this.nome = nome;
        }
    }

    public String informaNome() {
        return this.nome;
    }

    public void adicionarPessoa(int dia, int mes, int ano, String nome) {
        Pessoa pessoa = new Pessoa(dia, mes, ano, nome);

        this.pessoal.add(pessoa);
    }

    public Pessoa buscarPessoa(String nome, int idade) {
        for (int i = 0; i < this.pessoal.size(); i++) {
            Pessoa pessoaAtual = this.pessoal.get(i);
            if (pessoaAtual.informaNome() == nome && pessoaAtual.informaIdade() == idade) {
                return pessoaAtual;
            }
        }

        return new Pessoa();
    }
}
