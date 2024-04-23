package algorithm.b;

import java.util.Scanner;

public class B0210 {

    /**
     * 설명
     * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
     * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
     * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
     * 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
     * 입력
     * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
     * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
     * <p>
     * 출력
     * 봉우리의 개수를 출력하세요.
     * <p>
     * 예시 입력
     * 5
     * 5 3 7 2 3
     * 3 7 1 6 1
     * 7 2 5 3 4
     * 4 3 6 4 1
     * 8 7 3 5 2
     * 예시 출력
     * 10
     */

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n+2][n+2];

        for (int i=1; i<n+1; i++) {
            for (int j=1; j<n+1; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int result = 0;
        int tmp = 0;
        for (int i=0; i<n+1; i++) {
            for (int j=0; j<n+1; j++) {
                if (arr[i][j] != 0) {
                    tmp = Math.max(arr[i][j-1], arr[i][j+1]);
                    tmp = Math.max(tmp, arr[i-1][j]);
                    tmp = Math.max(tmp, arr[i+1][j]);
                    if (arr[i][j] > tmp) {
                        result++;
                    }
                }
            }
        }
        System.out.print(result);
    }
}
