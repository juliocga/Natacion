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
public class Deportista {
    protected String nombre;
    protected int documento;
    protected  String rama;
    protected String fecha;

    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }
   
   
    public void load_deportista(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Datos del deportista:");
        System.out.println("Ingrese el nombre completo:");
        nombre=lector.nextLine();
        System.out.println("Ingrese documento de identidad:");
        documento=lector.nextInt();
        System.out.println("Ingrese la rama (masculino o femenino):");
        rama=lector.next();
        lector.nextLine();
        System.out.println("Ingrese la fecha de nacimiento:");
        fecha=lector.next();
    } 
    
    public void actualizar(){
        int menu=9;
        Scanner lector = new Scanner (System.in);
        while(menu!=5){
            menu=9;
            do{
               System.out.println("Ingrese el numero del parametro a actualizar:");
               System.out.println("1.Nombre");
               System.out.println("2.Documento de identidad");
               System.out.println("3.Rama");
               System.out.println("4.Fecha de nacimiento");
               System.out.println("5.Salir");
               menu=lector.nextInt();
            }while(menu>5);
            switch(menu){
                case 1:
                    lector.nextLine();    
                    System.out.println("Ingrese el nombre completo:");
                    nombre=lector.nextLine();
                    break;
                case 2:
                        System.out.println("Ingrese el documento de identidad:");
                        documento=lector.nextInt();
                     break;
                case 3:
                        lector.nextLine(); 
                        System.out.println("Ingrese la edadrama (masculino o femenino):");
                        rama=lector.nextLine();
                    break;
                case 4:
                        lector.nextLine(); 
                        System.out.println("Ingrese la fecha de nacimiento:");
                        fecha=lector.nextLine();
                        break;
                default:
                    break;
            }
        }
    }
    
    public void eliminar(){
        System.out.println("El deportista "+nombre+" fue eliminado.");
        nombre="";
        documento=0;
        rama="";
        fecha="";
    }
    
    
    
}
