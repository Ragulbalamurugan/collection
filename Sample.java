package Collection;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(87);
		list.add(5);
		list.add(3);
		list.add(45);
		list.add(65);
		list.add(23);
		list.add(34);
		list.add(89);
		list.add(45);
		list.add(5, 66);
		list.set(3, 32);
		list.remove(6);

// for loop
		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) % 2 == 0) {
				System.out.println(list.get(i) + " is a even number");
			}
		}
// Enhanced for loop
		for (Integer val : list) {
			if (val % 2 != 0) {
				System.out.println(val + " is a odd number");
			}
		}

// forEach loop , we cannot use bulk operation we can only use individual operation

		// list.forEach((x)-> System.out.println(x));
		list.forEach((y) -> {
			if (y % 2 != 0) {
				System.out.println(y + " is a done by forEach loop");
			}
		});

// String ArrayList;

		ArrayList<String> string = new ArrayList<>(); // ArrayList syntax
		string.add("Ragul");
		string.add("somasundhar");
		string.add("kowsik");
		string.add("selvarani");
		string.add("livya");
		string.add("sarintha");
		string.add("rajalakshmi");

// for loop
		String max = string.get(0);
		for (int i = 0; i < string.size(); i++) {

			if (string.get(i).length() >= max.length()) {
				max = string.get(i);
			}

		}
		System.out.println(max + " is a long string value");
// Enhanced forLoop		
		String min = string.get(0);
		for (String value : string) {
			if (value.length() <= min.length()) {
				min = value;
			}
		}
		System.out.println(min + " is the small length in the Integer ArrayList");

// forEa
		string.forEach((values) -> {
			System.out.println(values + " is used to print using forEach");

		});

		ArrayList<Double> num = new ArrayList<>();

		num.add(345.654d);
		num.add(321.56d);
		num.add(654.34d);
		num.add(8765.232d);
		num.add(456.234d);
		num.add(654.34543d);
		num.add(345.6545d);
		
		System.out.println(num.remove(1));
		
		System.out.println();

		for (Double d : num) {
			System.out.println(d);
		}

		for (int i = 0; i < num.size(); i++) {
			if (num.get(i) % 2 == 0) {
				System.out.println(num.get(i) + " is a even double value");
			}
		}

	}

}
