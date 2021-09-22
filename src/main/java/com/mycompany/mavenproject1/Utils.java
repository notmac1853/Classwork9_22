/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Utils {
    public int getCube(int num){
        return num * num * num;
        
    }
    
    public static boolean isPrime(int x){
        for(int i=2; i< x; i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public int getIntFromFile(String flName) throws FileNotFoundException{
        int num;
        Scanner sc = new Scanner(new File(flName));
        num = sc.nextInt();
        return num;
    }
    
}
