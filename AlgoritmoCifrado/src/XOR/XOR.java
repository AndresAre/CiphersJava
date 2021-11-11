/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XOR;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class XOR {
    public static String cifra(String cadena, int clave){
        String ret="";
        
        char[] chars = cadena.toCharArray();
        
        for(int n=0; n<chars.length;n++){
            char c = (char)(chars[n] * clave);
            ret = ret+c;
        }
        return ret;
    }
    public static void cifraArchivo(String entrada, String salida, int clave){
        
        FileReader fr = null;
        try{
            File entradaF = new File(entrada);
            File salidaF = new File(salida);
            
            fr = new FileReader(entradaF);
            FileWriter fw = new FileWriter(salidaF);
            
            BufferedWriter bw = new BufferedWriter(fw);
            BufferedReader br = new BufferedReader(fr);
            String leido = null;
            
            while((leido=br.readLine()) != null){
                String cifrado = cifra(leido, clave);
                fw.write(cifrado);
                bw.write(cifrado);
                bw.newLine();
                bw.flush();
            }
            bw.close();
            br.close();
            
        }catch(FileNotFoundException ex){
            Logger.getLogger(XOR.class.getName()).log(Level.SEVERE, null, ex);
        }catch(IOException ex){
            Logger.getLogger(XOR.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                fr.close();
            }catch(IOException ex){
                Logger.getLogger(XOR.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String[] args){
        cifraArchivo("entrada.txt","salida.txt",10);
    }
    
}
