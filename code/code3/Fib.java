package code3;

import java.util.HashMap;

/**
 * Fib.java
 * <p>
 * Illustrates iterative and recursive versions of the Fibonacci function
 *
 * @author Mark Stevenson  (mark.stevenson@sheffield.ac.uk)
 * @version 1.3 * September 2015
 */

public class Fib {
    // 메모이제이션을 위한 HashMap
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    // iterative version
    public static int fib(int n) {
        int n0 = 1;
        int n1 = 1;

        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            int tot = 0;
            for (int i = 2; i < n; i++) {
                tot = n0 + n1;
                n1 = n0;
                n0 = tot;
            }
            return tot;
        }
    }

    // recursive version
    public static int fibr(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            return fibr(n - 1) + fibr(n - 2);
        }
    }

    // 최적화된 재귀적 Fibonacci 함수
    public static int fibrOptimized(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        // 이미 계산된 값이 있다면 반환
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // 계산 후 메모에 저장
        int result = fibrOptimized(n - 1) + fibrOptimized(n - 2);
        memo.put(n, result);

        return result;
    }

    // main
    public static void main(String[] args) {
        System.out.println("Iterative...");
        long startTime = System.nanoTime();  // 시작 시간 측정
        for (int i = 1; i < 40; i++) fib(i); // 반복 버전 실행
        long endTime = System.nanoTime();    // 끝 시간 측정

        long totalTime = endTime - startTime; // 총 실행 시간
        System.out.println("Iterative : " + totalTime + " ns");

        System.out.println("\nRecursive...");
        long startTime2 = System.nanoTime();  // 시작 시간 측정
        for (int i = 1; i < 40; i++) fibr(i); // 재귀 버전 실행
        long endTime2 = System.nanoTime();    // 끝 시간 측정

        long totalTime2 = endTime2 - startTime2; // 총 실행 시간
        System.out.println("Recursive : " + totalTime2 + " ns");
        System.out.println("\nOptimized Recursive...");

        long startTime3 = System.nanoTime();
        for (int i = 1; i < 40; i++) fibrOptimized(i);
        long endTime3 = System.nanoTime();
        long totalTime3 = endTime3 - startTime3;
        System.out.println("Optimized Recursive : " + totalTime3 + " ns");

        double efficiency = (double) totalTime2 / totalTime;
        // 성능 비교
        System.out.println("\nIterative is more " + efficiency + " times efficient...");
    }
}
