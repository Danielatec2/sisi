/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_6;

import javax.swing.JOptionPane;

/**
 *
 * @author danii
 */
public class EjemploPila {
   
    private static final int size = 5; //final no se puede mover el valor
    private int top;
    Object[] onepice; //Object permite cualquier tipo de dato primitivo
//    EjemploPila pila = new EjemploPila();

    public EjemploPila() {
        top = -1;
        onepice = new Object[size];
    }

    public void insertar(Object element) throws Exception {
        if (pilaLlena()) {
            throw new Exception("Pila llena.Intenta de nuevo mas tarde");
        }
        top++; //agregar un valor
        onepice[top] = element;
    }

    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("Pila vacia.Intentar de nuevo más tarde");
        }
        aux = onepice[top];
        top--;
        return aux;
    }

    public void limpiarPila() {
        top = -1;

    }

    public Object topPila() throws Exception {
        if (pilaVacia()) {
            throw new Exception("Pila vacia.Intentar de nuevo más tarde");
        }
        return onepice[top];
    }
  
    public boolean pilaVacia(){
        return top == -1;
    }
    public boolean pilaLlena(){
        return top == size -1; //si mi top = al tamaño de mi arreglo ya esta lleno
    }
    public void mostrarPila() {
    if (pilaVacia()) {
        System.out.println("La pila está vacía.");
        return;
    }else

    System.out.println("Valores de la pila:");
    for (int i = top; i >= 0; i--) {
        // for(int i=0; i<onepice.length; i++){
        System.out.println(onepice[i]);
    }
}
}
