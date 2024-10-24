//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SelectionSort();
    }
    //Selection Sort Methode
    public static void SelectionSort(){
        int[] array = {5, 1, 3, 8, 11};

        System.out.println("Unsortiertes Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int numOfElements = array.length;
        System.out.println("\nLänge des Arrays: " + numOfElements);

        // repeat (numOfElements - 1) times:
        for (int i = 0; i < numOfElements - 1; i++) {
            // set the first unsorted element as the minimum (minIndex)
            int minIndex = i;
            // for each of the unsorted elements (starting from the next element):
            for (int j = i + 1; j < numOfElements; j++) {
                // if element < currentMinimum
                if (array[j] < array[minIndex]) {
                    //  set element as new minimum (update minIndex)
                    minIndex = j;
                }
            }
            // swap the element at minIndex with the first unsorted element
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.println("Sortiertes Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    //Bubble Sort Methode
    public static void BubbleSort(){
        int[] array = {5, 1, 3, 8, 11};

        System.out.println("Unsortiertes Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int numOfElements = array.length;
        // repeat (numOfElements - 1) times:
        for (int i = 0; i < numOfElements - 1; i++) {
            for(int j = 0; j < numOfElements - 1;j++){
                if(array[j] > array[j+1]){
                    
                }
            }
        }
    }

}
