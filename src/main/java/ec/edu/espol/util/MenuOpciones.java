/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.util;

import ec.edu.espol.model.Criterio;
import ec.edu.espol.model.Dueno;
import ec.edu.espol.model.Mascota;
import ec.edu.espol.model.Premio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MenuOpciones {
    
    private MenuOpciones(){}
    
    public static void menuOpciones(Scanner sc){
        int num = 0;
        while(num != 9){
            System.out.println("");
            System.out.println("**** [ MENU ] ****");
            System.out.println("");
            System.out.println("> 1. Dueño");
            System.out.println("> 2. Mascota");
            System.out.println("> 3. Concurso");
            System.out.println("> 4. Premio");
            System.out.println("> 5. Criterio");
            System.out.println("> 6. Inscripcion");
            System.out.println("> 7. MiembroJurado");
            System.out.println("> 8. Evaluacion");
            System.out.println("> 9. Salir");
            System.out.println("");
            System.out.println("-> Ingrese opcion:");
            num = sc.nextInt();
            switch(num){
                case 1: Dueno.nextDueno(sc);
                    break;
                case 2: Mascota.nextMascota(sc);
                    break;
                case 4: Premio.nextPremio(sc);
                    break;
                case 5: Criterio.nextCriterio(sc);
                    }        
            }
        }
    }
