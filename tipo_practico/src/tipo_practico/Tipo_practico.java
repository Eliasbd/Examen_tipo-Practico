/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo_practico;

import java.util.Scanner;

/**
 *
 * @author Hosanna
 */
public class Tipo_practico {

    Scanner tec = new Scanner(System.in);
    int opc;
    int numeros;
    int contador = 0;
    

    public Tipo_practico() {
        home();
    }
    
    public void home(){
        System.out.println("MENU PRINCIPAL");
        System.out.println();
        System.out.println("1. Ejercicio array unidemsional");
        System.out.println("2. Ejercicio array bidimensional");
        System.out.println();
        System.out.print("Elija → ");
        opc = tec.nextInt();
        
        while(opc == 0 || opc > 3){
           System.out.println();
           System.out.println("VALOR FUERA DE RANGO!!");
           System.out.print("Elija una nueva opcion → "); 
           opc = tec.nextInt();
        }
        
        if(opc == 1){
            num_aleatorio();
        }else if(opc == 2){
            bidimensionales callb = new bidimensionales();
            callb.newbidimensionales();
        }
        
        
    }
    
    public void num_aleatorio(){
      
   
       System.out.println("MENU De juego");
       System.out.println("1. Jugar");
       System.out.println("2. Salir");
       System.out.println();
       System.out.print("Elija → "); 
       opc = tec.nextInt();
  
           
       while(opc == 0 || opc > 2){
           System.out.println();
           System.out.println("VALOR FUERA DE RANGO!!");
           System.out.print("Elija una nueva opcion → "); 
           opc = tec.nextInt();
       }
        
       if(opc == 1){
            jugando();
            contador++;
       }  
  
    }
    public void jugando(){
        int num_magic [] = new int[10];
        int can = 0;
        int conteo = 0;
        int num;
        int end = 0;
         
         do{
             for(int i = 0; i < num_magic.length; i++){
              numeros = (int) (Math.random() * 50) + 1;
              num_magic[i] = numeros;
             } //Genero el numero aleatorio y lo coloco en el array
         
         System.out.println("Ingresa un numero = "); 
         num = tec.nextInt(); //Pido al Ususario que ingrese un valor
         
         while(num != num_magic[can] ){
             
             if((num - 2) == num_magic[can] || (num + 2) == num_magic[can] || (num + 1) == num_magic[can] || (num - 1) == num_magic[can] ){
                  
                    conteo++;
                  System.out.println("Estas CERCA!!! ");
                  System.out.println("Ingresa un numero = ");
                    num = tec.nextInt();
             }else{
                 conteo++;
                 System.out.println("Estas Lejos");
                 System.out.println("Ingresa un numero = ");
                 num = tec.nextInt();
             }
         }
         
          System.out.println("Lo encontraste !!");
          System.out.println("Numero de Intentos = " + conteo);
          
          
          System.out.println("Pasas al siguiente Nivel!");
          System.out.println("Seguir jugando?");
          System.out.println("1. Si");
          System.out.println("2. No");       
          System.out.print("Elija → "); 
          end = tec.nextInt();
          while(opc == 0 || opc > 2){
           System.out.println();
           System.out.println("VALOR FUERA DE RANGO!!");
           System.out.print("Elija una nueva opcion → "); 
           opc = tec.nextInt();
        }
          can++;
         }while(end != 2);
        
         
        
         
         
           
       
        
       
        
        
        
        
       
   
      
    }
    
    
    
    public static void main(String[] args) {
       Tipo_practico callt = new Tipo_practico(); 
      
    }
    
}
