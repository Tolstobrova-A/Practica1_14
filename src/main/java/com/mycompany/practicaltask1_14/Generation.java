/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaltask1_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author User
 */
public class Generation implements Runnable {
    private List<Integer> numbers;
    
    public Generation(List<Integer> numbers) {
        this.numbers = numbers;
    }
    
    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(1000);
            synchronized (numbers) {
                numbers.add(number);
            }
        }
    }
}