/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

/**
 *
 * @author Student
 */
public class Question6 {

  
    private String s;
    private String s2;
    private String s3;

    public Question6() {
    }
  public Question6(String s) {
        this.s = s;
    }

    public Question6(String s, String s2) {
        this.s = s;
        this.s2 = s2;
    }

    public int Length() {
        int lengthS = s.length();
        return lengthS;
    }

    public int CountString() {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        return count;
    }

    public String NoiChuoi() {
        String answer = s.concat(s2);
        return answer;
    }
    public boolean IsPalindrome() {
        String s3 = "";
        for (int i = s.length()-1; i>=0; i--) {
            s3 += s.charAt(i);
        }
        return s.equals(s3);
    }
}
