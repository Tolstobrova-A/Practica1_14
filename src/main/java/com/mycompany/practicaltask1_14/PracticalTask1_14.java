/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicaltask1_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author User
 */


public class PracticalTask1_14 {
    public static void main(String[] args) {
        
        System.out.println("Practical task №1_14. Variant 5. Student Tolsbrova A.V. Group RIBO-01-22");
        
        List<Integer> numbers = Collections.synchronizedList(new ArrayList<>());
        
        Thread generatorThread = new Thread(new Generation(numbers));
        Thread sorterThread = new Thread(new Sorting(numbers));
        
        generatorThread.start();
        sorterThread.start();
        try{
            generatorThread.join();
            sorterThread.join();
            
        }catch(InterruptedException ex){
        }
    }
}


