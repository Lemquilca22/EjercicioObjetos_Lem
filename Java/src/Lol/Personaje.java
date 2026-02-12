package Lol;

public class Personaje {
    String nom;
    String rolprincipal;
    String dificultad;
    String recursoutiliza;
    int vidamaxima;
    int danoataque;
    int poderhabilidad;
    int armadura;
    int resistenciamagica;

    public Personaje(String nom, String rolprincipal, String dificultad, String recursoutiliza, int vidamaxima, int danoataque, int poderhabilidad, int armadura, int resistenciamagica) {
        this.nom = nom;
        this.rolprincipal = rolprincipal;
        this.dificultad = dificultad;
        this.recursoutiliza = recursoutiliza;
        this.vidamaxima = vidamaxima;
        this.danoataque = danoataque;
        this.poderhabilidad = poderhabilidad;
        this.armadura = armadura;
        this.resistenciamagica = resistenciamagica;
    }
}
