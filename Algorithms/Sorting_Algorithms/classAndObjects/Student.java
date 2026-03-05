//package classAndObjects;

public class Student {
    int rollno;
    String name;
    int marks;
    public Student(int rollno,String name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
    public void display(){
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student s=new Student(12,"ron",78);
        s.display();
    }
}
