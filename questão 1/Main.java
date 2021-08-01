public class Main {
    public static void main(String args[]) {
        Pessoa einstein = new Pessoa(14, 3, 1879, "Albert Einstein");
        Pessoa newton = new Pessoa(4, 1, 1643, "Isaac Newton");

        System.out.printf("Idade de Einstein caso estivesse vivo: %d anos\n", einstein.informaIdade());
        System.out.printf("Idade de Newton caso estivesse vivo: %d anos\n", newton.informaIdade());
    }
}
