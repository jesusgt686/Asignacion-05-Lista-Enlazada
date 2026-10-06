/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author david
 */
public class ListaEnlazada<T> implements IList<T>, Iterable<T>{

    protected NodoSimple<T> inicio;
    protected int nElementos;
    
    public ListaEnlazada() {
        this.inicio = null;
        this.nElementos = 0;
    } 

    private class NodoSimple<T>{
        private T dato;
        private NodoSimple<T> sig;
        
        public NodoSimple(T dato) {
            this.dato = dato;
            
        }
    }

    @Override
    public void append(T elements) throws ListException {
        NodoSimple<T> nodoNuevo = new NodoSimple<>(elements);
        NodoSimple<T> nodo = inicio;
        
        if (nodo == null) {
            inicio = nodoNuevo;
            
        } else{
            
            while (nodo.sig != null) {                
                nodo = nodo.sig;
            }
            
            nodo.sig = nodoNuevo;
        
        }
        
        nElementos++;
    }

    @Override
    public void insert(T elements, int index) throws ListException {
        if (index < 0 || index > nElementos) {
            throw new ListException("Indice fuera de limite");
        }
        
        NodoSimple<T> nodoNuevo = new NodoSimple<>(elements);
        
        if (index == 0) {
            nodoNuevo.sig = inicio;
            inicio = nodoNuevo;
        } else {
            NodoSimple<T> nodoPrevio = inicio;
            
            for (int i = 0; i < index - 1; i++) {
                nodoPrevio = nodoPrevio.sig;
            }
            
            nodoNuevo.sig = nodoPrevio.sig;
            nodoPrevio.sig = nodoNuevo;
        }
        
        nElementos++;
    }

    @Override
    public T remove(int index) throws ListException {
        if (index < 0 || index >= nElementos) {
            throw new ListException("Indice fuera de limites");
        }
        
        T datoRemovido;
        
        if (index == 0) {
            datoRemovido = inicio.dato;
            inicio = inicio.sig;
            
        } else {
            NodoSimple<T> nodoPrevio = inicio;
            
            for (int i = 0; i < index - 1; i++) {
                nodoPrevio = nodoPrevio.sig;
            }
            
            NodoSimple<T> nodoBorrar = nodoPrevio.sig;
            datoRemovido = nodoBorrar.dato;
            
            nodoPrevio.sig = nodoBorrar.sig;
        }
        
        nElementos--;
        return datoRemovido;
    }

    @Override
    public boolean removeObj(T element) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int indexOf(T elements) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T get(int index) throws ListException {
        if (index < 0 || index >= nElementos) {
            throw new ListException("Indice fuera de limites");
        }
        
        NodoSimple<T> nodoActual = inicio;
        
        for (int i = 0; i < index; i++) {
            nodoActual = nodoActual.sig;
        }
        
        return nodoActual.dato;
    }
    
    public void invertir(){
        if (inicio == null || inicio.sig == null) {
            return;
        }
        
        NodoSimple<T> anterior = null;
        NodoSimple<T> actual = inicio;
        NodoSimple<T> siguiente = null;
        
        while (actual != null) {            
            siguiente = actual.sig;
            
            actual.sig = anterior;
            
            anterior = actual;
            actual = siguiente;
        }
        
        inicio = anterior;
    }
    
    public void concatenar(ListaEnlazada<T> otraLista){
        if (otraLista == null || otraLista.inicio == null) {
            return;
        }
        
        NodoSimple<T> ultimo = this.inicio;
        if (ultimo != null) {
            while (ultimo.sig != null) {                
                ultimo = ultimo.sig;
            }
        }
        
        NodoSimple<T> actualOtra = otraLista.inicio;
        
        while (actualOtra != null) {            
            NodoSimple<T> nodoNuevo = new NodoSimple<>(actualOtra.dato);
            
            if (this.inicio == null) {
                this.inicio = nodoNuevo;
                ultimo = nodoNuevo;
            } else {
                ultimo.sig = nodoNuevo;
                ultimo = nodoNuevo;
            }
            this.nElementos++;
            
            actualOtra = actualOtra.sig;
        }
    }

    @Override
    public void set(T elements, int index) throws ListException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void clear() {
        inicio = null;
        nElementos = 0;
    }

    @Override
    public boolean empty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
        return nElementos;
    }

    @Override
    public java.util.Iterator<T> Iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public java.util.Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
