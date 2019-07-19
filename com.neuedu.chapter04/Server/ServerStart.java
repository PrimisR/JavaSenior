import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerStart
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //1.open a listening port
        try {//防止被占用
            ServerSocket ss=new ServerSocket(8888);//监听端口
            //2.accept connection from client
            Socket s=ss.accept();//s stands for a temporary port for communication
            
            //3.startup thread for getting message
            GetMessageThread gmt=new GetMessageThread(s);
            gmt.start();
            
            ////3.give input and out stream
            OutputStream out=s.getOutputStream();
            //InputStream in=s.getInputStream();

            //4.wrap stream into reader/writer
            DataOutputStream dout=new DataOutputStream(out);
            //DataInputStream din=new DataInputStream(in);
            while(true)
            {
                String msg=sc.nextLine();
                //send
                dout.writeUTF(msg);
                //get
                //System.out.println("From Client:"+din.readUTF());//等待接收
            }//只接收信息
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}