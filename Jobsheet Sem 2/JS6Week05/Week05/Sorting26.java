package Week05;
public class Sorting26{
    int[] data;
    int size;
   


//constructor
public Sorting26(int[] data) {
    this.data = data;
    this.size = data.length;
}
//bubble method 
public void bubbleSort() {
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (data[j] > data[j + 1]) {
                int temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;
            }
        }
    }
}
//print method
public void printData() {
    for (int i = 0; i < size; i++) {
        System.out.print(data[i] + " ");
    }
    System.out.println();
}
    
//selection methods

public void selectionSort(){
    for (int i = 0; i < size - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < size; j++) {
            if (data[j] < data[minIndex]) {
                minIndex = j;
            }
        }
        int temp = data[minIndex];
        data[minIndex] = data[i];
        data[i] = temp;
    }

}
public void insertionSort(){
    for (int i = 1; i < size; i++) {
        int key = data[i];
        int j = i - 1;
        while (j >= 0 && data[j] > key) {
            data[j + 1] = data[j];
            j--;
        }
        data[j + 1] = key;
    }
}}





