public class SearchStudents{
    Students[] listStd = new Students[5];
    int idx;
// for adding\
  public void add(Students std){
    if(idx < listStd.length){
      listStd[idx] = std;
      idx++;
    }else{
      System.out.println("The student is full");
    }
  }
 public void display(){
    for(Students students : listStd){
      students.display();
      System.out.println("-----------------------");
    }
 }
 public int findSeqSearch (int search) {
    int position = -1;
    for(int i = 0; i < listStd.length; i++){
      if(listStd[i].nim == search){
        position = i;
        break;
      }
    }
     return position;
    
 }
 // for showing the position
 public void showPosition (int position, int x){
    if(position != -1){
      System.out.println("Data : " + x + " is found in index-" + position);
    }else{
      System.out.println("Data : " + x + " is not found");
    }
 } 
 public void showData (int x , int pos){
    if(pos != -1){
      System.out.println("NIM \t :" + x);
      System.out.println("Name \t : " + listStd[pos].name);
      System.out.println("Age \t : " + listStd[pos].age);
      System.out.println("GPA \t : " + listStd[pos].gpa);
    }else{
      System.out.println("Data : " + x + " is not found");
    }
 }                             
}