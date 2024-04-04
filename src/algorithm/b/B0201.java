package algorithm.b;

import java.util.Scanner;

public class B0201 {

    /**
     * 설명
     * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
     * (첫 번째 수는 무조건 출력한다)
     * <p>
     * 입력
     * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
     * <p>
     * 출력
     * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
     * <p>
     * 예시 입력
     * 6
     * 7 3 9 5 6 12
     * 예시 출력
     * 7 9 6 12
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int base = Integer.parseInt(in.nextLine());
        String input = in.nextLine();

        String[] inputArr = input.split(" ");
        int prev = Integer.parseInt(inputArr[0]);
        for (String s : inputArr) {
            int i = Integer.parseInt(s);
            if (prev <= i) {
                System.out.print(s + " ");
            }
            prev = i;
        }
    }
}
