//N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다.
//        다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
//
//        출력
//        M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
//
//        5               1
//        4 1 5 2 3       1
//        5               0
//        1 3 7 9 5       1
//                        1

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binary(int [] arr, int a){

        // 이분 탐색하는데 언제까지 ? 왼쪽 인덱스가 오른쪽 인덱스보다
        // 커지기 전까지 반으로 나누기

        int lo = 0;
        int ro = arr.length - 1;

        while (lo <= ro){
           int mid = (lo + ro) / 2;

            // 들아온 값이 중간 값보다 작을 경우
            if(a < arr[mid])
                ro = mid - 1;
            // 들어온 값이 중간 값보다 클 경우
            else if (a > arr[mid])
                lo = mid + 1;
            // 같을 경우
            else
                return 1;
        }

        return 0;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        // 들어온 배열 정렬 후 같은지 이분 탐색으로 비교
        Arrays.sort(A);
        int M = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (binary(A, sc.nextInt()) == 1){
                sb.append(1).append('\n');
            } else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
}