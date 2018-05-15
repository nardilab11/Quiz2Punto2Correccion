/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Sitio {
    private File archivo = new File("Sitio");
    private ArrayList<Video> videos;

    public Sitio() {
        this.videos = new ArrayList();
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
    
    public void addVideo(Video video){
        videos.add(video);
        try {
            FileWriter escritura = new FileWriter(archivo);
            escritura.write(this.videos.size() + "/n");
            if(video instanceof Serie){
                
                escritura.write("S, " + ((Serie)video).getTitulo() + ", " +((Serie)video).getDirector() + ", " +((Serie)video).getAnnio() + ", " + ((Serie)video).getCapitulos() + ", " + ((Serie)video).getTemporada() + "/n");
            }
            if(video instanceof Pelicula){
                escritura.write("P, " + video.getTitulo() + ", " + video.getDirector() + ", " + video.getAnnio() + "/n");
            }
            else{
                Documental d = null;
                video = d;
                escritura.write("D, " + video.getTitulo() + ", " + video.getDirector() + ", " + video.getAnnio() + ", " + video.getGenero() + "/n");
            }
        } catch (IOException ex) {
            System.out.println("Archivo no existe");
        }
        
    }
    
    public void cargarArchivo(File archivo){
        try {
            Scanner lectura = new Scanner(archivo);
            lectura.useDelimiter(",");
            while(lectura.hasNext()){
            if(lectura.next().equals("S")){
                lectura.next();
                for(int i = 0; i < 5; i++){
                    if(i == 0){
                       String titulo = lectura.next();
                    }
                     if(i == 1){
                       String director = lectura.next();
                    }  
                     if(i == 2){
                       int annio = lectura.nextInt();
                    }
                     if(i == 3){
                       int capitulos = lectura.nextInt();
                    }
                     if(i == 4){
                       int temporada = lectura.nextInt();
                    }
                }
                
                Serie s = new Serie(titulo,director,annio,capitos,temporada);
            }
            if(lectura.next().equals("P")){
                lectura.next();
                for(int i = 0; i < 3; i++){
                    if(i == 0){
                       String titulo = lectura.next();
                    }
                     if(i == 1){
                       String director = lectura.next();
                    }  
                     if(i == 2){
                       int annio = lectura.nextInt();
                    }
                     
                }
                Pelicula p = new Pelicula(titulo,director,annio);
            } 
                if(lectura.next().equals("D")){
                lectura.next();
                String[] linea = new String[3];
                int a;
                for(int i = 0; i < 4; i++){
                    
                       linea[i] = lectura.next(); 
                    
                       a = lectura.nextInt();
                    
                    
                }
                Documental d = new Documental(linea[0],linea[1],a,linea[3]);
            }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no existe");
                
        }
        
    }
    public void darInfo(String nombre){
        for(int i = 0; i < videos.size(); i++){
            if(videos.get(i).getTitulo().equals(nombre)){
                System.out.println("Titulo: " + videos.get(i).getTitulo());
                System.out.println("Director: " + videos.get(i).getDirector());
                System.out.println("Annio: " + videos.get(i).getAnnio());
                break;
            }
        }
    }
    public void listarSeries(){
        for(int i = 0; i < videos.size(); i++){
            if(videos.get(i) instanceof Serie){
                int contador = 1;
                System.out.println("Serie " + contador + ": " + videos.get(i).getTitulo());
            }
        }
    }
}
