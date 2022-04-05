import java.util.Scanner;

public class project_8 {
    void income(int a){
        if (a>1000000000){
            System.out.println("12000000 * 6% = 720000");
            System.out.println("34000000 * 15% = 5100000");
            System.out.println("42000000 * 24% = 10080000");
            System.out.println("62000000 * 35% = 21700000");
            System.out.println("150000000 * 38% = 57000000");
            System.out.println("200000000 * 40% = 80000000");
            System.out.println("500000000 * 40% = 210000000");
            System.out.println(a-1000000000+" * 45% = "+(int)((a-1000000000)*0.45));

            System.out.println("[세율에 의한 세금]:    "+(720000+5100000+10080000+21700000+57000000+80000000+210000000+(int)((a-1000000000)*0.45)));
            System.out.println("[누진공제 계산에 의한 세금]:"+Math.round((a*0.45)-65400000));
        }
        else if (a>500000000 && a<=1000000000){
            System.out.println("12000000 * 6% = 720000");
            System.out.println("34000000 * 15% = 5100000");
            System.out.println("42000000 * 24% = 10080000");
            System.out.println("62000000 * 35% = 21700000");
            System.out.println("150000000 * 38% = 57000000");
            System.out.println("200000000 * 40% = 80000000");
            System.out.println(a-500000000+" * 42% = "+(int)((a-500000000)*0.42));
            System.out.println("[세율에 의한 세금]:    "+(720000+5100000+10080000+21700000+57000000+80000000+(int)((a-500000000)*0.42)));
            System.out.println("[누진공제 계산에 의한 세금]:"+Math.round((a*0.42)-35400000));
        }
        else if (a<=500000000 && a>300000000){
            System.out.println("12000000 * 6% = 720000");
            System.out.println("34000000 * 15% = 5100000");
            System.out.println("42000000 * 24% = 10080000");
            System.out.println("62000000 * 35% = 21700000");
            System.out.println("150000000 * 38% = 57000000");
            System.out.println(a-300000000+" * 40% = "+(int)((a-300000000)*0.4));
            System.out.println("[세율에 의한 세금]:    "+(720000+5100000+10080000+21700000+57000000+(int)((a-300000000)*0.4)));
            System.out.println("[누진공제 계산에 의한 세금]:"+Math.round((a*0.4)-25400000));
        }
        else if (a<=300000000 && a>150000000){
            System.out.println("12000000 * 6% = 720000");
            System.out.println("34000000 * 15% = 5100000");
            System.out.println("42000000 * 24% = 10080000");
            System.out.println("62000000 * 35% = 21700000");
            System.out.println(a-150000000+" * 38% = "+(int)((a-150000000)*0.38));
            System.out.println("[세율에 의한 세금]:    "+(720000+5100000+10080000+21700000+(int)((a-150000000)*0.38)));
            System.out.println("[누진공제 계산에 의한 세금]:"+Math.round((a*0.38)-19400000));
        }
        else if(a<=150000000 && a>88000000){
            System.out.println("12000000 * 6% = 720000");
            System.out.println("34000000 * 15% = 5100000");
            System.out.println("42000000 * 24% = 10080000");
            System.out.println(a-88000000+" * 35% = "+(int)((a-88000000)*0.35));
            System.out.println("[세율에 의한 세금]:    "+(720000+5100000+10080000+(int)((a-88000000)*0.35)));
            System.out.println("[누진공제 계산에 의한 세금]:"+Math.round((a*0.35)-14900000));
        }
        else if (a<=88000000 && a>46000000){
            System.out.println("12000000 * 6% = 720000");
            System.out.println("34000000 * 15% = 5100000");
            System.out.println(a-46000000+" * 24% = "+(int)((a-46000000)*0.24));
            System.out.println("[세율에 의한 세금]:    "+(720000+5100000+(int)((a-46000000)*0.24)));
            System.out.println("[누진공제 계산에 의한 세금]:"+Math.round((a*0.24)-5220000));
        }
        else if (a<=46000000 && a>12000000){
            System.out.println("12000000 * 6% = 720000");
            System.out.println(a-12000000+" * 15% = "+(int)((a-12000000)*0.15));
            System.out.println("[세율에 의한 세금]:    "+(720000+(int)((a-12000000)*0.15)));
            System.out.println("[누진공제 계산에 의한 세금]:"+Math.round((a*0.15)-1080000));
        }
        else if (a<=12000000){
            System.out.println(a+" * 6% = "+(int)(a*0.05));
            System.out.println("[세율에 의한 세금]:    "+(int)(a*0.06));
            System.out.println("[누진공제 계산에 의한 세금]:"+Math.round(a*0.06));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        project_8 pro =new project_8();
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        int a = sc.nextInt();
        pro.income(a);

    }
}
