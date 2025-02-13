package silver.array;

import java.io.*;
import java.util.*;

// 백준 : 두 수의 합
public class Solution3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 수열의 크기

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n]; // 수열에 포함되는 수를 넣을 배열
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        int x = Integer.parseInt(br.readLine()); // x

        int count = 0; // 쌍의 개수를 카운트
        int start = 0;
        int end = n-1;
        while (start < end) {
            if (a[start] + a[end] == x) count++;
            if (a[start] + a[end] <= x) start++;
            else end--;
        }
        System.out.println(count);
    }
}
