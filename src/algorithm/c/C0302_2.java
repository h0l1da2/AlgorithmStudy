package algorithm.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C0302_2 {

    /**
     * 설명
     * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
     * <p>
     * 입력
     * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
     * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
     * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
     * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
     * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
     * <p>
     * 출력
     * 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
     * <p>
     * 예시 입력
     * 5
     * 1 3 9 5 2
     * 5
     * 3 2 5 7 8
     * 예시 출력
     * 2 3 5
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = in.nextInt();
        }
        int[] arr = new int[n+m];
        for (int i=0; i<n; i++) {
            arr[i] = nArr[i];
        }
        int cnt = 0;
        for (int i=n; i<n+m; i++) {
            arr[i] = mArr[cnt++];
        }

        int[] sortArr = Arrays.stream(arr).sorted().toArray();

        int tmp = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<sortArr.length; i++) {
            if (sortArr[i-1] == sortArr[i] && sortArr[i] != tmp) {
                list.add(sortArr[i]);
                tmp = sortArr[i];
            }
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
