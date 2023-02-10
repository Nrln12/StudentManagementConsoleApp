/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import beans.Student;
import main.Config;

/**
 *
 * @author Asus
 */
public class StudentUtil {

    public static Student fillStudent() {
        String name = InputUtil.requireText("enter name");
        String surname = InputUtil.requireText("enter surname");
        String className = InputUtil.requireText("enter class");
        int age = InputUtil.requireNumber("enter age");

        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println(st.getFullInfo());
        }
    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("How many students do you want to register?");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Register");

            Config.students[i] = StudentUtil.fillStudent();
        }
        System.out.println("Registration completed successfully.");
        StudentUtil.printAllRegisteredStudents();
    }

    public static void findStudentsAndPrint() {
        String text = InputUtil.requireText("type name, surname, or class name");
        Student[] result = findStudents(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullInfo());            
        }
    }

    public static Student[] findStudents(String text){
        int count =0;
        for(int i=0;i<Config.students.length;i++){
            Student st = Config.students[i];
            if(st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)){
                count++;
            }
        }
        
        Student[] result = new Student[count];
        int found =0;
        for(int i=0;i<Config.students.length;i++){
            Student st = Config.students[i];
            if(st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)){
                result[found]=st;
                found++;
            }
        }
        return result;
    }
    
    public static Student findStudentById(){
        int number = InputUtil.requireNumber("Enter ID of student");
        Student st= Config.students[number-1];
        return st;
    }
    
        public static String UpdateStudent(){
        Student st = StudentUtil.findStudentById();
        int prop=0;
               prop = InputUtil.requireNumber("Which property do you want to change"
                                    +"\n 1. Name"
                                    +"\n 2. Surname"
                                    +"\n 3. Age"
                                    +"\n 4.Class Name");
        switch(prop){
            case 1:
                 st.setName(InputUtil.requireText("Enter new name"));
                 break;
            case 2:
                st.setSurname(InputUtil.requireText("Enter new surname"));
                break;
            case 3: 
                st.setAge(InputUtil.requireNumber("Enter new age"));
            case 4:
                st.setClassName(InputUtil.requireText("Enter new class"));
                break;
            default:
                break;
        }
             return st.getFullInfo();
    }
}
