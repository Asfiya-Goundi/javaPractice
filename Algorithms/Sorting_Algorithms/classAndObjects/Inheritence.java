class Account{
    String name="ASFI";
    int accNo;
    float bal=0.0f;
   public void withdraw(int amount){
        if(bal>0.0){
            bal=bal-amount;
        }
        System.out.println("the available balance is: "+ bal);
   }
   public void deposit(int amount){
         bal=bal+amount;
         System.out.println("the available balance is: "+ bal);
   }
}
class SavAcc extends Account{

}

public class Inheritence {
    public static void main(String[] args) {
        SavAcc a= new SavAcc();
        a.deposit(5000);
        a.withdraw(300);   
        System.out.println(a.name);    
        SingleL s= new SingleL();
         System.out.println(s.name);  
         GrandChild g=new GrandChild();
         System.out.println(g.name);  
         g.hi(); 
    }
}

