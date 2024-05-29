package com.TwoDimensionArray;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		 
        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();
 
        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();
 
        int[][] matrix= new int[rows][columns];
        
        System.out.println("enter arrays values");
 
      
        // 2-dimensional array
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            	matrix[i] [j]= scan.nextInt();
               
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i] [j]+  " ");
            }
 
            System.out.println();
        }
        scan.close();

	}

}
