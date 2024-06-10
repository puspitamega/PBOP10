/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.praktekoopsederhana;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author A-26
 */
public class Game {
    private int secretNumber;
    private int guessLimit;
    
    public Game(int guessLimit) {
        this.guessLimit = guessLimit;
    }
    
    public void generateNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1; 
    }
    
    public int gestGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan tebakan Anda (1-100): ");
        return scanner.nextInt();
    }
}
