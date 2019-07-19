import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientFile
{   
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            Socket s=new Socket("localhost",8888);
             
            OutputStream out=s.getOutputStream();
            InputStream in=s.getInputStream();
            /*DataOutputStream dout=new DataOutputStream(out);
            DataInputStream din=new DataInputStream(in);
            while(true)
            {
                //get
                System.out.println("From Server:"+din.readUTF());//µÈ´ý½ÓÊÕ
                //send
                String msg=sc.nextLine();
                dout.writeUTF(msg);
            }*/
            FileOutputStream fos=new FileOutputStream("ClientFile.txt");
            byte[] buffer=new byte[1024];
            
            int len=in.read(buffer);
            while(len!=-1)
            {
                fos.write(buffer);
                len=in.read(buffer);
            }
        }catch(UnknownHostException e) {//included by IOException
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}