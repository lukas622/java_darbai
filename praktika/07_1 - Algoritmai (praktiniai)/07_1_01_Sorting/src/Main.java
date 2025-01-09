import java.util.Arrays;

public class Main {
    public static int smallest(int[] array) {
        int smallestNumber = -1;
        boolean firstCheck = true;

        for (int num : array) {
            if (firstCheck) {
                smallestNumber = num;
                firstCheck = false;
            } else if (num < smallestNumber) {
                smallestNumber = num;
            }
        }

        return smallestNumber;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestNumber = smallest(array);

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestNumber) {
                index = i;
            }
        }

        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestNumber = -1;
        boolean firstCheck = true;

        for (int i = index; i < array.length; i++) {
            if (firstCheck) {
                smallestNumber = array[i];
                firstCheck = false;
            } else if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }

        int trueIndex = -1;

        for (int i = index; i < array.length; i++) {
            if (array[i] == smallestNumber) {
                trueIndex = i;
            }
        }

        return trueIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];

        array[index1] = array[index2];

        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int smallestNumber = smallest(array);

        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] values = {6,3,0,-1,4};

        System.out.println(indexOfTheSmallest(values));
    }

}
