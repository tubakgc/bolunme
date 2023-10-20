import java.util.Scanner;

public class yeniBolunme {
    public static void main(String[] args) {
        int k;
        Scanner inp =new Scanner(System.in);

        System.out.print("sayıyı giriniz:");
        k= inp.nextInt();

        for (int i=1 ; i<=k; i++ ){
            if (i % 12 == 0){
                System.out.println(i);

            }


        }

    }
}
