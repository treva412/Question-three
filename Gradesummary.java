/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradesummary;
import java.util.Scanner;
/**
 *
 * @author VU-STUDENT
 */
public class Gradesummary {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        int count = 0;
        int[] gradeCount = new int[10]; 

        while (count < 5) {
            System.out.print("Enter score for student " + (count + 1) + ": ");
            int score = input.nextInt();

            int grade;
            String remark;

            if (score >= 80 && score <= 100) {
                grade = 1; remark = "Distinction";
            } else if (score >= 75) {
                grade = 2; remark = "Distinction";
            } else if (score >= 66) {
                grade = 3; remark = "Credit";
            } else if (score >= 60) {
                grade = 4; remark = "Credit";
            } else if (score >= 50) {
                grade = 5; remark = "Credit";
            } else if (score >= 45) {
                grade = 6; remark = "Credit";
            } else if (score >= 35) {
                grade = 7; remark = "Pass";
            } else if (score >= 30) {
                grade = 8; remark = "Pass";
            } else if (score >= 0) {
                grade = 9; remark = "Fail";
            } else {
                System.out.println("Invalid score! Skipping this entry.");
                continue; 
            }

            System.out.println("Student " + (count + 1) + " -> Grade: " + grade + " (" + remark + ")\n");

            gradeCount[grade]++;
            count++;
        }

        System.out.println("\n=== Summary of Grades ===");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Grade " + i + ": " + gradeCount[i] + " student(s)");
        }
    }
}


