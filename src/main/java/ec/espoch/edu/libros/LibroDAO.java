/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.libros;

import java.util.List;

/**
 *
 * @author KARLA
 */
public interface LibroDAO {
    
    void agregarLibro(Libro libro);
    Libro obtenerPorCodigo(String codigoProducto);
    List<Libro> obtenerTodos();
    void actualizarLibro(Libro libro);
    
}
