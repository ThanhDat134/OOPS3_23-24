/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class Question5 {

    private int number;
    private ArrayList<Integer> arr;

    public Question5(int number, ArrayList<Integer> arr) {
        this.number = number;
        this.arr = arr;
    }

    public Question5() {
    }
    public boolean RemoveFirstSpecificElement() {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean flag = arr.contains(number);
        if (flag) {
            arr.remove(number);
            return true;
        }
        else 
            return false;
    }
}
