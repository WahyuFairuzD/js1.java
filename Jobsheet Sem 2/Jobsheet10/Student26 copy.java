public class Student26 {
    String name, nim, className;
    int grade;

    Student26(String name, String nim, String  className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }

    void grading(int grade) {
        this.grade = grade;
    }
}
