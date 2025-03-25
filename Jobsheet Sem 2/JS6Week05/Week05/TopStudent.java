package Week05;

public class TopStudent {
    Student26[]  liStudent26s;
    int idx;

public void add(Student26 student){
    if (idx < liStudent26s.length ){
        liStudent26s[idx] = student;
        idx++;

    }else{
        System.out.println("Full");
    }
    }
    public void print(){
        for (int i = 0; i < idx;i++){
            liStudent26s[i].printData();
        }
    }
    public void bubbleSort(){
        for (int i = 0; i  <idx - 1; i++){
            for (int j = 0; j < idx - i - 1; j++){
                if (liStudent26s[j].gpa > liStudent26s[j + 1].gpa){
                    Student26 temp = liStudent26s[j];
                    liStudent26s[j] = liStudent26s[j + 1];
                    liStudent26s[j + 1] = temp;
                }
            }
        }
    }

}
