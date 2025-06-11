/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.espoch.edu.libros;

/**
 *
 * @author KARLA
 */
public class LibroD {

    public static void main(String[] args) {
       LibroDAO libroDAO = (LibroDAO) new LibroImple();
        
        //Agregar libro
        libroDAO.agregarLibro(new Libro ("Normal","A125","145"));
        
        
        //Obtener libro por codigo
        Libro libro = libroDAO.obtenerPorCodigo("B123");
        System.out.println("Se encontro el cuaderno: "+ libro);
        
        //Mostrar todos los cuadernos
        for(Libro c: libroDAO.obtenerTodos()){
            System.out.println("\n"+c);
        }
        
        //Actualizar un cuaderno
       libroDAO.actualizarLibro(new Libro("Norma","B678", "345"));
        
        //Eliminar Cuaderno
        libroDAO.agregarLibro(new Libro ("Noraml","125","138"));
        
        //Mostrar lista despues de actualizar y eliminar
        System.out.println("Lista de cuadernos actualizada");
        for(Libro c : libroDAO.obtenerTodos()){
            System.out.println("\n"+c);
        }
    }
}
 
