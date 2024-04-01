/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaltask1_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class Sorting implements Runnable {
    private List<Integer> numbers;
    
    public Sorting (List<Integer> numbers) {
        this.numbers = numbers;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            Collections.sort(numbers);
            System.out.println(numbers);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
