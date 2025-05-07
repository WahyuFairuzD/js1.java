public class Lecturer26 {
    String id, name;
    boolean gender;
    int age;

    public Lecturer26(){}
    
    public Lecturer26(String id, String name, boolean gender, int age){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public void print(){
        System.out.println("ID: "+id+", Name: "+name+
        ", Gender: "+gender+", Age: "+age);
    }
}