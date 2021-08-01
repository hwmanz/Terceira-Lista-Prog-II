public class Main {
    public static void main(String args[]) {
        Universidade ufpa = new Universidade("UFPA");

        ufpa.adcionarDepartamento("ICEN");
        ufpa.adcionarDepartamento("ITEC");
        ufpa.adcionarDepartamento("ILC");

        ufpa.encontrarDepartamento("ICEN").adicionarPessoa(27, 6, 2001, "Mateus");
        ufpa.encontrarDepartamento("ICEN").adicionarPessoa(30, 10, 2001, "Andreia Comum");
        ufpa.encontrarDepartamento("ITEC").adicionarPessoa(17, 12, 1999, "Jõao");
        ufpa.encontrarDepartamento("ITEC").adicionarPessoa(1, 4, 2002, "Fulano");
        ufpa.encontrarDepartamento("ILC").adicionarPessoa(29, 3, 1990, "Beutrano");
        ufpa.encontrarDepartamento("ILC").adicionarPessoa(1, 2, 1995, "Ciclano");
        

        System.out.printf("%d", ufpa.encontrarDepartamento("ITEC").buscarPessoa("João", 21).informaIdade());
    }
}
