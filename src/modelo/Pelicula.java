/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Pelicula extends Video {

    public Pelicula(String titulo, String director, int annio) {
        super(titulo, director, annio);
    }

    @Override
    public void setAnnio(int annio) {
        super.setAnnio(annio); 
    }

    @Override
    public int getAnnio() {
        return super.getAnnio(); 
    }

    @Override
    public void setDirector(String director) {
        super.setDirector(director); 
    }

    @Override
    public String getDirector() {
        return super.getDirector(); 
    }

    @Override
    public void setTitulo(String titulo) {
        super.setTitulo(titulo); 
    }

    @Override
    public String getTitulo() {
        return super.getTitulo(); 
    }
    
}
