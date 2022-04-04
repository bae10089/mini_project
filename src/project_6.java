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
       for (int i = 0; i <10000 ; i++) {
           int A=ran.nextInt(4);
           switch (A){
               case 0: l1++;
                       break;
               case 1: y1++;
                       break;
               case 2: s1++;
                       break;
               case 3: a1++;
                       break;
           }
       }
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
       double A=0;
       for (int i = 0; i <arrList.size() ; i++) {
           A=Math.max(A,arr[i]);
       }
       System.out.println("[투표진행율]: 100.00%, 10000명 투표");
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
       System.out.print("[투표결과] 당선인: "+map.get(A));

    }
    public static void main(String[] args) {
       project_6 pro=new project_6();
       pro.president();
    }
}
