
import java.util.Scanner;
    

public class Hellow {

    public static void main(String[] args) {
        
        
        Scanner keyboardScan =new Scanner(System. in);
        
        System.out.print("번호? ");
        String no = keyboardScan.nextLine();

        System.out.print("이름? ");
        String name = keyboardScan.nextLine();

        System.out.print("이메일? ");
        String email = keyboardScan.nextLine();

        System.out.print("암호? ");
        String password = keyboardScan.nextLine();

        System.out.print("사진? ");
        String photo = keyboardScan.nextLine();

        System.out.print("전화? ");
        String tel = keyboardScan.nextLine();

        java.sql.Date now = new java.sql.Date(System.currentTimeMillis());

        keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

        System.out.println("--------------------------------");

        System.out.println("번호: " + no);
        System.out.println("이름: " + name);
        System.out.println("이메일: " + email);
        System.out.printf("암호: %s\n", password);
        System.out.printf("사진: %s\n", photo);
        System.out.printf("전화: %s\n", tel);
        System.out.printf("가입일: %s\n", now);
    }
}