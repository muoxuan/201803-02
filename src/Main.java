import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 0,L = 0,t = 0;
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        int [][] ball = new int [n][2];
        L = reader.nextInt();
        t = reader.nextInt();
        for(int i = 0; i < n; i++){
            ball[i][1] = 1;
            ball[i][0] = reader.nextInt();
        }
        for(int i = 0; i < t; i++){
            for(int j = 0; j < n; j++){
                if(ball[j][0] == L){
                    ball[j][1] *= -1;
                }
                if(ball[j][0] == 0){
                    ball[j][1] *= -1;
                }
                ball[j][0] += ball[j][1];

            }
            for(int k = 0; k < n - 1; k++){
                for(int m = k + 1; m < n; m++) {
                    if (ball[m][0] == ball[k][0]) {
                        //System.out.print("***");
                        ball[m][1] *= -1;
                        ball[k][1] *= -1;
                    }
                }
            }

        }

        for(int i = 0; i < n; i++){
            System.out.print(ball[i][0]+" ");
        }
    }
}
