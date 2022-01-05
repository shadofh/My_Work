/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacalculator;

import java.util.Scanner;

/**
 *
 * @author shado
 */
public class GPAcalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       int hoursSum=0, pointsSum=0;
       double GPA;
        
        int size;
        System.out.println("Courses Number:");
        size = input.nextInt();
        
        int[] hours = new int[size];
        String[] symbol = new String[size];
        String[] subName = new String[size];
        double[] points = new double[size];
        
        
        for (int i = 0; i < hours.length; i++) {
            System.out.println("Enter Name Of Cours "+(i+1)+"#:");
            subName[i] = input.next();
            
            System.out.println();
            
            System.out.println("Enter Hours Number Of "+subName[i]+":");
            hours[i] = input.nextInt();
            
            System.out.println();
            
            System.out.println("Enter Symbol Of "+subName[i]+":");
            symbol[i] = input.next();
            
            
            symbolCheck(symbol[i], subName[i]);
            System.out.println("Enter Again:");
              symbol[i] = input.next();
               symbolCheck(symbol[i], subName[i]);
            
           
        }
        
        double[] cost = symbolCost(symbol);   //converting symbol to number
        
        for (int i = 0; i < hours.length; i++) {     //points calculator
            points[i] = hours[i]*cost[i];
            
        }
        
        for (int i = 0; i < hours.length; i++) {  //summing hours and points
            hoursSum+= hours[i];
            pointsSum+= points[i];
            
        }
        
        GPA = pointsSum/hoursSum;
        
        
        System.out.println("-------------------------");
        System.out.println("Name\t Points\t Hours");
        for (int i = 0; i < hours.length; i++) {
            
            System.out.printf("%S\t %.1f\t %d",subName[i],points[i],hours[i]);
            System.out.println();
             
        }
        System.out.println("-------------------------");
        
        System.out.println();
        System.out.println("Points Sum: "+pointsSum);
        System.out.println("Units Sum: "+hoursSum);
        System.out.println();
        
        System.out.println("your GPA is "+ GPA);
        
        if(GPA>3)
            System.out.println("Congratulation!\nKeep It Up");
        else if(GPA<3&&GPA>1)
            System.out.println("Work harder");
        else if(GPA==1)
            System.out.println("Try Again");
        
        
          
    }
    
    public static double[] symbolCost(String[] symbol){
    
        double[] cost = new double[symbol.length];
        for (int i = 0; i < symbol.length; i++) {
            
        
        switch (symbol[i]) {
            case "A+":
            case "+A":
                cost[i] = 5;
              break;
            case "A": cost[i]= 4.75;
            break;
              
               case "B+":
            case "+B":
                cost[i] = 4.5;
              break;
            case "B": cost[i] = 4;
            break;
              
               case "C+":
            case "+C":
                cost[i] = 3.5;
              break;
            case "C": cost [i]= 3;
              
               case "D+":
            case "+D":
                cost[i] = 2.5;
              break;
            case "D": cost[i]=2;
            break;
              
             
            case "F":
                cost[i] = 1;
              break;
        }
        
              
          
        }
    
    
    
    return cost;
    
    }
    
    public static void symbolCheck(String symbol, String subName){
       
        int count = 0;
        
        
    switch (symbol) {
                case "A+":
                case "+A":
                case "A":
               case "B+":
                case "+B":
                case "B":
               case "C+":
                case "+C":
                case "C":
                    case "D+":
                case "+D":
                case "D":
                case "F":
                    break;
               default:
                   System.out.println("you enterd wrong symbol");
                    System.out.printf("Enter The Symbol Of %s Right way ",subName);
                    System.out.println("you have one try");
                    
                    
                    count++;
           
 }
    if(count == 2)
        return;
    
    
    }
    
   
}
