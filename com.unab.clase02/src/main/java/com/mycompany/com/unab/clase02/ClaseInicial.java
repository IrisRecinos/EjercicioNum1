/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.com.unab.clase02;

/**
 *
 * @author iris recinos
 */
public class ClaseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libros ObjetoLibro1 = new Libros(1, "Programacion Java", 100, "Deitel");
        Libros ObjetoLibro2 = new Libros(1, "Programacion PHP", 600, "Deitel");
        
        ObjetoLibro1.setNumeroPaginas(800);
        
//        System.out.println(ObjetoLibro2.getNumeroPaginas());
     if (ObjetoLibro1.getNumeroPaginas()<ObjetoLibro2.getNumeroPaginas()){
         System.out.println("El libro 2 tiene mayor numero de paginas que el libro 1, el libro 2 tiene un total de paginas de  "+ObjetoLibro2.getNumeroPaginas());
         System.err.println("La informacion del libro 2 es "+ObjetoLibro2.toString());
        } else {
         System.err.println("El libro 1 tiene mayor numero de paginas que el libro 2, el libro 1 tiene un total de paginas de  "+ObjetoLibro1.getNumeroPaginas());
          System.err.println("La informacion del libro 1 es "+ObjetoLibro1.toString());
     }

    }

}
