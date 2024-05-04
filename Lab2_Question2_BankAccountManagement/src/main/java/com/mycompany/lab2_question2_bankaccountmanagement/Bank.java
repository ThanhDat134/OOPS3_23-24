/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2_question2_bankaccountmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Bank {

    ArrayList<BankAccount> listAcc = new ArrayList<>();

    public Bank() {
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Input N (Account Bank): ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            BankAccount acc = new BankAccount();
            acc.InputInfor(sc);
            listAcc.add(acc);
        }
    }

    public void Output() {
        for (int i = 0; i < listAcc.size(); i++) {
            listAcc.get(i).Output();
        }
    }

    public void DepositAccount() {
        int accNumber;
        double money;
        System.out.println("Input Account Number: ");
        Scanner sc = new Scanner(System.in);
        accNumber = sc.nextInt();
        System.out.println("Input Money: ");
        money = sc.nextDouble();
        for (int i = 0; i < listAcc.size(); i++) {
            if (listAcc.get(i).CompareAccountNumber(accNumber)) {
                listAcc.get(i).Deposit(money);
            }
        }
    }

    public void TransferMoney() {
        int accNumberReceive, accNumberSend;
        double money;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Money: ");
        money = sc.nextDouble();
        System.out.print("Accout 1: ");
        accNumberSend = sc.nextInt();
        System.out.print("Accout 2: ");
        accNumberReceive = sc.nextInt();
        BankAccount acc1 = null, acc2 = null;
        for (int i = 0; i < listAcc.size(); i++) {
            if (listAcc.get(i).CompareAccoutNumber(accNumber) {
            }
        }
    }

}
