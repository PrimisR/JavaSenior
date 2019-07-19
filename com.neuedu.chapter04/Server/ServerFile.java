import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerFile
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //1.open a listening port
        try {//防止被占用
            ServerSocket ss=new ServerSocket(8888);//监听端口
            //2.accept connection from client
            Socket s=ss.accept();//s stands for a temporary port for communication
            //3.give input and out stream
            OutputStream out=s.getOutputStream();
            InputStream in=s.getInputStream();
            //4.wrap stream into reader/writer
            //DataOutputStream dout=new DataOutputStream(out);
            //DataInputStream din=new DataInputStream(in);
            
            //send file
            FileInputStream fis=new FileInputStream("ServerFile.txt");

            byte[] buffer=new byte[1024];

            int len=fis.read(buffer);
            while(len!=-1)
            {
                out.write(buffer,0,len);
                len=fis.read(buffer);
            }
            out.flush();
            out.close();//要关闭流，否则接收方无法接受-1
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}