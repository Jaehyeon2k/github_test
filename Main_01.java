import java.util.Scanner;

public class Main_01 {
    public static void main(String[] args) {
//      입력
//      첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.

//      출력
//      A+B+C의 값을 출력한다.

        Scanner scn = new Scanner(System.in);

        int A = scn.nextInt(); 
        int B = scn.nextInt();
        int C = scn.nextInt();

        int result = A + B + C;

        System.out.println(result);

        scn.close(); 
    }
}
