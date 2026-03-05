public class BuildinFunc {
    // static methods : no need to create object of the class 
    public static boolean checkPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }

    public boolean checkPrime2(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] srgs){
        boolean res = checkPrime(5);
       System.out.println(res);

      BuildinFunc inst= new BuildinFunc();
      boolean res2= inst.checkPrime2(4);
       System.out.println(res2);

        // instance methods : it is associated with object or belongs to object.
        //  need to create object of the class and memmory is allocated at the time of object creation
    }
}
