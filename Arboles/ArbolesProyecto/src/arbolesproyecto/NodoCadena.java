/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesproyecto;

/**
 *
 * @author tamar
 */
public class NodoCadena {
    
     private String dato, genero;
    private NodoCadena izquierda, derecha;

    public NodoCadena(String dato, String genero) {
        this.dato = dato;
        this.genero = genero;
        this.izquierda = this.derecha = null;
    }

    NodoCadena() {
    }

    public String getDato() {
        return dato;
    }
    
    public String getGenero() {
        return genero;
    }


    public NodoCadena getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoCadena izquierda) {
        this.izquierda = izquierda;
    }

    public NodoCadena getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoCadena derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println("Nombre: "+this.getDato() +"   Genero:  "+ this.getGenero());
    }
    
}
