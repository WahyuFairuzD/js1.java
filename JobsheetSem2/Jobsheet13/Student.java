package Jobsheet13; 
 
public class Student { 
    public String nim;
    String name;
    String className; 
    double gpa; 
 
    public Student(){ 
    } 
    public Student(String nm, String nama, String kls, double ip){ 
        nim = nm; 
        name = nama; 
        className = kls; 
        gpa = ip; 
    } 
    public void print(){ 
        System.out.println(nim+" - "+name+" - "+className+" - "+gpa); 
    }}
    
    