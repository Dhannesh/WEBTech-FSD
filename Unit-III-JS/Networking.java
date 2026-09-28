// class Networking{
//     public static void main(String []args){
//         System.out.println("Hello java");
//     }
// }

// Any internet address can be a specific IP address that may be IPV4 (32 Bit) or IPV6 (128 bit  long)
//InetAddress represents IP Addresses in Java
import java.net.*;

void main() throws Exception{

    IO.println("hello java");
    InetAddress ip = InetAddress.getLocalHost();
    IO.println(ip);

    InetAddress []ips = InetAddress.getAllByName("google.com");
    for(var i:ips){
        IO.println(i);
        IO.println("Host Name:"+i.getHostName());
        IO.println("Host Address:"+i.getHostAddress());
        IO.println("Host isReachable:"+i.isReachable(1000));
    }

}