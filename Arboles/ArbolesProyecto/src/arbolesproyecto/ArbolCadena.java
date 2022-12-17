/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesproyecto;

import java.util.Scanner;

/**
 *
 * @author tamar
 */
public class ArbolCadena {
    
    private NodoCadena raiz;
    NodoCadena padre;
    String dato, genero;
    
    public ArbolCadena(){
        raiz =null;
    }
    
    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(NodoCadena n, String busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDato().equals(busqueda)) {
            return true;
        } else if (busqueda.compareTo(n.getDato()) < 0) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }
    }

    private void ImprimirFemenino(NodoCadena n) {

        if (n == null) {
            return;
        }

        n.imprimirDato();
        ImprimirFemenino(n.getIzquierda());
        ImprimirFemenino(n.getDerecha());

        /* if (padre.getGenero()=="F") {
            if (padre.getGenero() == null) {
                System.out.println("h");
            } else {
                System.out.println("j");
            }
        
       /* if (padre.getGenero().equals("F")) {
            System.out.println(genero.equals("F"));
        }
            /*if(n.getGenero().equals("F")){
            return n.getDato();
        }
        System.out.println("Ingrese nodo: ");      
        this.insertar(dato.next() , genero.next());
             
        } else {
                System.out.println("si");
            }*/
    }
    
    public void AgregandoNodo( Scanner dato , Scanner genero) {

        System.out.println("Ingrese Nombre y despues Genero: ");      
        this.insertar(dato.next() , genero.next());
    }

    public void insertar(String dato, String genero) {
        if (this.raiz == null) {
            this.raiz = new NodoCadena(dato, genero);
        } else {
            this.insertar(this.raiz, dato, genero);
        }
    }

    private void insertar(NodoCadena padre, String dato, String genero) {
       
        if (padre.getGenero().equals("F")) {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new NodoCadena(dato,genero));
            } else {
                this.insertar(padre.getIzquierda(), dato,genero);
            }
        } else {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new NodoCadena(dato,genero));
            } else {
                this.insertar(padre.getDerecha(), dato,genero);
            }
        }
        
        /* 
        if (dato.compareTo(padre.getGenero()) > 0) {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new NodoCadena(dato,genero));
            } else {
                this.insertar(padre.getIzquierda(), dato,genero);
            }
        } else {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new NodoCadena(dato,genero));
            } else {
                this.insertar(padre.getDerecha(), dato,genero);
            }
        }*/
        
        
        /*if (dato.compareTo(padre.getDato()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new NodoCadena(dato,genero));
            } else {
                this.insertar(padre.getDerecha(), dato,genero);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new NodoCadena(dato,genero));
            } else {
                this.insertar(padre.getIzquierda(), dato,genero);
            }
        }*/
    }

    private void preorden(NodoCadena n) {
        
        if (n == null) 
            return;

            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        
       /* if (n != null) {
            n.imprimirDato();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }*/
    }

    private void inorden(NodoCadena n) {
        if (n == null) 
            return;
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        
        /*if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDato();
            inorden(n.getDerecha());
        }*/
    }

    private void postorden(NodoCadena n) {
        
        if (n == null) 
            return;
            postorden(n.getDerecha());
            postorden(n.getIzquierda());
            n.imprimirDato();
        
        /*if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }*/
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
    
    public void ImprimirFemenino() {
        this.ImprimirFemenino(this.raiz);
    }
    
}
