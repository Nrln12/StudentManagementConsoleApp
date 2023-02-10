/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class InputUtil {
    public static String requireText(String title){
        Scanner sc = new Scanner(System.in);
        System.out.println(title+ ":");
        String answer=sc.nextLine();
        return answer;
    }
    public static int requireNumber(String number){
        Scanner sc = new Scanner(System.in);
        System.out.println(number+":");
        int answer = sc.nextInt();
        return answer;
    }
}
