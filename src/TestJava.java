import java.util.Arrays;




public class TestJava {

    public static void main(String[] args) {
        // define the array of integers
        int[] intArray = { 10,20,30,40,50 };

        // display the original array
        System.out.println("Original Array: "
                + Arrays.toString(intArray));
        // index at which the element is to be deleted
        int index = 2;

        // the index
        System.out.println("Element to be deleted at index: "
                + index);
        // create an array to hold elements after deletion
        int[] copyArray = new int[intArray.length - 1];

        // copy elements from original array from beginning till index into copyArray
        System.arraycopy(intArray, 0, copyArray, 0, index);

        // copy elements from original array from index+1 till end into copyArray
        System.arraycopy(intArray, index + 1, copyArray, index, intArray.length - index - 1);

        // display the copied array after deletion
        System.out.println("Array after deleting an element: "
                + Arrays.toString(copyArray));
    }
}
