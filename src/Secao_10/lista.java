package Secao_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lista {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add("Junior");
		list.add(2, "Marcos");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------------");
		list.removeIf(x -> (x.charAt(0) == 'm'));

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Junior: " + list.indexOf("Junior"));
		System.out.println("-----------------------------");
		List<String> result = list.stream().filter(y -> (y.charAt(0) == 'A')).collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("-----------------------------");
		String name = list.stream().filter(x -> (x.charAt(0) == 'P')).findFirst().orElse(null);
		System.out.println(name);
	}

}
