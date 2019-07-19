import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientStart
{   
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            Socket s=new Socket("localhost",8888);

            GetMessageThread gmt=new GetMessageThread(s);
            gmt.start();
            OutputStream out=s.getOutputStream();
            //InputStream in=s.getInputStream();
            DataOutputStream dout=new DataOutputStream(out);
            //DataInputStream din=new DataInputStream(in);
            while(true)
            {
                //get
                //System.out.println("From Server:"+din.readUTF());//等待接收
                //send
                String msg=sc.nextLine();
                dout.writeUTF(msg);//只负责接收
            }
        }catch(UnknownHostException e) {//included by IOException
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}