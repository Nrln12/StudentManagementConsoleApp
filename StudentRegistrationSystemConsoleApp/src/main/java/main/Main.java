/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import beans.Student;
import java.util.Scanner;
import util.InputUtil;
import util.StudentUtil;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        
        int menu =0;
        while(true){
            menu = InputUtil.requireNumber("What do you want to do?"
                + "\n 1. Register Student"
                + "\n 2. Show all students"
                + "\n 3. Find student"
                + "\n 4. Update student"
                + "\n 5. Exit");
        switch(menu){
            case 1: 
                StudentUtil.registerStudents();
                break;
            case 2:
                StudentUtil.printAllRegisteredStudents();
                break;
            case 3:
                StudentUtil.findStudentsAndPrint();
                break;
            case 4:
                StudentUtil.UpdateStudent();
                break;
            default:
                return;                
        }
        }
         
    }

}
