public class LecturerData26 {
    Lecturer26[] listLecturer26s;
    int idx;

    public LecturerData26 (int size){
        listLecturer26s = new Lecturer26[size];
        idx=0;
    }

    public void add(Lecturer26 dsn){
        if (idx < listLecturer26s.length) {
            listLecturer26s[idx]=dsn;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print(){
        for (int i = 0; i < idx; i++) {
            listLecturer26s[i].print();
        }
    }

    public void bubbleSort(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 0; j < idx-i-1; j++) {
                if (listLecturer26s[j].age>listLecturer26s[j+1].age) {
                    Lecturer26 temp = listLecturer26s[j];
                    listLecturer26s [j] = listLecturer26s [j+1];
                    listLecturer26s [j+1]=temp;
                }
            }
        }
    }

    public void insertionSort(){
        for (int i = 1; i < idx; i++) {
            Lecturer26 temp = listLecturer26s[i];
            int j = i;
            while (j > 0 && listLecturer26s[j-1].age< temp.age) {
                listLecturer26s[j] = listLecturer26s[j-1];
                j--;
            }
            listLecturer26s[j]=temp;
        }
    }

    //ADDITION FOR 7.5 ASSIG
    public int sequentialSearch(String searchName) {
        for (int i = 0; i < idx; i++) {
            if (listLecturer26s[i].name.equalsIgnoreCase(searchName)) {
                return i;
            }
        }
        return -1;
    }
    
    public void showSearchResults(String name) {
        int position = sequentialSearch(name);
        if (position != -1) {
            System.out.println("Found lecturer:");
            listLecturer26s[position].print();
        } else {
            System.out.println("Lecturer '" + name + "' not found");
        }
    }

    public int binarySearch(int searchAge) {
        bubbleSort(); 
        
        int left = 0;
        int right = idx - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (listLecturer26s[mid].age == searchAge) {
                return mid;
            } else if (listLecturer26s[mid].age < searchAge) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public void showAllMatches(int age) {
        bubbleSort();
        boolean found = false;
        
        for (int i = 0; i < idx; i++) {
            if (listLecturer26s[i].age == age) {
                listLecturer26s[i].print();
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No lecturers found with age " + age);
        }
    }
}