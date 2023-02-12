package com.teogong.ex10;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerTest {
	public static void main(String[] args) {
		// (t) -> System.out.println(t + " Class");
		Consumer<String> consumer = t -> System.out.println(t + " Class");
		consumer.accept("Java");
		
		BiConsumer<String,String> biConsumer = (t, u) -> System.out.println(t +u);
		biConsumer.accept("Java", "코스");
		
		DoubleConsumer doubleConsumer = d -> System.out.println(d + "를 10으로 나눈 나머지는 " + d % 10 + "입니다.");
		doubleConsumer.accept(14.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8);
	}
}
