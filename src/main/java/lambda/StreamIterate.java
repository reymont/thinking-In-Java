package lambda;

import java.util.stream.Stream;

/**
 * http://ifeve.com/stream/
 */
public class StreamIterate {

    public static void main(String[] args){
        // 这段代码就是先获取一个无限长度的正整数集合的Stream，然后取出前10个打印。千万记住使用limit方法，不然会无限打印下去
        Stream.iterate(1, item -> item + 1).limit(10).forEach(System.out::println);
    }
}
