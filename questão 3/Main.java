public class Main {
    public static void main(String args[]) {
        Agenda teste = new Agenda();
        teste.adicionarContato(27, 6, 2001, "Gus", "9", "gmail");
        teste.adicionarContato(27, 6, 2001, "Gusta", "9", "gmail");
        teste.adicionarContato(27, 6, 2001, "Gustavo", "9", "gmail");
        teste.removerContato("Gus");
    }
}
