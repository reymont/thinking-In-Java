package lambda;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * http://rijin.iteye.com/blog/2030464
 */
public class Fibonacci {

    private Map<Integer, Integer> cache = new ConcurrentHashMap<>();

    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        // 代码会先检查下缓存里的结果。如果这步调用还没有结果的，就计算出来并且把结果放进缓存。
        // ConcurrentHashMap.computeIfAbsent()如果在map里没找到给定的key值所对应的entry，
        // 会调用mappingFunction(key)来计算出哈希值，然后执行put(key,value)操作
        return cache.computeIfAbsent(n, (key) -> {
            System.out.println("calculating fib(" + n + ")");
            return fib(n - 2) + fib(n - 1);
        });
    }

    public static void main(String[] args) {
        System.out.println("fib(7) = " + new Fibonacci().fib(7));
    }
}  