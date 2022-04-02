import java.util.*;
import java.time.LocalDate;
public class project_5 {
    public static void cal(int a, int b){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("SUNDAY",0);
        map.put("MUNDAY",1);
        map.put("TUESDAY",2);
        map.put("WEDNESDAY",3);
        map.put("THURSDAY",4);
        map.put("FRIDAY",5);
        map.put("SATURDAY",6);
        ArrayList<Integer> m1 = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12)); // 31일 이 끝 인달
        ArrayList<Integer> m2 = new ArrayList<>(Arrays.asList(4,6,9,11)); // 30일 이 끝 인달
        LocalDate date = LocalDate.of(a,b,1);
        System.out.format("["+a+"년 "+"%02d"+"월]\n",b);
        System.out.println(" 일  월  화  수  목  금  토");
        int a1 = 1;
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <7 ; j++) {
                if(j==0 && map.get(date.getDayOfWeek().toString())>=1&&i==0){
                    System.out.print("    ".repeat(map.get(date.getDayOfWeek().toString())));
                    j=j+map.get(date.getDayOfWeek().toString())-1;
                }
                else{
                    System.out.format("%02d", a1);
                    System.out.print("  ");
                    a1 = a1 + 1;
                }
                if (m1.contains(b)){
                    if(a1>=32){
                        break;
                    }
                }
                else if (m2.contains(b)){
                    if(a1>=31){
                        break;
                    }
                }
                else if (b==2&&date.isLeapYear()){
                    if(a1>=30){
                        break;
                    }
                }
                else if(b==2){
                    if(a1>=29){
                        break;
                    }
                }
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy)");
        int a= sc.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm)");
        int b= sc.nextInt();
        cal(a,b);
    }
}
