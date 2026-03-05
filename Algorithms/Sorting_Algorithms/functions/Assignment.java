public class Assignment {
    public static void print(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void square(int num){
        System.out.println(num*num);

    }

    public static void evenOdd(int num){
              if(num%2==0){
                System.out.println(num +" is a even number");
              }else
                System.out.println(num+" is a odd number");
    }

public static void max(int a,int b){
    int res= a>b?a:b;
    System.out.println(res +" is the bigger number");
}

public static int revers(int num){
    int digit;
    int no=0;
         while(num>0){
            digit=num%10;
             no=no*10+digit;
             num=num/10;
         }
        
         return no;
}


public static int elem(int[] arr){
    return arr.length;
}

public static void arrayPrime(int[] arr){
          for(int i=0;i<arr.length;i++){
            boolean isprime=true;
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    isprime=false;
                    break;
                }
                }
            
            if(isprime){
                System.out.println(arr[i]+" prime number");
            }else{
                System.out.println(arr[i]+" not a prime");
            }
          }
}

public static int[] sum(int[] arr3,int[] arr4){
    int[] arr5=new int[arr4.length];
    for(int i=0;i<arr3.length;i++){
            arr5[i]=arr3[i]+arr4[i];
    }
    return arr5;
}

    public static void main(String[] args) {
        print();
        square(5);
        int res1= revers(1235);
        int[] arr1={2,4,6,1,45};
        int[] arr2={6,7,2,3,4};
        int res2=elem(arr1);
        System.out.println(res2);
        arrayPrime(arr1);
        int[] res;
        res=sum(arr1,arr2);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
        }}
