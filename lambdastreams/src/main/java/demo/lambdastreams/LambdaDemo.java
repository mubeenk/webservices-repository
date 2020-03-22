package demo.lambdastreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> getRandom = () -> { return Math.random();};
		Double random = getRandom.get();
		//System.out.println(random);
		
		int[] values = {1,2,3,4,6,3,2,4};
		
		OptionalInt val = Arrays.stream(values)
				.sorted()
				.distinct()
				.max();
				//.forEach(val->System.out.println("val : " + val));
		System.out.println(val.getAsInt());
		
		//Stream.iterate(10, n->n+1)
		//	   .limit(10)
		//	   .forEach(item->System.out.println(item));

	}

}
