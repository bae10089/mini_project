import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class project_6 {
   void president(){
        Random ran=new Random();
        String l="이재명";
        double l1 =0;
        String y="윤석열";
        double y1=0;
        String s="심상정";
        double s1=0;
        String a="안철수";
        double a1=0;
        String k = "";
       for (int i = 0; i <10000 ; i++) {
           int A=ran.nextInt(4);
           switch (A){
               case 0: l1++;
                       k=l;
                       break;
               case 1: y1++;
                       k=y;
                       break;
               case 2: s1++;
                       k=s;
                       break;
               case 3: a1++;
                       k=a;
                       break;
           }
           if (i<9999) {
               System.out.format("[투표진행율]: %.2f%%, %d명 투표 ==> " + k + "\n", (double) (i+1) / 100, i + 1);
               System.out.print("[기호:1] " + l + ":");
               System.out.format("%.2f%%,   ", l1 / 100);
               System.out.print("(투표수: " + (int) l1 + ")\n");
               System.out.print("[기호:2] " + y + ":");
               System.out.format("%.2f%%,   ", y1 / 100);
               System.out.print("(투표수: " + (int) y1 + ")\n");
               System.out.print("[기호:3] " + s + ":");
               System.out.format("%.2f%%,   ", s1 / 100);
               System.out.print("(투표수: " + (int) s1 + ")\n");
               System.out.print("[기호:4] " + a + ":");
               System.out.format("%.2f%%,   ", a1 / 100);
               System.out.print("(투표수: " + (int) a1 + ")\n");
           }
           else if (i==9999){
               ArrayList<Double>arrList = new ArrayList<>();
               double[] arr = {l1,y1,s1,a1};
               arrList.add(l1);
               arrList.add(y1);
               arrList.add(s1);
               arrList.add(a1);
               HashMap<Double,String> map = new HashMap<Double, String>();
               map.put(l1,l);
               map.put(y1,y);
               map.put(s1,s);
               map.put(a1,a);
               double A1=0;
               for (int j = 0; j <arrList.size() ; j++) {
                   A1=Math.max(A1,arr[j]);
               }
               System.out.format("[투표진행율]: %.2f%%, %d명 투표 ==> " + k + "\n", (double) (i+1) / 100, i + 1);
               System.out.print("[기호:1] "+l+":");
               System.out.format("%.2f%%,   ",l1/100);
               System.out.print("(투표수: "+(int)l1+")\n");
               System.out.print("[기호:2] "+y+":");
               System.out.format("%.2f%%,   ",y1/100);
               System.out.print("(투표수: "+(int)y1+")\n");
               System.out.print("[기호:3] "+s+":");
               System.out.format("%.2f%%,   ",s1/100);
               System.out.print("(투표수: "+(int)s1+")\n");
               System.out.print("[기호:4] "+a+":");
               System.out.format("%.2f%%,   ",a1/100);
               System.out.print("(투표수: "+(int)a1+")\n");
               System.out.print("[투표결과] 당선인: "+map.get(A1));

           }
       }

    }
    public static void main(String[] args) {
       project_6 pro=new project_6();
       pro.president();
    }
}
