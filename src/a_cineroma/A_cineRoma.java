
package a_cineroma;


public class A_cineRoma {

    public static void main(String[] args) {
 
        Cine AAA = new Cine("Rómulo s.a","Av. Libertador 345");
        
        Pelicula a1 = new Pelicula("La Historia Sin Fin","Wolfgang Petersen",102);
        Pelicula a2 = new Pelicula("El Mago de OZ","Victor Fleming",102);
        Pelicula a3 = new Pelicula("Terminator","James Cameron",107);
        Pelicula a4 = new Pelicula("El Rey Leon","Roger Allers y Rob Minkoff",88);
        Pelicula a5 = new Pelicula("El Rey Leon","Roger Allers y Rob Minkoff",108);

        AAA.agregarPelicula(a1);
        AAA.agregarPelicula(a2); 
        AAA.agregarPelicula(a3);
        AAA.agregarPelicula(a4);
        AAA.agregarPelicula(a5);
        

        AAA.listarOrdenadasPorTituloAZ();
    }
    
}
