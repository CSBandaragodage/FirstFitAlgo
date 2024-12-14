/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstfitalgo;

/**
 *
 * @author user
 */
public class MemoryAllocator {
    
    public int[] firstFit(int[] blockSizes, int[] processSizes) {
        int[] allocations = new int[processSizes.length];

        // Initialize all allocations 
        for (int i = 0; i < allocations.length; i++) {
            allocations[i] = -1;
        }

        // Allocate each process 
        for (int i = 0; i < processSizes.length; i++) {
            for (int j = 0; j < blockSizes.length; j++) {
                if (blockSizes[j] >= processSizes[i]) {
                    // Allocate block j to process i
                    allocations[i] = j;

                    // Reduce available size of block
                    blockSizes[j] -= processSizes[i];

                    break;
                }
            }
        }

        return allocations;
    }
}
