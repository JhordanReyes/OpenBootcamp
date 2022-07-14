package com.mycompany.java;

/**
 * @author Jhordan
 */
public class Java {
    //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva 
    //el precio con el IVA incluido.
    public static void main(String[] args) {
        double precio = 19.99;
        double IVA = calcularIVA(precio);
        double precioTotal = precio + IVA;
        System.out.println("Precio: " + precio + "\nIVA: " + IVA + "\nTotal: " + precioTotal);
    }
    static double calcularIVA(double precio){
        double IVA = precio * 0.05;
        return IVA;
    }
}
