package Jobsheet10;

import jobsheet12.Student26;

public class StudentAssignmentStack {
    Student26[] stack;
    int top, size;

    StudentAssignmentStack(int size) {
        this.size = size;
        top = -1;
        stack = new Student26[size];
    }
        boolean isFull() {
            if(top==size-1) {
                return true;
            } else {
                return false;
            }
        }

        boolean isEmpty() {
            if(top==-1) {
                return true;
            } else {
                return false;
            }
        }

        void push(Student26 std) {
            if(!isFull()) {
                top++;
                stack[top] = std;
            } else {
                System.out.println("stack is already full!");
            }
        }
    
        Student26 pop() {
            if(!isEmpty()) {
                Student26 std = stack[top];
                top--;
                return std;
            } else {
                System.out.println("There is no data in Stack!!");
                return null;
            }
        }

        Student26 peek() {
            if(!isEmpty()) {
                return stack[top];
            } else {
                System.out.println("There is no data in Stack!!");
                return null;
            }
        }

        void print() {
            for(int i = 0; i <= top; i++) {
                System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
            }
            System.out.println("");
        }
}
