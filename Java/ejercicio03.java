package com.mycompany.java;

/**
 * @author Jhordan
 */
public class Java {

    public static void main(String[] args) {
        String[] animales = {"Perro","Gato","Rana"};
        String texto = "";
        for(String animal: animales){
            texto = texto + " " +  animal;
        }
        System.out.println(texto);
    }
}
