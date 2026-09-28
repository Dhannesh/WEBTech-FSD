import java.io.*;
import java.net.*;

void main() throws Exception {
    try (Socket s = new Socket("localhost",5000);
    PrintWriter out = new PrintWriter(s.getOutputStream(),true);
    BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()))){
        out.println("hello Server");
        IO.println("Server Says:"+in.readLine());
    };
    
}