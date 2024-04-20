/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question4 {
    static Scanner sc = new Scanner(System.in);
    public static int[] input() {
        int n = sc.nextInt();
        int[]a = new int[n];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        return a;
    }
    public static void output(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
    public int SumAllEvenNumber() {
        int []a = input();
        int sum = 0;
        for (int i = 0; i<a.length; i++) {
            if (a[i]%2 == 0)
                sum+=a[i];
        }
        return sum;
    }
}
