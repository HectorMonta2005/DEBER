/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.libros;

/**
 *
 * @author KARLA
 */
public class Libro {
    
    private String marca;
    private String codigoProducto;
    private String numeroHojas;

    public Libro(String marca, String codigoProducto, String numeroHojas) {
        this.marca = marca;
        this.codigoProducto = codigoProducto;
        this.numeroHojas = numeroHojas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(String numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    @Override
    public String toString() {
        return "Libro{" + "marca=" + marca + ", codigoProducto=" + codigoProducto + ", numeroHojas=" + numeroHojas + '}';
    }
    
    
    
}
