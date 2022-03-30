import java.util.Scanner;
import java.util.Random;
public class project_4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int a = sc.nextInt();
        System.out.print("출생월을 입력해 주세요.(mm):");
        int b = sc.nextInt();
        System.out.print("출생일을 입력해 주세요.(dd):");
        int c = sc.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String d = sc.next();
        int e = random.nextInt(1000000);
        int f = 0;
        if (d.equals("m")){
            f=3;
        }
        else {
            f=4;
        }
        System.out.printf("%d%d%d-%d%d",(a%100),b,c,f,e);

    }
}
