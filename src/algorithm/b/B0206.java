package algorithm.b;

import java.util.Scanner;

public class B0206 {

    /**
     * 설명
     * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
     * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
     * 첫 자리부터의 연속된 0은 무시한다.
     * <p>
     * 입력
     * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
     * 각 자연수의 크기는 100,000를 넘지 않는다.
     * <p>
     * 출력
     * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
     * <p>
     * 예시 입력
     * 9
     * 32 55 62 20 250 370 200 30 100
     * 예시 출력
     * 23 2 73 2 3
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input = in.nextInt();
        int[] intArr = new int[input];

        for (int i=0; i<input; i++) {
            intArr[i] = in.nextInt();
        }

        for (int i=0; i<input; i++) {
            int result = 0;
            int tmp = intArr[i];
            while(tmp > 0) {
                int t = tmp % 10;
                result = result * 10 + t;
                tmp = tmp / 10;
            }

            if (isPrime(result)) {
                System.out.print(result + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i=2; i<num; i++) {
            if (num%i == 0) return false;
        }
        return true;
    }
}