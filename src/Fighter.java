import java.util.Scanner;

public class Fighter {

    String avatar;
    String nombre;
    int ataque;
    int defensa;
    int vida;

    int ataqueElegido;
    int defensaElegida;

    public Fighter(String avatar, String nombre, int ataque, int defensa, int vida) {
        this.avatar = avatar;
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
    }

    void mostrar() {
        System.out.println(avatar + " " + nombre + " \uD83D\uDDE1 " + ataque + " \uD83D\uDEE1 " + defensa + "  ❤ " + vida);
    }

    void mostrarNombreYAvatar(){
        System.out.println(avatar + " " + nombre);
    }

    void elegirAtaqueyDefensa(){
        ataqueElegido = ConsoleFighters.scanner.nextInt();
        defensaElegida = ConsoleFighters.scanner.nextInt();
    }
}
