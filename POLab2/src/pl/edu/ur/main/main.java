/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.main;
import java.util.*;
/**
 *
 * @author Mateusz Borkowski
 */
public class main {
    
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("Wprowadz numer zadania (1 - 4)");
        int p=n.nextInt();
        switch(p)
        {
            case 1: zadania.Zadanie3();
            break;
            
            case 2: zadania.Zadanie4();
            break;
            
            case 3: zadania.Zadanie6();
            break;
            
            case 4: zadania.Zadanie7();
            break;
            
            default: 
            break;
           
        }
    }
    
    }
    

