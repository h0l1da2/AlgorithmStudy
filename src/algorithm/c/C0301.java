package algorithm.c;

import java.util.Arrays;
import java.util.Scanner;

public class C0301 {

    /**
     * 설명
     * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
     * <p>
     * 입력
     * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
     * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
     * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
     * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
     * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
     * <p>
     * 출력
     * 오름차순으로 정렬된 배열을 출력합니다.
     * <p>
     * 예시 입력
     * 3
     * 1 3 5
     * 5
     * 2 3 6 7 9
     * 예시 출력
     * 1 2 3 3 5 6 7 9
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] nArr = new int[n];

        for (int i=0; i<n; i++) {
            nArr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] mArr = new int[m];
        for (int i=0; i<m; i++) {
            mArr[i] = in.nextInt();
        }

        int[] result = new int[n+m];
        for (int i=0; i<n; i++) {
            result[i] = nArr[i];
        }
        int cnt = 0;
        for (int i=n; i<n+m; i++) {
            result[i] = mArr[cnt++];
        }

        int[] sortResult = Arrays.stream(result).sorted().toArray();

        for (int i : sortResult) {
            System.out.print(i + " ");
        }
    }
}
