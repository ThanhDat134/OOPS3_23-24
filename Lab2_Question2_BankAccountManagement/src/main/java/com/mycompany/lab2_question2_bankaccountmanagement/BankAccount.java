/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2_question2_bankaccountmanagement;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class BankAccount {

    private int accNumber;
    private String fullName;
    private double balance;

    public BankAccount(int accNumber, String fullName, double balance) {
        this.accNumber = accNumber;
        this.fullName = fullName;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public void InputInfor(Scanner sc) {
     System.out.println("Account Number: ");
     accNumber = sc.nextInt();
     System.out.println("Name: ");
     fullName = sc.nextLine();
     
    }

    public void Output() {

    }
    
    public String ToString() {
        return String.valueOf(balance);
    }
    
    public void Deposit(double money) {
        this.balance += money;
    }
    
    public boolean Widthraw (double money) {
        //luon luon thu het dieu kien false truoc roi moi toi true
        if (money <= 0) return false;
        if (money > this.balance) return false;
        //true
        this.balance -= money;
        return true;
    }
    
    public boolean TranferMoney(BankAccount acc, double money) {
        if (money <= 0) return  false;
        if (money > this.balance) return false;
        this.Widthraw(money);
        acc.Deposit(money);
        return true;
    }
    
    public boolean  CompareAccountNumber(int acc) {
        return acc == this.accNumber;
    }
}
