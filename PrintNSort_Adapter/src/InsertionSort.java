public class InsertionSort implements SortingAlgorithm {
    public void sort(int[] array) {
        int i, wrongPos, temp;
        int length = array.length;
    
        System.out.println("insertion sort");
        for(i = 1; i < length; i++) { 
            if(array[i] < array[i - 1]) { // if i-element is not in the right position, move it to the right place.
                temp = array[i];
                wrongPos = i;
            
                do { //Move previous element until a right place is found.
                    array[wrongPos] = array[wrongPos-1];
                    wrongPos--;
                }
                while (wrongPos > 0 && array[wrongPos-1] > temp);
            
                array[wrongPos] = temp;
            }
        }
    } 
}