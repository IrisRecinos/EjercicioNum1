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
public class Libros {
//  Estos son nuestros atributos   
  private int Id;
  private String NombreLibros;
  private int NumeroPaginas;
  private String Autor;
  
//  Contructor 
  public Libros(int Id, String NombreLibros, int NumeroPaginas,String Autor){
//      Variables locales
      this.Id= Id;
      this.NombreLibros=NombreLibros;
      this.NumeroPaginas=NumeroPaginas;
      this.Autor=Autor;
}
//Esto estructura se utiliza para cambiar o midificar elementos
//  get = recuperar informacion
//  set = modificar informacion
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreLibros() {
        return NombreLibros;
    }

    public void setNombreLibros(String NombreLibros) {
        this.NombreLibros = NombreLibros;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "Id=" + Id + ", NombreLibros=" + NombreLibros + ", NumeroPaginas=" + NumeroPaginas + ", Autor=" + Autor + '}';
    }
    
    
  
    
    

}
       

    
    

    


  


    

