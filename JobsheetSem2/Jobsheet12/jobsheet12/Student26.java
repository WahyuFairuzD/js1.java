package jobsheet12;
public class Student26 {
  String nim, name, className;
  double gpa;
 
   public Student26() {
   }
   public Student26(String nm, String nama, String kls, double ip){
    nim = nm;
    name = nama;
    className = kls;
    gpa = ip;
   }
   void print(){
    System.out.println(nim+" - "+name+" - "+className+" - "+gpa);
   }
}