package Week05;
public class SortingMain {
    public static void main(String[] args) {
        
    
    int[] a = {34, 7, 23, 32, 5, 62};
     int[] b = {30, 20, 2, 8, 14};
     int[] c = {40, 10, 4, 9, 3};    
    Sorting26 sorting = new Sorting26(a);
    
  
    System.out.println("oOriginal Array: ");
    sorting.printData();
    sorting.bubbleSort();
    System.out.println("Sorted array(Bubble sort): ");
    sorting.printData();

    Sorting26 sorting2 = new Sorting26(b);
    System.out.println("Original array: ");
    sorting2.printData();
    sorting2.selectionSort();
    System.out.println("Sorted array(Selection sort): ");
    sorting2.printData();

    Sorting26 sorting3 = new Sorting26(c);
    System.out.println("Original array: ");
    sorting3.printData();
    sorting3.insertionSort();
    System.out.println("Sorted array(Insertion sort): ");
    sorting3.printData();

    
    
}

}