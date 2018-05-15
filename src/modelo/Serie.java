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
public class Serie extends Video {
    
    private int capitulos;
    private int temporada;

    public Serie(String titulo, String director, int annio, int capitulos, int temporada) {
        super(titulo, director, annio);
        this.capitulos = capitulos;
        this.temporada = temporada;
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

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    
}
