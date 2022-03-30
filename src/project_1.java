import java.sql.SQLOutput;

public class project_1 {
    public static void main(String[] args){
        System.out.println("[구구단 출력]");
        for (int i=1; i<10; i++){
            for (int j=1; j<10; j++){
                String a = String.format("%02d",i);
                String b = String.format("%02d",j);
                String c = String.format("%02d",i*j);
                System.out.print(b+" x "+a+" = "+c+"\t");
            }
            System.out.println();
        }
    }
}
