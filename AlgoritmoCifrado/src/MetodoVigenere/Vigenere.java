/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoVigenere;

/**
 *
 * @author user
 */
public class Vigenere {
    String EntradaNC="", SalidaNC="", ClaveNC="", EntradaC="", SalidaC="", ClaveC="";
    String Alfa = "abcdefghijklmnñopqrstuvwxyz=% @";

    public Vigenere(String EntradaNC, String SalidaNC, String ClaveNC, String EntradaC, String SalidaC, String ClaveC) {
        this.EntradaNC = EntradaNC;
        this.SalidaNC = SalidaNC;
        this.ClaveNC = ClaveNC;
        this.EntradaC = EntradaC;
        this.SalidaC = SalidaC;
        this.ClaveC = ClaveC;
    }

    public Vigenere() {
    }

    public String getClaveNC() {
        return ClaveNC;
    }

    public void setClaveNC(String ClaveNC) {
        this.ClaveNC = ClaveNC;
    }
    
    

    public String getEntradaNC() {
        return EntradaNC;
    }

    public void setEntradaNC(String EntradaNC) {
        this.EntradaNC = EntradaNC;
    }

    public String getSalidaNC() {
        return SalidaNC;
    }

    public void setSalidaNC(String SalidaNC) {
        this.SalidaNC = SalidaNC;
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

    public String getClaveC() {
        return ClaveC;
    }

    public void setClaveC(String ClaveC) {
        this.ClaveC = ClaveC;
    }
    
    public String Encriptacion(){
        int []t = new int[EntradaNC.length()];
        int []pa = new int[EntradaNC.length()];
        int []cri = new int[EntradaNC.length()];
        
        for(int i=0; i<t.length;i++){
            t[i] = Alfa.indexOf(EntradaNC.substring(i,i+1));
            pa[i] = Alfa.indexOf(ClaveNC.substring(i%ClaveNC.length(), (i%ClaveNC.length()+1)));
            cri[i] = (t[i]+pa[i]) % Alfa.length();
            SalidaNC = SalidaNC+Alfa.substring(cri[i], cri[i]+1);
        } 
        return SalidaNC;
    }
 
    public String Desencriptacion(){
        int []t = new int[EntradaC.length()];
        int []pa = new int[EntradaC.length()];
        int []cri = new int[EntradaC.length()];
        int n;
        for(int i=0; i<t.length;i++){
            t[i] = Alfa.indexOf(EntradaC.substring(i,i+1));
            pa[i] = Alfa.indexOf(ClaveC.substring(i%ClaveC.length(), (i%ClaveC.length()+1)));
            n = (t[i]-pa[i]);
            if(n<0){
                n = Alfa.length()+n;
            }
            cri[i] = n% Alfa.length();
            SalidaC = SalidaC + Alfa.substring(cri[i],cri[i]+1);
        }
        return SalidaC;
    }
}
