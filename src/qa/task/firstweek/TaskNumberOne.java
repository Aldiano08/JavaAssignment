package qa.task.firstweek;

import java.util.HashMap;
//import java.util.TreeMap;
//import java.util.TreeSet;

public class TaskNumberOne {

	public static void main(String args[]) {

		System.out.println("Task First Week");

		HashMap<Integer, String> month = new HashMap<>();

		month.put(5, "May");
		month.put(2, "February");
		month.put(1, "january");
		month.put(3, "March");
		month.put(7, "July");
		month.put(10, "October");
		month.put(4, "April");
		month.put(6, "june");
		month.put(8, "August");
		month.put(9, "September");
		month.put(11, "November");
		month.put(12, "December");

		for (Integer key : month.keySet()) {

			System.out.println("Key is: " + key + " Value is: " + month.get(key));
		}

	}

}
