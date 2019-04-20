import java.util.*;


public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];


        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int[] cad = new int[num[0]];
        int[] num2 = new int[100];


        if (sc.nextLine()!= null) {
            for (int i = 0; i < num[2]; i++) {
                num2[i] = Integer.parseInt(sc.nextLine());
            }
        }
        int x =0;
        for (int k = 0;k<num[2];k++) {
            if (num[1] != 0) {
                x++;
                num[1]--;
            }
            for (int j = 0; j <num[0]; j++) {
                if (cad[j] != 0 && cad[j] != cad[num2[k]-1]) {
                    x++;
                    cad[j]--;
                }
            }
            cad[num2[k]-1] = cad[num2[k]-1] + x;

        }
        int[] idx = new int[num[0]];

        for (int h = 0;h<cad.length;h++){
            for (int g = 0;g<cad.length;g++)
            if (cad[h]<cad[g]){
                idx[h]++;
            }
        }
        for (int f = 0;f<cad.length;f++){
//            System.out.println(cad[f]);
//            System.out.println(idx[f]);
            if (idx[f]==0){
                System.out.println(f+1);
            }
        }

    }

}
