/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Cancion;

/**
 *
 * @author Laura carolina Ibace
 */
public class main_cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo(" cualquiera");
        cancion1.setAutor("alguien");
        
        cancion1.getTitulo();
        cancion1.getAutor();
        
        System.out.println(cancion1.getTitulo());
        System.out.println(cancion1.getAutor());
        
        
    }
    
}
