/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natacion;

import java.util.Scanner;

/**
 *
 * @author Julioc
 */
public class Pruebas extends Deportista {
    protected int libre;
    protected int mariposa;
    protected int pecho;
    protected int espalda;

    public Pruebas() {
        libre = 0;
        mariposa = 0;
        pecho = 0;
        espalda = 0;
    }

    public int getLibre() {
        return libre;
    }

    public int getMariposa() {
        return mariposa;
    }

    public int getPecho() {
        return pecho;
    }

    public int getEspalda() {
        return espalda;
    }
    
    
    public void prueba(){
        int menu=9;
        Scanner lector = new Scanner (System.in);
        while(menu!=5){
            menu=9;
            do{
               System.out.println("Ingrese el numero de la prueba a inscribirse:");
               System.out.println("1.Libre");
               System.out.println("2.Mariposa");
               System.out.println("3.Pecho");
               System.out.println("4.Espalda");
               System.out.println("5.Salir");
               menu=lector.nextInt();
            }while(menu>5);
            switch(menu){
                case 1:
                    System.out.println("El deportista "+nombre+" esta inscrito al estilo libre.");
                    libre=1;
                    break;
                case 2:
                    System.out.println("El deportista "+nombre+" esta inscrito al estilo mariposa.");
                    mariposa=1;
                     break;
                case 3:
                    System.out.println("El deportista "+nombre+" esta inscrito al estilo pecho.");
                    pecho=1;
                    break;
                case 4:
                    System.out.println("El deportista "+nombre+" esta inscrito al estilo espalda.");
                    espalda=1;
                        break;
                default:
                    break;
            }
        }
    }
    
    public void ver_datos(){
         System.out.println("Datos del deportista.");
         System.out.println("Nombre: "+nombre);
         System.out.println("Documento: "+documento);
         System.out.println("Rama: "+rama);
         System.out.println("Fecha de nacimiento: "+fecha);
         System.out.println("Edad: "+edad);
         if(edad>5 && edad<11){
             System.out.println("Categoria: InfantilA");
         }
         if(edad>10 && edad<18){
             System.out.println("Categoria: InfantilB");
         }
         if(edad>17 && edad<26){
             System.out.println("Categoria: Juvenil");
         }
         if(edad>25){
             System.out.println("Categoria: Senior");
         }
    }
    
    public void eliminar_prueba(){
        int menu=6;
         Scanner lector = new Scanner (System.in);
        while(menu!=5){
            menu=6;
            do{
               System.out.println("Ingrese el numero de la prueba a eliminar:");
               System.out.println("1.Libre");
               System.out.println("2.Mariposa");
               System.out.println("3.Pecho");
               System.out.println("4.Espalda");
               System.out.println("5.Salir");
               menu=lector.nextInt();
            }while(menu>5);
            switch(menu){
                case 1:
                    System.out.println("El deportista "+nombre+" fue eliminado del estilo libre.");
                    libre=0;
                    break;
                case 2:
                    System.out.println("El deportista "+nombre+" fue eliminado del estilo mariposa.");
                    mariposa=0;
                     break;
                case 3:
                    System.out.println("El deportista "+nombre+" esta eliminado al estilo pecho.");
                    pecho=0;
                    break;
                case 4:
                    System.out.println("El deportista "+nombre+" fue eliminado del estilo espalda.");
                    espalda=0;
                        break;
                default:
                    break;
            }
        }
    }
}
