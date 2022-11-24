package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String[] args) {

		Car c1 = new Car("maruthi", 500000, "white", false);

		Car c2 = new Car("swift", 6000000, "red", true);

		Car c3 = new Car("Rolls royce", 9000000, "black", true);

		Car c4 = new Car("bmw", 5000000, "green", true);

		Car c5 = new Car("Tata", 100000, "yellow", false);

		Car c6 = new Car("volswegan", 3000000, "blue", true);

		Car c7 = new Car("scarpio", 1200000, "skyblue", false);

		Car c8 = new Car("audio", 5000000, "lightblack", true);

		Car c9 = new Car("tesla", 2000000, "bluish", false);

		Car c10 = new Car("lamborghini", 8000000, "orange", true);

		ArrayList<Car> cars = new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);
		cars.add(c7);
		cars.add(c8);
		cars.add(c9);
		cars.add(c10);

// for loop		
		Car max = cars.get(0);
		for (int i = 0; i < cars.size(); i++) {

			if (cars.get(i).getPrice() >= max.getPrice()) {
				max = cars.get(i);
			}

		}
		System.out.println(max + " high price car details");

// Enhanced for loop		
//		for (Car caar : cars) {
//			System.out.println(caar + "  is a enhanced loop  details");
//
//		}

// forEach loop		
//		cars.forEach((details) -> {
//			System.out.println(details + " is a forEach details");
//		});

		ArrayList<Car> cars1 = new ArrayList<>();

		for (Car car : cars) {

			if (car.getPrice() >= 4000000) {
				cars1.add(car);

			}
		}
		System.out.println(cars1);

// forEach loop
		cars1.forEach((cal) -> {
			System.out.println(cal + " forEach loop high price finding");
		});
		
		System.out.println();
		System.out.println();
		
		List<Car> carValue = cars1.stream().filter(x->x.getPrice() > 6000000).collect(Collectors.toList());
		System.out.println(carValue);
 
	}

}
