import java.util.Scanner;

public class Main_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        int M = scn.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println(); 
        }

        scn.close();
    }
}