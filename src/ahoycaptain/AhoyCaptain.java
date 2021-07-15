/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahoycaptain;

/**
 *
 * @author almeiro
 */
public class AhoyCaptain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    utilities uti = new utilities();
    String criatura = uti.showCriatures();
    String direction = uti.showDirection();
        String d = null;
        String p = null;
   
    if ("Kraken".equals(criatura) || "Hipocampo".equals(criatura) || "Pulpo".equals(criatura)){
         p = "un";
    } else if ("Sirenas".equals(criatura) || "Hidras".equals(criatura)){
        p = "unas";
    }else if ("Ballena".equals(criatura) || "Macaraprono".equals(criatura)){
        p = "una";  
    }else if ("Leviatanes".equals(criatura)){
        p = "unos";  
    }
    if ("babor".equals(direction) || "estribor".equals(direction)){
        d = "a";  
    }else if ("proa".equals(direction) || "popa".equals(direction)){
        d = "por la";  
    }
    
    System.out.println("Ahoy! capitán " + p  + " " + criatura  + " " + d + " " + direction);

    }
  
    }
    

    
    

