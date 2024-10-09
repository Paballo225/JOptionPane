/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joption;
import javax.swing.*;

/**
 *
 * @author RC_Student_lab
 */

/*
create a program that accepts two numbers from the user. Create a menu with 4 numerical options for performinh the following:
1. Addition
2. Subtraction
3. Division
4. Multiplication

If a user enter a number that is not in the menu show: "Calculation not recognized"
Use a while loop to keep on asking the user to enter their option to perform on the two numbers until you enter 0
*/
public class Joption {

    public static void main(String[] args) {
        
        Double num1 =
                Double.parseDouble(JOptionPane.showInputDialog (null, "Enter the first number: "));
                
        Double num2 =
                Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your second number:"));
        
        int option;
        do{
            String menu = "Menu: \n1.Addition \n2.Subtraction \n3. Division \n4.Multiplication \n0.Exit";
            option = Integer.parseInt(JOptionPane.showInputDialog(menu + " \n Enter your option:"));
            
            switch(option){
                case 1: JOptionPane.showMessageDialog(null, "Result:" + (num1 + num2));
                break;
                
                case 2: JOptionPane.showMessageDialog(null, "Result" + (num1 - num2));
                break;
                
                case 3: if(num2!= 0){
                    JOptionPane.showMessageDialog(null, "Result" + (num1 / num2));
                }
                else{JOptionPane.showMessageDialog(null, "Error: Division by zero");
                }
                break;
                
                case 4: JOptionPane.showMessageDialog(null, "Result" + (num1 * num2));
                break;
                
                case 0: JOptionPane.showMessageDialog(null, "Existing");
                break;
                
                default: JOptionPane.showMessageDialog(null, "Calculation not recognised");
            }
        }
        while (option!= 0);
            }
        }
                
