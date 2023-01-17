import java.util.Scanner;

public class ConsoleFighters {
    Fighter hector;
    Fighter carlos;
    Fighter alex;
    Fighter josep;
    Fighter jaypee;

    Fighter fighter1;
    Fighter fighter2;

    static Scanner scanner = new Scanner(System.in);

    public void ejecutar() {
        inicializar();

        mostrar();

        while (true) {
            procesarEntrada();
            actualizarEstado();
            mostrar();

            if ((fighter1.ataque == 0 && fighter2.ataque == 0) || (fighter1.vida == 0 || fighter2.vida == 0)) {
                System.out.println("FIN DEL JUEGO");
                break;
            }
        }
    }

    private void mostrar() {
        fighter1.mostrar();
        fighter2.mostrar();
    }

    private void actualizarEstado() {
        fighter1.ataque -= fighter1.ataqueElegido;
        fighter1.defensa -= fighter1.defensaElegida;


        fighter2.ataque -= fighter2.ataqueElegido;
        fighter2.defensa -= fighter2.defensaElegida;

        if (fighter2.ataqueElegido > fighter1.defensaElegida) {
            fighter1.vida -= fighter2.ataqueElegido - fighter1.defensaElegida;
        }

        if (fighter1.ataqueElegido > fighter2.defensaElegida) {
            fighter2.vida -= fighter1.ataqueElegido - fighter2.defensaElegida;
        }
    }

    private void procesarEntrada() {
        System.out.println("P1 Introduce la cantidad de ataque y defensa que quieres usar (separados por un intro):");
        fighter1.elegirAtaqueyDefensa();

        System.out.println("P2 Introduce la cantidad de ataque y defensa que quieres usar (separados por un intro):");
        fighter2.elegirAtaqueyDefensa();
    }

    Fighter elegirLuchador(String quien){

        for (; ; ) {
            System.out.println("elige el " + quien +" jugador");
            int num = scanner.nextInt();

            if (num == 1) {
                return hector;
            } else if (num == 2) {
                return alex;
            } else if (num == 3) {
                return carlos;
            } else if (num == 4) {
                return josep;
            } else if (num == 5) {
                return jaypee;
            }
            System.out.println("Numero de lluitador incorrecte");
        }
    }

    private void inicializar() {
        hector = new Fighter("🎅", "Hector", 500, 500, 1000);
        alex = new Fighter("👶", "Alex", 999, 1, 1000);
        carlos = new Fighter("🤡", "Carlos", 600, 400, 1000);
        josep = new Fighter("👹", "Josep", 830, 170, 1000);
        jaypee = new Fighter("\uD83C\uDF08", "Jaypee", 1000000, 0, 1);

        fighter1 = elegirLuchador("primer");
        fighter2 = elegirLuchador("segundo");

    }
}