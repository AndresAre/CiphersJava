/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoRailFence;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RailFence {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el texto: ");
        String plainText = in.nextLine();
        System.out.println("Ingrese la clave: ");
        int key = in.nextInt();
        
        String en = encryption(plainText, key);
        System.out.println(decryption(en, key));
    }
    static String encryption(String text, int key){
        String encryptedText="";
        boolean check = false;
        int j=0;
        int row=key;
        int col = text.length();
        char[][] a = new char[row][col];
        
        for(int i=0;i<col;i++){
            if(j==0 || j==key-1){
                check = !check;
            }
            a[j][i]=text.charAt(i);
            
            if(check){
                j++;
            }else{
                j--;
            }
        }
        for(int i=0;i<row;i++){
            for(int k=0;k<col;k++){
                if(a[i][k]!=0){
                    encryptedText +=a[i][k];
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int k=0;k<col;k++){
                System.out.print(a[i][k]+ " ");
            }
            System.out.println();
        }
        return encryptedText;
    }
    
    static String decryption(String text, int key){
        String decryptedText="";
        boolean check=false;
        int j=0;
        int row=key;
        int col=text.length();
        char[][] a = new char[row][col];
        
        for(int i=0;i<col;i++){
            if(j==0 || j==key-1){
                check= !check;
            }
            a[j][i]='*';
            
            if(check){
                j++;
            }else{
                j--;
            }
        }
        for(int i=0; i<row; i++){
            for(int k=0; k<col; k++){
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
        int index=0;
        check=false;
        
        for(int i=0;i<row;i++){
            for(int k=0; k<col; k++){
                if(a[i][k]=='*' && index<col){
                    a[i][k]=text.charAt(index++);
                }
            }
        }
        
        for(int i=0; i<row; i++){
            for(int k=0; k<col; k++){
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
        
        j=0;
        for(int i=0;i<col;i++){
            if(j==0 || j==key-1){
                check =!check;
            }
            decryptedText += a[j][i];
            
            if(check){
                j++;
            }else{
                j--;
            }
        }
        return decryptedText;
    }
    
}
