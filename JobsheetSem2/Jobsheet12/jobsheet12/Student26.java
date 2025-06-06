package jobsheet12;
public class Student26 {
  public String nim;
  public String name;
  public String className;
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
   public void tugasDInilai(int nilai) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'tugasDInilai'");
   }
}