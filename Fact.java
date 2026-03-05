public class Fact {
    static int fact(int n){
        if(n==0)
            return 1;

        return fact(n-1)*n;
    }
    public static void main(String[] args){
        int res=fact(6);
        System.out.println(res);
    }
}
