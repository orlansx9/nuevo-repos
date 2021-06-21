/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.compus.Cpu;
import ico.fes.compus.Monitor;
import ico.fes.compus.Mouse;
import ico.fes.compus.Teclado;

/**
 *
 * @author Orlando
 */
public class Computadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monitor Pant = new Monitor("HP", "WEF", 5);
        
        System.out.println(Pant);
        Mouse raton = new Mouse("HP", "NA-0933","Optico");
        
        System.out.println(raton);
        Teclado key = new Teclado("hp", "jkd489", 100, 2);
        
        System.out.println(key);
        Cpu gab = new Cpu("HP", "sik-62862", 3);
        System.out.println(gab);
        
        
    }
    
}
