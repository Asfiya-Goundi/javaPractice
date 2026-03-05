public class threeJaggedArrayInitialization {
    public static void main(String[] args) {
        String[][][] arr= new String[2][][];

         arr[0] =new String[3][];  // java
         arr[1] =new String[2][];    // SQL

         //String[][] first2D = arr[0];

         arr[0][0]= new String[2];  // java 1st class student attended 2 session
          arr[0][1]= new String[3];     //java 2nd class student attended 3 session
           arr[0][2]= new String[1];     //java 3rd class student attended 1 session

           arr[0][0][0] = "jvm";
           arr[0][0][1] =" datatypes";

           arr[0][1][0] = "jvm";
           arr[0][1][1] ="datatypes";
           arr[0][1][2] =" operators";

           arr[0][2][0] ="jvm";
    }


}
