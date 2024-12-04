
package a_cineroma;

import java.util.Objects;

public class Pelicula {
    
    private String titulo;
    private String director;
    private int duracion;

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
   @Override 
   public String toString(){
   
    return "---------------------------------"+"\n" +
           " Título   = " + titulo + "\n" +
           " Director = " + director + "\n" +
           " Duración = " + duracion +" min"+ "\n" +
           "---------------------------------"+"\n" ;      
   }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        return Objects.equals(this.titulo, other.titulo);
    }
    
}//fin class
