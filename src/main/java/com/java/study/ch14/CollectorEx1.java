package com.java.study.ch14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CollectorEx1 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bbb", "ccc"};
        Stream<String> strStream = Stream.of(strArr);

        String result = strStream.collect(new ConcatCollector());

        System.out.println(Arrays.toString(strArr));
        System.out.println("result=" + result);
    }
}

//모든 문자열을 하나로 결합해서 String으로 반환하는 ConcatCollector
class ConcatCollector implements Collector<String, StringBuffer, String> {
    @Override
    public Supplier<StringBuffer> supplier() {
        return () -> new StringBuffer();
//        return StringBuilder::new;
    }

    @Override
    public BiConsumer<StringBuffer, String> accumulator() {
        return (sb, s) -> sb.append(s);
//        return StringBuilder::append;
    }

    @Override
    public BinaryOperator<StringBuffer> combiner() {
        return (sb, sb2) -> sb.append(sb2);
    }
    
    @Override
    public Function<StringBuffer, String> finisher() {
        return sb -> sb.toString();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }

}







