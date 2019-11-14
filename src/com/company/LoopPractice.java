package com.company;

public class LoopPractice {
 public static void practiceWhileLoop(){
     int x = 0;
     while (x < 5){

         System.out.println("The value of x is " + x);
         x++;
     }
     System.out.println("==WhileLoop Finished==");
 }
 public static void practiceDoWhileLoop(){
     int x = 0;
     do {

         System.out.println("The value of x is " + x);
         x++;
     }while (x<10);
     System.out.println("==DoWhileLoop Finished=");
 }
 public static void practiceForLoop(){
     for (int x =0; x<10; x++){
         for (int y =0; y<10;y++)

         System.out.println("{"+x+", "+y+"}");
     }
     System.out.println("==ForLoop Finished==");
 }
    public static void main(String[] args) {
	// write your code here
//        practiceWhileLoop();
        
//        practiceDoWhileLoop();
        practiceForLoop();
    }
}
