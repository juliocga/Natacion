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
public class Natacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,menu=5,menu2=7,menu3=7,num_deportistas=0,documento=0,pos_depor=30,salir=0;
        Scanner lector = new Scanner (System.in);
        Pruebas nadadores[] = new Pruebas[20];
        for (i=0;i<20;i++){
            nadadores[i]=new Pruebas();
           
        }
        while(menu!=4){
          do{
              System.out.println("----Bienvenido a la competencia de natacion----");
                System.out.println("---Ingrese la operacion a realizar:");
             System.out.println("1.Ingrasar deportista");
             System.out.println("2.Deportista");
             System.out.println("3.Mostrar prueba");
             System.out.println("4.Salir");
             menu=lector.nextInt();
          }while(menu>4);
          
          switch(menu){
              case 1: System.out.println("Se permiten maximo 20 deportistas.");
                      System.out.println("Deportistas inscritos: "+num_deportistas);
                      nadadores[num_deportistas].load_deportista();
                      num_deportistas++;
                      break;
              
               case 2: System.out.println("Ingrese el documento del deportista (sin caracteres).");
                      documento=lector.nextInt();
                      for(i=0;i<20;i++){
                          if(nadadores[i].getDocumento()==documento){
                              pos_depor=i;
                              break;
                          }
                      }
                      if(pos_depor!=30){
                         
                         System.out.println("El deportista esta en la base de datos.");
                          while(menu2!=6 && salir==0){
                                menu2=7;
                                do{
                                   System.out.println("---Ingrese la operacion a realizar:");
                                   System.out.println("1.Ver datos del deportista");
                                   System.out.println("2.Actualizar deportista");
                                   System.out.println("3.Eliminar deportista");
                                   System.out.println("4.Inscribir nadador a una prueba");
                                   System.out.println("5.Eliminar nadador de una prueba");
                                   System.out.println("6.Salir");
                                   menu2=lector.nextInt();
                                }while(menu2>6);
                                switch (menu2){
                                    case 1: nadadores[pos_depor].ver_datos();
                                        break;
                                    case 2: nadadores[pos_depor].actualizar();
                                        break;
                                    case 3: nadadores[pos_depor].eliminar();
                                            for(i=pos_depor;i<19;i++){
                                                nadadores[i]=nadadores[i+1];
                                                if(i==18 && num_deportistas==20){
                                                   nadadores[19].eliminar(); 
                                                }
                                            }
                                            num_deportistas--;
                                            salir=1;
                                        break;
                                    case 4: nadadores[pos_depor].prueba();
                                        break;
                                    case 5: nadadores[pos_depor].eliminar_prueba();
                                        break;
                                    default:
                                        break;
                                }
                                
                          }
                          salir=0;
                          pos_depor=30;
                          menu2=7;
                      }else{
                         System.out.println("El deportista no esta en la base de datos.");
                      }
                      break;
               case 3: 
                    while(menu3!=5){
                        menu3=7;
                                do{
                                   System.out.println("---Ingrese la prueba:");
                                   System.out.println("1.Libre");
                                   System.out.println("2.Mariposa");
                                   System.out.println("3.Pecho");
                                   System.out.println("4.Espalda");
                                   System.out.println("5.Salir");
                                   menu3=lector.nextInt();
                                }while(menu3>5);
                                switch(menu3){
                                    case 1:
                                            System.out.println("Depostistas para prueba estilo libre.");
                                            for(i=0;i<20;i++){
                                                if(nadadores[i].getLibre()==1){
                                                    System.out.println(nadadores[i].getNombre());
                                                }
                                            }
                                            break;
                                    case 2:
                                            System.out.println("Depostistas para prueba estilo mariposa.");
                                            for(i=0;i<20;i++){
                                                if(nadadores[i].getMariposa()==1){
                                                    System.out.println(nadadores[i].getNombre());
                                                }
                                            }
                                            break;
                                    case 3:
                                            System.out.println("Depostistas para prueba estilo Pecho.");
                                            for(i=0;i<20;i++){
                                                if(nadadores[i].getPecho()==1){
                                                    System.out.println(nadadores[i].getNombre());
                                                }
                                            }
                                            break;
                                    case 4:
                                            System.out.println("Depostistas para prueba estilo espalda.");
                                            for(i=0;i<20;i++){
                                                if(nadadores[i].getEspalda()==1){
                                                    System.out.println(nadadores[i].getNombre());
                                                }
                                            }
                                            break;
                                    default:
                                            break;
                                }
                    }
                    menu3=7;
                    
               default:
                        break;
          }
          
        }
    }
    
}
