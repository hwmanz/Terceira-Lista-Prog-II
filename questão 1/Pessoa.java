import java.util.Calendar;

public class Pessoa {
    private int idade;
    private int dia;
    private int mes;
    private int ano;
    private String nome;

    public Pessoa(int dia, int mes, int ano, String nome) {
        Calendar agora = Calendar.getInstance();
        int diaHoje = agora.get(Calendar.DAY_OF_MONTH);
        int mesHoje = agora.get(Calendar.MONTH) + 1; // meses começam a contar de zero
        int anoHoje = agora.get(Calendar.YEAR);
        
        if (nome != "") {
            this.nome = nome;
        };

        if (dia < 31 && dia > 1) {
            this.dia = dia;
        }

        if (mes < 12 && mes > 1) {
            this.mes = mes;
        }

        this.ano = ano;

        this.calcularIdade(diaHoje, mesHoje, anoHoje);
    }

    public void atualizarIdade() {
        Calendar agora = Calendar.getInstance();
        int diaHoje = agora.get(Calendar.DAY_OF_MONTH);
        int mesHoje = agora.get(Calendar.MONTH) + 1; // meses começam a contar de zero
        int anoHoje = agora.get(Calendar.YEAR);

        this.calcularIdade(diaHoje, mesHoje, anoHoje);
    }

    private void calcularIdade(int diaHoje, int mesHoje, int anoHoje) {
        int idade = anoHoje - this.ano;

        if (mesHoje < this.mes) {
            idade--;
        } else if (mesHoje == this.mes) {
            if (diaHoje < this.dia) {
                idade--;
            }
        }

        this.idade = idade;
    }

    public String informaNome() {
        return this.nome;
    }

    public int informaIdade() {
        return this.idade;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        Calendar agora = Calendar.getInstance();
        int diaHoje = agora.get(Calendar.DAY_OF_MONTH);
        int mesHoje = agora.get(Calendar.MONTH) + 1; // meses começam a contar de zero
        int anoHoje = agora.get(Calendar.YEAR);

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        calcularIdade(diaHoje, mesHoje, anoHoje);
    }
}