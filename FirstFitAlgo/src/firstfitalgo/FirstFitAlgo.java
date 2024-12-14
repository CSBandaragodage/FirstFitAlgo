/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstfitalgo;

/**
 *
 * @author user
 */
public class FirstFitAlgo {
    public static void main(String[] args) {
        System.out.println("Welcome to FirstFitAlgo Simulator !");

        // Create instances of classes
        UserInputHandler inputHandler = new UserInputHandler();
        MemoryAllocator allocator = new MemoryAllocator();
        ResultDisplayer displayer = new ResultDisplayer();

        // Get user input
        int[][] inputs = inputHandler.getInput();
        int[] blockSizes = inputs[0];
        int[] processSizes = inputs[1];

        // Perform memory allocation
        int[] allocations = allocator.firstFit(blockSizes, processSizes);

        // Display results
        displayer.displayResults(processSizes, allocations);
    }
    
}
