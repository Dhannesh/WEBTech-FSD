import java.io.*;
import java.net.*;

void main() throws Exception{

    ServerSocket ss= new ServerSocket(5000);
    IO.println("Waiting for client");
    while(true){
        Socket s = ss.accept();
        IO.println("Client received:"+ss);
        new Thread (()->{
            try{
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(s.getOutputStream(),true);
            IO.println("Client Says: "+in.readLine());
            out.println("Hello Client");
            }catch(Exception ex){
                IO.println(ex);
            }
        }).start();
    }

}