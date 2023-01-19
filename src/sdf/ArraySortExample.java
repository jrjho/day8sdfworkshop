package sdf;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {

    public void example() {
        String name[] = { "James", "Mike", "Barney", "Brown", "Sally", "Sophia", "Adan", "Daniel", "Marcus", "Elaine" };

        System.out.println("Unsorted Array: " + Arrays.toString(name));

        Arrays.sort(name);

        System.out.println("Sorted Array: " + Arrays.toString(name));

        //sort array in descending order
        Arrays.sort(name, Collections.reverseOrder());
        System.out.println("Reversed Array: " + Arrays.toString(name));

    }

    public void sortInt(){
        
        // unable to sort int in reverse order using the format below. Use Interger
        // int[] numbers = {10, 2, 3, 8 ,5,1,9,0,7,6,4};
        Integer numbers[] = {10, 2, 3, 8 ,5,1,9,0,7,6,4};
        System.out.println("Unsorted Numbers: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));
        
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Reversed Numbers: " + Arrays.toString(numbers));


    }


}
