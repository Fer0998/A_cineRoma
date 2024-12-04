
package a_cineroma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;


public class Cine {
    
    private String nombre;
    private String direccion;
    private HashSet<Pelicula> proyecciones;

public Cine(String nombre, String direccion) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.proyecciones = new HashSet();
  
    }
//-----------------------------------------------------------------------------
public void agregarPelicula(Pelicula peli){
// Agrega una nueva película al conjunto de proyecciones del cine.    

    proyecciones.add(peli);
}
//----------------------------------------------------------------------------
public void listarTodo(){
// Muestra todas las películas en el conjunto de proyecciones.

    for (Pelicula p:proyecciones){
        System.out.println(p);
    }
}
//----------------------------------------------------------------------------
public void listarDuranMas(int h){
// Lista las películas cuya duración es mayor a la indicada en horas.

    for (Pelicula p: proyecciones){
        if (p.getDuracion()> h){
            System.out.println(p);
        }
    }
}
//----------------------------------------------------------------------------
public void listarMenorDuracionAMayorDuracion(){
// Lista las películas ordenadas de menor a mayor duración.

    ArrayList<Pelicula> ArrPeli = new ArrayList(proyecciones);   
    Comparator<Pelicula> MenorAMayorDuracion = new Comparator<Pelicula>(){@Override
    
    public int compare(Pelicula p1, Pelicula p2){
                if(p1.getDuracion()< p2.getDuracion())return -1;
                if(p1.getDuracion()== p2.getDuracion())return 0;
                return 1;
    }
    };   
    Collections.sort(ArrPeli, MenorAMayorDuracion);
    
    for (Pelicula p : ArrPeli){
        System.out.println(p);
    }
}
//----------------------------------------------------------------------------
public void listarOrdenadasPorTituloAZ(){
// Lista las películas ordenadas alfabéticamente por título.

    ArrayList<Pelicula> ArrPeli = new ArrayList(proyecciones);   

   Comparator<Pelicula> OrdenadasPorTitulo = new Comparator<Pelicula>(){@Override
    
    public int compare(Pelicula p1, Pelicula p2){
        return p1.getTitulo().compareTo(p2.getTitulo());
    }
    };   
    Collections.sort(ArrPeli, OrdenadasPorTitulo);
    
    for (Pelicula p : ArrPeli){
        System.out.println(p);
    }
}
//----------------------------------------------------------------------------
public void listarOrdenadasPorDirectorAZ(){
 // Lista las películas ordenadas alfabéticamente por director.
 
   ArrayList<Pelicula> ArrPeli = new ArrayList(proyecciones);   
   Comparator<Pelicula> OrdenadasPorDirector = new Comparator<Pelicula>(){@Override
    
    public int compare(Pelicula p1, Pelicula p2){
        return p1.getDirector().compareTo(p2.getDirector());
    }
    };   
    Collections.sort(ArrPeli, OrdenadasPorDirector);
    
    for (Pelicula p : ArrPeli){
        System.out.println(p);
    }
}


}//fin class
