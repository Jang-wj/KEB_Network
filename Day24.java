import java.net.InetAddress;
import java.net.UnknownHostException;

public class Day24 {
    public static void main(String[] args) {
        InetAddress names[] = new InetAddress[0];
        try {
            names = InetAddress.getAllByName("www.naver.com");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        for(InetAddress element : names) {
            System.out.println(element);
        }

        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.packtpub.com");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        displayInetAddressInformation(address);
    }
    private static void displayInetAddressInformation(InetAddress address) {
        System.out.println(address);
        System.out.println("CanonicalHostName: " + address.getCanonicalHostName());
        System.out.println("HostName: " + address.getHostName());
        System.out.println("HostAddress: " + address.getHostAddress());
    }
}
