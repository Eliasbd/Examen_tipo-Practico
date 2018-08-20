/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipo_practico;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hosanna
 */
public class bidimensionales {
    
    Scanner tec = new Scanner(System.in);
    String presidentes [][];
    int votos [][];
    int cantidad;

    public bidimensionales() {
        home();
    }
    
    public void home(){
        int opc;
        
        
        System.out.println("MENU");
        System.out.println("1. Ingresar Datos");
        System.out.println("2. Ver Resultados");
        System.out.println("3. Salir");
        System.out.println();
        System.out.print("elija → ");
        opc = tec.nextInt();
        
         while(opc == 0 || opc > 3){
           System.out.println();
           System.out.println("VALOR FUERA DE RANGO!!");
           System.out.print("Elija una nueva opcion → "); 
           opc = tec.nextInt();
        }
         
        if(opc == 1) {
           ingresar();
        }else if(opc == 2){
            mostrar();
        }
          
    }
    
    public void ingresar(){
        String name;
        String corriente;
        int copan = 0; int SB = 0; int cortes = 0; int comayagua = 0; int FM = 0; int Atlantida = 0;
        
        System.out.println("Ingrese los datos que se le pide");
        System.out.println();
        System.out.print("Ingrese la cantidad de Candidatos = ");
        cantidad = tec.nextInt();
        
        presidentes  = new String [cantidad][2];
        votos  = new int [cantidad][6];
        tec.nextLine();
        System.out.println();
        
        for(int i = 0 ; i < presidentes.length ; i++){
            for(int j = 0; j < presidentes[i].length ; j++){
                
               if(j == 0){
                    System.out.print("Ingrese la corriente del candidato = ");
                    corriente = tec.nextLine();
                    
                    presidentes[i][j] = corriente;
               }else{
                   System.out.print("Ingrese el nombre del candidato = ");
                   name = tec.nextLine();
                   presidentes[i][j] = name;
               }
            }
        }
        
        /*for(int i = 0 ; i < presidentes.length ; i++){
            for(int j = 0; j < presidentes[i].length ; j++){
                
                   System.out.print(presidentes[i][j]);
                    
               }
            System.out.println();
            }*/
        
        for(int i = 0 ; i < votos.length ; i++){
            for(int j = 0; j < votos[i].length ; j++){
                
               if(j == 0){
                    System.out.print("Ingrese la cantidad de votos del candidato " + (i+1) + " en copan →");
                    copan = tec.nextInt();
                    
                    votos[i][j] = copan;
                    
               }else if(j == 1){
                   System.out.print("Ingrese la cantidad de votos del  candidato" + (i+1) + " en Santa Barbara → ");
                   SB = tec.nextInt();
                   votos[i][j] = SB;
               }else if(j == 2){
                   System.out.print("Ingrese la cantidad de votos del candidato " + (i+1) + " en Cortes → ");
                   cortes = tec.nextInt();
                   votos[i][j] = cortes;
               }else if(j == 3){
                   System.out.print("Ingrese la cantidad de votos del candiadto" + (i+1) + " en Francisco Morazan → ");
                   FM = tec.nextInt();
                   votos[i][j] = FM;
               }else if(j == 4){
                   System.out.print("Ingrese la cantidad de votos del candidato " + (i+1) + " en Comayagua → ");
                   comayagua = tec.nextInt();
                   votos[i][j] = comayagua;
               }else if(j == 5){
                   System.out.print("Ingrese la cantidad de votos del candidato  " +(i+1) + " en Atlantida → ");
                   Atlantida = tec.nextInt();
                   votos[i][j] = Atlantida;
               }
            }
        }
        
        /*for(int i = 0 ; i < presidentes.length ; i++){
            for(int j = 0; j < presidentes[i].length ; j++){
                
                   System.out.print(presidentes[i][j] + " ");
                   
                    
                   
               }
             for(int x = 0 ; x < votos.length ; x++){
                        for(int s = 0; s < votos[x].length ; s++){
                
                            
                             System.out.print(votos[i][s] + " ");
                    
                    }
            System.out.println();
            }
            System.out.println();
            }*/
     
        
        home();
        
    }
    
    public void mostrar(){
        int result = 0;
        int us;
        
        
        for(int x = 0 ; x < votos.length ; x++){
               for(int s = 0; s < votos[x].length ; s++){
                         result += votos[x][s];
                         
                }
                
            System.out.println(Arrays.toString(presidentes[x]) + " total " + result);  
            result= 0;
               
            System.out.println();
         }
        home();
    }
            
    
    
    
    
    
    
    public void newbidimensionales(){
        bidimensionales callb = new bidimensionales();
    }
    
}
