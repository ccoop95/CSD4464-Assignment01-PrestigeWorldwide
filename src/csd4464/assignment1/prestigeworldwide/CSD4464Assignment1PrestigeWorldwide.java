/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.prestigeworldwide;

/**
 *
 * @author c0659824
 */
public class CSD4464Assignment1PrestigeWorldwide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    //stringPower Classs
    public static String stringPower(String string, int num){
        if (string == "" && num > 0) {
            return string;
        }else if (num < 1){
            return null;
        } else if (num == 1 && string != null ){
            return string;
        } else if (num == 2 && string != null){
            String newString = string + string;
            return newString;
        }
        return string;
    }
    
}
