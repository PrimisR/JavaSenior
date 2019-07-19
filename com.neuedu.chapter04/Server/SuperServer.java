import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class SuperServer
{
    public static HashMap<String,Socket> users=new HashMap<>();

    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(6666);
            while(true)
            {
                Socket s=ss.accept();
                System.out.println("Here comes a server.");
                ServerThread st=new ServerThread();
                st.setS(s);
                st.start();
            } 
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}