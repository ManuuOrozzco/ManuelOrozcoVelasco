/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cluedo;

import java.util.Scanner;

/**
 *
 * @author MEDAC
 */
public class Cluedo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Personaje[] Personajes=new Personaje[6];
      rellenar(Personajes);
      int random=(int)(Math.random()*6);
      Personajes[random].setCulpable(true);
       int resp=0;
       String nombre;
       Scanner sc=new Scanner(System.in);
             int ra=0;
                  int cont=6;
       
      do {
          System.out.println("1.pregunatar 2.acusar 3.salida");
          resp=sc.nextInt();
          
          switch (resp) {
              case 1:
            
                  mostrar(Personajes);
                  System.out.println("Introduce nombre");
                  nombre=sc.next();
                   for (int i=0;i<Personajes.length;i++){
                       if (Personajes[i]!= null && Personajes[i].getNombre().equalsIgnoreCase(nombre)){
                           System.out.println(Personajes[i].getUbicacion());
                       }
                   }
                  
                   do{
                    ra=   (int)(Math.random()*6);
                   }while ((Personajes[ra]== null )|| (random==ra));
                   System.out.println("asesino mata "+Personajes[ra]);
                   Personajes[ra]=null;
                   cont--;
                   if (cont<3){
                       resp=3;
                       System.out.println("asesino gana");
                   }
                   
                  break;
              case 2:
                    mostrar(Personajes);
                    System.out.println(" quien quieres acusar");
                    nombre=sc.next();
                     for (int i=0;i<Personajes.length;i++){
                       if (Personajes[i]!= null && Personajes[i].getNombre().equalsIgnoreCase(nombre)){
                          if (Personajes[i].getCulpable()){
                              System.out.println("he ganado");
                          }else {
                              System.out.println("he perdido");
                              System.out.println(Personajes[i].getNombre());
                          }
                          resp=3;
                              
                          }
                       }
                    
                  break;
              case 3:
                  System.out.println("estamos saliendo");
                  break;
              default: System.out.println("El numero no esta valida");
          }
          
      }while(resp!=3);
      
    }
    
   public static void rellenar(Personaje[] Personajes){
       String []nombres={"mayordomo" , "jardinera", "sr","sra","chofer","cocinera"};
       for (int i=0;i<Personajes.length;i++){
           Personajes[i]=new Personaje(nombres[i]);
       }
   }

    private static void mostrar(Personaje[] Personajes) { //solo quien estan viva
        for (int i=0;i<Personajes.length;i++){
           if (Personajes[i]!= null){
               System.out.println(Personajes[i]+"||");
           }
        }
    }
    
    
    
    
}
