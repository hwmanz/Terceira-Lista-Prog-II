public class Contato extends Pessoa{
    private String numero;
    private String email;

    public Contato(int dia, int mes, int ano, String nome, String numero, String email) {
        super(dia, mes, ano, nome);
        
        if (numero != "") {
            this.numero = numero;
        }
        if (email != "") {    
            this.email = email;
        }
    }

    public void mudarNumero(String numero) {
        if (numero != "") {
            this.numero = numero;
        }
    }

    public void mudarEmail(String email) {
        if (email != "") {    
            this.email = email;
        }
    }

    public String informaEmail() {
        return this.email;
    }

    public String informaNumero() {
        return this.numero;
    }
}
