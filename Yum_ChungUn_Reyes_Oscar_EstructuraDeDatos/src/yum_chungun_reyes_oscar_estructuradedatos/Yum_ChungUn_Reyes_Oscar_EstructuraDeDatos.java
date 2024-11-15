/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_reyes_oscar_estructuradedatos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Yum_ChungUn_Reyes_Oscar_EstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner (System.in);
        int opcionUsuario=0,Escoge, letrasCorrectas = 0, intent = 5, cont = 0; char Res; String Palabra;
        Random R = new Random();
        String palabrasUsuario ;
        String[] Palabras = {"juicio","cuarto","rojizo","musica","computadora","quinto", "ojo","quimico","anarquia","cinta"};
        
        do{
        System.out.println("Selecciona tu modo de juego:\n1.Jugar = Con este modo de juego adivinas palabras predeterminadas, si deseas cambiarlo elige la opcion 2\n2.Cambiar palabras\n3.Salir");
        opcionUsuario=S.nextInt(); 
        S.nextLine();
        
        switch(opcionUsuario){
        
            case 1: 

                Escoge = R.nextInt(3);
                System.out.print(Palabras[Escoge]);
                Palabra = Palabras[Escoge];  
                char[] Omitido = new char[Palabra.length()];

                for (int i = 0; i < Palabra.length(); i++){
                        Omitido[i] = '_';
                        
                }
                

                while(intent != 0 ) {
                    System.out.println("Adivine la palabra: \n Intentos disponibles: " + intent + " \n");

                    for (int i = 0; i < Palabra.length(); i++){
                        System.out.print(Omitido[i] + " ");
                    }    

                    String letra = S.next();
                    Res = letra.charAt(0);

                    for (int i = 0; i < Palabra.length(); i++){
                        if (Res == Palabra.charAt(i)){
                            Omitido[i] = Palabra.charAt(i);
                            cont++;
                        }

                    }

                    for (int i = 0; i < Palabra.length(); i++){
                        if (Omitido[i] != '_'){
                           letrasCorrectas++; 
                        }
                    }
                    if (letrasCorrectas == Palabra.length()){

                        for (int i = 0; i < Palabra.length(); i++){
                        System.out.print(Omitido[i] + " ");
                        }

                        System.out.println("\n Ganaste!!!");
                        System.exit(0);
                    }


                    if (cont == 0){
                        intent--;
                    }
                    cont = 0;
                    System.out.print("Intentos disponibles: " + intent + " \n");

                    for (int i = 0; i < Palabra.length(); i++){
                        System.out.print(Omitido[i] + " ");
                    }

                    letrasCorrectas = 0;
                }
                System.out.println("perdiste womp womp");
                break;

            
                
            case 2:
                
                System.out.println("Ingrese sus 10 palabras: ");
                for(int i=0; i<Palabras.length;i++){
                System.out.println("Ingrese la palabra " + (i+1));
                palabrasUsuario= S.next();
                Palabras[i] = palabrasUsuario;
                }
                
                for(int i=0; i<Palabras.length;i++){
                System.out.println(Palabras[i]);
                }
                
                System.out.println("Palabras actualizadas..");
                break;
                
               
            case 3:
                
                System.out.println("Saliendo...");
                System.exit(0);
        
        }
        
        }while(opcionUsuario!=3);
        
    }
    
}
