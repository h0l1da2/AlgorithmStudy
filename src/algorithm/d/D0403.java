package algorithm.d;

import java.util.*;

public class D0403 {

    /**
     * 설명
     * 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
     * 각 구간별로 구하라고 했습니다.
     * 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
     * 20 12 20 10 23 17 10
     * 각 연속 4일간의 구간의 매출종류는
     * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
     * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
     * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
     * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
     * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
     * 매출액의 종류를 출력하는 프로그램을 작성하세요.
     * <p>
     * 입력
     * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
     * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
     * <p>
     * 출력
     * 첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.
     * <p>
     * 예시 입력
     * 7 4
     * 20 12 20 10 23 17 10
     * 예시 출력
     * 3 4 4 3
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt(); // n 일
        int m = in.nextInt(); // 구간

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        list.add(map.size());
        int tmp = map.get(arr[0]);

        if (tmp == 1) {
            map.remove(arr[0]);
        } else {
            map.put(arr[0], map.get(arr[0]) - 1);
        }

        for (int i=m; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            list.add(map.size());
            tmp = map.get(arr[i - m + 1]);

            if (tmp == 1) {
                map.remove(arr[i - m + 1]);
            } else {
                map.put(arr[i - m + 1], map.get(arr[i - m + 1])-1);
            }
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
