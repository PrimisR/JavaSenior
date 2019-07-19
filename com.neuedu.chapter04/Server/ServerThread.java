import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.alibaba.fastjson.JSON;

public class ServerThread extends Thread
{
    private Socket s;

    /**
     * @param s the s to set
     */
    public void setS(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
    while(true) {    
        try {
            InputStream in=s.getInputStream();
            DataInputStream dis=new DataInputStream(in);
            String message=dis.readUTF();
            //str->object
            Message m=JSON.parseObject(message,Message.class);
            System.out.println(message);
            if(m.getCode()==101)
            {
                //login
                SuperServer.users.put(m.getName(),s);
                System.out.println(m.getName()+" login.");
            }
            else if(m.getCode()==102)
            {
                String to=m.getTo();
                String name=m.getName();
                String msg=m.getMessage();
                //send message to someone
                
                Socket targetPerson=SuperServer.users.get(to);
                if(targetPerson!=null)
                {
                    OutputStream out=targetPerson.getOutputStream();
                    DataOutputStream dos=new DataOutputStream(out);
                    synchronized(ServerThread.class)//¼ÓÍ¬²½Ëø
                    {
                        dos.writeUTF("From: "+name+" Message: "+msg);
                        dos.flush();
                    }
                }
            }
        }
         catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    }
}