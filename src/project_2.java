import java.util.Scanner;
public class project_2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int a = sc.nextInt();
        double b = 0;
        if (a*0.1>=300){
            b=300;
        }
        else {
            b= a*0.1-((a*0.1)%100);
        }
        System.out.println("결제 금액은 "+a+"원이고, 캐시백은 "+(int)b+"원 입니다.");
    }
}
