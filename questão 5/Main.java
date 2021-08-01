public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();

        for (int i = 0; i < 50; i++) {
            controle.aumentarVolume();
        }

        controle.diminuirVolume();

        controle.mudarCanal(7);

        for (int i = 0; i < 3; i++) {
            controle.canalAcima();
        }

        controle.canalAbaixo();

        int[] valores = controle.getValores();

        System.out.printf("Canal: %d, Volume: %d", valores[0], valores[1]);
    }
}
