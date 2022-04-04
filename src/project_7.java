import java.util.*;

public class project_7 {
    void lotto(int a) {
        Random ran = new Random();
        int[][] lottoA = new int[a][6];
        int A = 65;
        for (int i = 0; i < a; i++) {
            HashSet<Integer> lo = new HashSet<>();
            while (lo.size() < 6) {
                lo.add((ran.nextInt(45) + 1));
            }
            for (int j = 0; j < lo.size(); j++) {
                Integer[] loA = lo.toArray(new Integer[0]);
                Arrays.sort(loA);
                lottoA[i][j] = loA[j];
                if (j == 5) {
                    System.out.format("%02d", lottoA[i][j]);
                } else if (j == 0) {
                    System.out.print(Character.toString(A + i) + "  ");
                    System.out.format("%02d,", lottoA[i][j]);
                } else {
                    System.out.format("%02d,", lottoA[i][j]);
                }
            }
            System.out.println();
        }
        HashSet<Integer> lo1 = new HashSet<>();
        while (lo1.size() < 6) {
            lo1.add((ran.nextInt(45) + 1));
        }
        System.out.println("[로또 발표]");
        System.out.print("   ");
        Integer[] arr = lo1.toArray(new Integer[0]);
        Arrays.sort(arr);
        ArrayList<Integer>arrList = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < lo1.size(); i++) {

            if (i == 5) {
                System.out.format("%02d\n", arr[i]);
            } else {
                System.out.format("%02d,", arr[i]);
            }
        }
        System.out.println("[내 로또 결과]");
        int b =0;
        for (int i = 0; i <a; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 5) {
                    System.out.format("%02d", lottoA[i][j]);
                    for (int k = 0; k <6 ; k++) {
                        if (arrList.contains(lottoA[i][k])){
                            b=b+1;
                        }
                    }
                    System.out.println(" => "+b+"개 일치");
                    b=0;
                } else if (j == 0) {
                    System.out.print(Character.toString(A + i) + "  ");
                    System.out.format("%02d,", lottoA[i][j]);
                } else {
                    System.out.format("%02d,", lottoA[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
    project_7 pro =new project_7();
    Scanner sc=new Scanner(System.in);
    System.out.println("[로또 당첨 프로그램]\n");
    System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
    int a = sc.nextInt();
    pro.lotto(a);
    }
}