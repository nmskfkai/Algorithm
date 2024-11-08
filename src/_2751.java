/*
N개의 수가 주어졌을 때, 오름차순으로 정렬

첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다.
수는 중복되지 않는다.

첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력
5
5
4
3
2
1

출력 )
1
2
3
4
5

 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class _2751 {
    public static void main(String[] args) throws IOException {
        /*
        버퍼 ? 데이터를 한 곳에서 다른 곳으로 전송하는 동안 일시적으로 데이터를 보관하는 임시 메모리 영역
        입출력 속도 향상
        BufferedReader 는 String 만 입력 받을 수 있다.
        int 값 할당받고 싶으면 int num = Integer.parseInt(br.readLine()); 처럼 형변환 필요
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        br.close();


        // Arrays.sort 는 시간복잡도 O(nlogn),
        // Timsort 를 사용하는데, 이는 삽입 정렬과 병합정렬을 결합한 알고리즘
        Collections.sort(list);

        for(int i : list){
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();


    }
}
