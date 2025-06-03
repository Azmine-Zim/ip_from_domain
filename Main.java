import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Website name  : ");
        String webname =sc.nextLine();

        try{
            InetAddress address= InetAddress.getByName(webname);
            System.out.println("HOST ADDRESS        : "+address.getHostAddress());
            System.out.println("CANONICAL HOST NAME : "+address.getCanonicalHostName());
            System.out.println("HOST NAME           : "+address.getHostName());

            if(address.isReachable(10000)){
                System.out.println(webname + " is reachable. ");

            }
            else{
                System.out.println(webname + " is not reachable");
            }
        }
        catch(IOException e){
            System.err.println("Error :"+e.getMessage());
        }
        finally{
            sc.close();
        }

    }


}


