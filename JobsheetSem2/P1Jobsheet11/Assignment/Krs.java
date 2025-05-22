package JobsheetSem2.P1Jobsheet11.Assignment;

public class Krs {

public class KRS {
    String nim; 
    String name; 
    String studyProgram;
    String classaName;

    public KRS (String nim, String name, String studyProgram, String className) {
        this.nim = nim;
        this.name = name;
        this.studyProgram = studyProgram;
        this.classaName = className;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + studyProgram + " - " + classaName);
    }
}

}
