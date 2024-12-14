/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstfitalgo;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class UserInputHandler {
    
    public int[][] getInput() {
        Scanner scanner = new Scanner(System.in);

        // Input for block sizes
        System.out.println("Enter the number of memory blocks:");
        int numBlocks = scanner.nextInt();
        int[] blockSizes = new int[numBlocks];
        System.out.println("Enter the sizes of memory blocks:");
        for (int i = 0; i < numBlocks; i++) {
            System.out.print("Block " + (i + 1) + ": ");
            blockSizes[i] = scanner.nextInt();
        }
        
         // Input for process sizes
        System.out.println("\nEnter the number of processes:");
        int numProcesses = scanner.nextInt();
        int[] processSizes = new int[numProcesses];
        System.out.println("Enter the sizes of processes:");
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Process " + (i + 1) + ": ");
            processSizes[i] = scanner.nextInt();
        }

        scanner.close();
        return new int[][]{blockSizes, processSizes};
    }
}
