import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] originalArray = {5,2,4,1,3};
    int[] resortedArray = originalArray;
    // Print the array befire being resorted
    System.out.println("\nOrginial Array: " + Arrays.toString(originalArray));

    int n = resortedArray.length;
    // The minus i is so we end the loop before the last number since we will be comparing against the next number which would be the last number
    for (int i = 0; i < n-1; i++) {
      // Do j < n-i-1 each time it loops it decreases the max range as the biggest number is already pushed the end
      for (int j = 0; j < n-i-1; j++) {
        // If the current number is bigger than the number after it then swap them to push them to the end
        // In order to sort from biggest to lowest swap the > for a < as it will push the lowest number to the end instead
        if (resortedArray[j] > resortedArray[j+1]) {
          // make a temp int to act as the current number since int doesnt have Collecions.swap or another other built in swapper
          int temp = resortedArray[j];
          resortedArray[j] = resortedArray[j+1];
          resortedArray[j+1] = temp;
        }
      }
    }
    // Print the array after being resorted
    System.out.println("\nResorted Array: " + Arrays.toString(resortedArray));
  }
}
