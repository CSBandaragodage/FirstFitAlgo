/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstfitalgo;

/**
 *
 * @author user
 */
public class ResultDisplayer {
    
    public void displayResults(int[] processSizes, int[] allocations) {
        System.out.println("\nProcess No.\tProcess Size\tBlock No.");
        for (int i = 0; i < processSizes.length; i++) {
            System.out.print(" " + (i + 1) + "\t\t" + processSizes[i] + "\t\t");
            if (allocations[i] != -1) {
                System.out.println(allocations[i] + 1); // Block IDs start from 1
            } else {
                System.out.println("Not Allocated");
            }
        }
    }
}
