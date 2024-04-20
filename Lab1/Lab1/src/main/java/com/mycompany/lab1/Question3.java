/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;
/**
 *
 * @author Student
 */
public class Question3 {
    private int number;

    public Question3() {
    }

    public Question3(int number) {
        this.number = number;
    }
    public int HailstoneSequence() {
        while (number > 0) {
            if (number % 2 == 0)
                number /=2;
            else
                number = number*3+1;
        }
        return number;
    }
}
