public class Employee {
      String name;
      int empid;
      String job;
      double salary;
      int phoneno;
      public Employee(){

      }

       Employee(String name,int empid){
        this.name=name;
        this.empid=empid;
       }
      Employee(String name,int empid,String job,double salary){
       // this.name=name;
        //this.empid=empid;
        //System.out.println("hii"); ---ERROR :- the first statement is the constructor should be this() call . we cant use the other statements.
        this(name,empid);// this() : this is used to call one contructor from other constructor.
        this.job=job;
        this.salary=salary;
      }

       Employee(String name,int empid,String job,double salary,int phoneno){
       // this.name=name;
        //this.empid=empid;
        //this.job=job;
        //this.salary=salary;
        this(name,empid,job,salary); 
        this.phoneno=phoneno;
       }

       public static void test(){
        System.out.println("hello !!!!" );
       }

      public void display(){
        this.test();
        //Employee.test();
        System.out.println("name: "+name);
         System.out.println("emp ID : "+ empid);
          System.out.println("job: "+job);
           System.out.println(" salary : "+salary);
           
           // this class is initialized by the main11 class.
      }
    }

