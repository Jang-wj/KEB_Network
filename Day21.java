import java.net.InetAddress;
import java.net.UnknownHostException;

public class Day21 {
    public static void main(String[] args) {
        try {  // try (try 구문에서 사용할 객체 생성 선언 try블럭이 끝나면 소멸){}
            InetAddress addr = InetAddress.getByName("www.inha.ac.kr");
//            InetAddress addr = InetAddress.getByName("www.kiminha.ac.kr");
            System.out.println(addr);
            System.out.println(addr.getCanonicalHostName());
            System.out.println(addr.getHostAddress());
            System.out.println(addr.getHostName());
        } catch (UnknownHostException e) {
            //throw new RuntimeException(e);
            System.out.println("해당 URL은 존재하지 않습니다.");
        }
    }
}