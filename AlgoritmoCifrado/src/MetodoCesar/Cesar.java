/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoCesar;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Cesar {
    String EntradaMC, SalidaMC, EntradaC, SalidaC;

    public Cesar(String EntradaMC, String SalidaMC, String EntradaC, String SalidaC) {
        this.EntradaMC = EntradaMC;
        this.SalidaMC = SalidaMC;
        this.EntradaC = EntradaC;
        this.SalidaC = SalidaC;
    }

    public Cesar() {
    }

    public String getEntradaMC() {
        return EntradaMC;
    }

    public void setEntradaMC(String EntradaMC) {
        this.EntradaMC = EntradaMC;
    }

    public String getSalidaMC() {
        return SalidaMC;
    }

    public void setSalidaMC(String SalidaMC) {
        this.SalidaMC = SalidaMC;
    }

    public String getEntradaC() {
        return EntradaC;
    }

    public void setEntradaC(String EntradaC) {
        this.EntradaC = EntradaC;
    }

    public String getSalidaC() {
        return SalidaC;
    }

    public void setSalidaC(String SalidaC) {
        this.SalidaC = SalidaC;
    }
    
    public String Encriptacion(){
        try{
            char array[] = EntradaMC.toCharArray();
            for(int i=0;i<array.length;i++){
                array[i] = (char)(array[i]+(char)+3);
            }
            SalidaMC = String.valueOf(array);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        return SalidaMC;
    }

    public String Desencriptacion(){
        try{
            char array[] = EntradaC.toCharArray();
            for(int i=0;i<array.length;i++){
                array[i] = (char) (array[i] +(char)-3);
            }
            SalidaC = String.valueOf(array);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return SalidaC;
    }
    
}

