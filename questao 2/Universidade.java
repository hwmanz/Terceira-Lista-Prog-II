public class Universidade {
    private String nome;
    private Departamento[] departamentos = new Departamento[10];
    private int numDepartamentos = 0;

    public Universidade(String nome) {
        if (!(nome.isEmpty())) {
            this.nome = nome;
        }
    }
    
    public String informaNome() {
        return this.nome;
    }

    public void adcionarDepartamento(String nomeDep) {
        Departamento dep = new Departamento(nomeDep);

        this.departamentos[this.numDepartamentos] = dep;
        this.numDepartamentos++;
    }

    public Departamento encontrarDepartamento(String nomeDep) {
        for (int i = 0; i < this.numDepartamentos; i++) {
            if(this.departamentos[i].informaNome() == nomeDep) {
                return this.departamentos[i];
            }
        }

        return new Departamento();
    }
}
