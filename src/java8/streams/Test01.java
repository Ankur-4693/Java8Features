package java8.streams;

import java.util.Arrays;
import java.util.List;

import java8.functionalInterfaces.Print;

public class Test01 {

	public static void main(String[] args) {
//	Creating stream
		List<String> list=Arrays.asList("aasd","wefw","we","ggg");
		
		Print pr=(amk)-> amk;
		System.out.println(pr.print(12));

	}

}
