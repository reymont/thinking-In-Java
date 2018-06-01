package lambda;

import java.util.*;

public class GetStringNum {

    public static void main(String[] args) {
        String[] strArr = {"funcA","funcB","funcC","D","funcE","FuncF","funcG"};
        Arrays.stream(strArr).filter(s -> s.startsWith("func")).forEach(n -> System.out.println(n+" --> "+n.hashCode()));
    }

}