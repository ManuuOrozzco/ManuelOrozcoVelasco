/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cluedo;

/**
 *
 * @author MEDAC
 */
public class Personaje {
    //attributos
    private String nombre;
    private String ubicacion;
    private boolean culpable;
    
    
    // Constraturs
    
    public Personaje(String nombre) {
        this.nombre = nombre;
        culpable=false;
        switch (nombre){
            case"mayordomo":
                ubicacion="jardin";
                break;
            case"jsrdinera":
                ubicacion="teraza";
                break;
            case"sr":
                ubicacion="despacho";
                break;
            case"sra":
                ubicacion="dormitorio";
                break;
            case"chofer":
                ubicacion="cochera";
                break;
            case"cocinera":
                ubicacion="cocina";
                break;
                
        }
    }
    
    
    //Method

    public boolean getCulpable() {
        return culpable;
    }
    

   

    public void setCulpable(boolean culpable) {
        this.culpable = culpable;
    }
    
     public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        int random=(int)(Math.random()*6);
        String[] ubicacions= {"salon","teraza", "despacho","dormiterio", "cochera", "cocina"};
        if (culpable){
        return ubicacions[random];    
        }else{
            return ubicacion;
        }
        
    }
     
     

    @Override
    public String toString()  {
        return nombre;
    }  
}
