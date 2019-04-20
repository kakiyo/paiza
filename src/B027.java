import java.util.Scanner;

public class B027 {
    public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int[] num = new int[2];
    int total = 0;
        int sum= 0;

    for (int i = 0; i < num.length; i++) {
        num[i] = sc.nextInt();
    }
    for (int j= 0; j < num[1]; j++){
        for (int k= 0; k < num[0]; k++){
           int ss =sc.nextInt();
            sum +=ss;
//            System.out.print(sum);
        }
        if (sum>=0){
            total = total + sum;
            sum = 0;
//            System.out.print(total);
        }
    }
System.out.println(total);


 }
}
