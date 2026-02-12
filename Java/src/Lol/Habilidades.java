package Lol;

public class Habilidades {
    String nombre;
    String descripcion;
    String tecla;
    int costerecurso;
    int enfriamiento;
    int nivel;

    public Habilidades(String nombre, String descripcion, String tecla, int costerecurso, int enfriamiento, int nivel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tecla = tecla;
        this.costerecurso = costerecurso;
        this.enfriamiento = enfriamiento;
        this.nivel = nivel;
    }
}
