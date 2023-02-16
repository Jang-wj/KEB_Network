package Day24_Probem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Day24_ProblemClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("IP주소 입력 : ");
        String serverIP = sc.nextLine();
        try(Socket client = new Socket(serverIP, 9000);
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));){
            System.out.println(br.readLine());
        } catch (Exception e) {
        }
    }
}
