class Application{
    public static void main(String[] args){
        byte read =1;//0000 0001
        byte write = 2;// 0000 0010
        byte exec =4;//0000 0100
        int perm = read|write;
        if((perm &write)!=0){
   System.out.println("can write");
        }
    }
}