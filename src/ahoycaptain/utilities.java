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
class utilities {
    
    public String showCriatures(){
        String [] criatures = {"Kraken","Sirenas","Ballena","Hipocampo","Macaraprono","Pulpo","Leviatanes","Hidras"};;
        int index = (int) Math.round(Math.random()*7);
        return criatures[index];
        
    }
    
    public String showDirection(){
        String [] direction = {"babor","estribor","proa","popa"};;
        int index = (int) Math.round(Math.random()*3);
        return direction[index];
        
    }
    
}

