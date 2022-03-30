import java.util.Scanner;
public class project_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int a = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int b = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String s1 = sc.next();
        char c =s1.charAt(0);
        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String s2 = sc.next();
        char d =s2.charAt(0);
        int e = 0;
        if(a<3){
            e=0;
        }
        else if (c=='y'|| d=='y'){
            e=8000;
        }
        else if (a<13){
            e=4000;
        }
        else if (b>17){
            e=4000;
        }
        else {
            e=10000;
        }
        System.out.println("입장료:"+e);
    }
}
