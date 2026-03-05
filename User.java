import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "rahul";
        String password = " ragul99";
        System.out.println("enter the user name:");
        String username = sc.next();
        if(username.equals(user)){
            System.out.println("enetr the password:");
            String userpass = sc.next();
            if(password.equals(userpass)){
                System.out.println("allow access");
            }else{
                System.out.println("wrong password!! enter correct password ");
            }
        }else{
            System.out.println("wrong user name !!!");
        }

}
}
