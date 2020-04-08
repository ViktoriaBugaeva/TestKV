/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author vi
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    static float a,b,c;
    static float d;
    static double x1, x2;
    
    public static void main(String args[]) throws IOException 
    { 
        try {
            System.out.println("Решение квадратного уравнения");
            Scanner s = new Scanner (System.in);
            System.out.println("Введите значение a ->");
            a = s.nextFloat();
            System.out.println("Введите значение b ->");
            b = s.nextFloat();
            System.out.println("Введите значение c ->");
            c = s.nextFloat();
            System.out.println("a = " + a + " b = " + b + " c = " + c);
            
            d = (b * b) - (4 * a * c);
            System.out.println("Дискриминант = " + d);
            
            if(d < 0)
                System.out.println("Уравнение не имеет решений!");
            else
                if(d == 0)
                {
                    x1 = (-b) / (2 * a);
                    System.out.println("x = " + x1);
                }
            else
            {
                    x1 = (-b + Math.sqrt(d)) / (2 * a);
                    x2 = (-b - Math.sqrt(d)) / (2 * a);
                    if (x1 == x2)
                        System.out.println("x1 = x2" + x1);
                    else
                        System.out.println("x1 = " + x1 + " x2 = " + x2);
            }
                }catch(InputMismatchException e){System.out.println("Ошибка ввода!");
        }
        
    }
    
    }
