/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2_question1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class So_Phuc {

    private double a;
    private double b;

    public So_Phuc(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public So_Phuc() {

    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void InputSoPhuc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap so b: ");
        double b = sc.nextDouble();
    }

    public void OutputSoPhuc() {
        System.out.println(a+"i" + " + " + b);
    }

    public So_Phuc Addition(So_Phuc sp) {
        //  double kqa = this.a + sp.a;
        // double kqb = this.b + sp.b;
        // return new So_Phuc(kqa,kqb);
        So_Phuc kq = new So_Phuc();
        kq.setA(this.a + sp.getA());
        kq.setB(this.b + sp.getB());
        return kq;
    }
    
    public So_Phuc Subtraction(So_Phuc sp) {
        //double kqa = this.a - sp.a;
        //double kqb = this.b - sp.b;
        //return new So_Phuc(kqa,kqb);
        So_Phuc kq = new So_Phuc();
        kq.setA(this.a + sp.getA());
        kq.setB(this.b + sp.getB());
        return kq;
    }
    
    public So_Phuc Multiply(So_Phuc sp) {
        double kqa = this.a * sp.a;
        double kqb = this.b * sp.b;
        double kqc = this.a * sp.b;
        double kqd = this.b * sp.a;
        return new So_Phuc( (kqa-kqb) , (kqc + kqd));
    }
}
