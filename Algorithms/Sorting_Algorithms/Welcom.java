

public class Welcom{
    public static void main(String[] args){
        Employee e1= new Employee("rahul",1);
        Employee e2= new Employee("rami",2);
        Employee e3= new Employee("pari",3);
        Employee.company = "XYZ";

       System.out.println(e1.name);
       System.out.println(e1.id);
       System.out.println(Employee.company);

       System.out.println(e2.name);
       System.out.println(e2.id);
       System.out.println(Employee.company);

       System.out.println(e3.name);
       System.out.println(e3.id);
       System.out.println(Employee.company);
          

       System.out.println("************************************************************");
       
       Employee.company = "abc";

       System.out.println(e1.name);
       System.out.println(e1.id);
       System.out.println(Employee.company);

       System.out.println(e2.name);
       System.out.println(e2.id);
       System.out.println(Employee.company);

       System.out.println(e3.name);
       System.out.println(e3.id);
       System.out.println(Employee.company);
    }
    }
    class Employee{
        String name;
        int id;
       static String company;

        Employee(String name, int id){
            this.name= name;
            this.id= id;
        }
        

    }