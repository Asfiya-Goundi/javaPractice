
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStream {
public static void  main(String[] args)
{
    try {
        FileOutputStream fos = new FileOutputStream("myData.text",true);
        fos.write(65);
        fos.write(66);

        byte[] arr ={97,98,100,101,102};
        fos.write(arr);

         FileInputStream fis = new FileInputStream("myData.text");
        //System.out.println(fis.read());

       // while(fis.read() !=-1){
         //   System.out.println(fis.read());
        //}

        BufferedOutputStream bos = new BufferedOutputStream(fos);
            String line;
         //   while((line=fis.())!=-1){
           //    System.out.println(line);
           // }
        int i;
           while((i=fis.read())!=-1){
             System.out.println((char)i);
            }

            byte[] res = new byte[100];
            res[1]=60;
            res[2]=50;
            fis.read(res);

            for(int j: res){
                System.out.println(j);
            }

          DataOutputStream dos = new DataOutputStream("myData.text");

          dos.write
            DataInputStream dis = new DataInputStream(fis);
            
          fis.close();
        fos.flush();
        fos.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    }

