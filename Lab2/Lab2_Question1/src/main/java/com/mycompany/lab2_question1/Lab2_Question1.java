/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2_question1;

/**
 *
 * @author Student
 */
public class Lab2_Question1 {

    public static void main(String[] args) {
        //So_Phuc sp1 = new So_Phuc(1,2);
        //So_Phuc sp2 = new So_Phuc(3,4);
        //So_Phuc kq = sp1.Addition(sp2);
        //kq.OutputSoPhuc();
        //So_Phuc sp1 = new So_Phuc(1,2);
        //So_Phuc sp2 = new So_Phuc(3,4);
        //So_Phuc kq = sp1.Multiply(sp2);
        //kq.OutputSoPhuc();
        So_Phuc sp1 = new So_Phuc(1,2);
        So_Phuc sp2 = new So_Phuc(3,4);
        So_Phuc kq = sp1.Subtraction(sp2);
        kq.OutputSoPhuc();
    }
}
