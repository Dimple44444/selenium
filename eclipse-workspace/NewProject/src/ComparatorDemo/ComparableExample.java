package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student {
	int age;
	String sname;

	public student(int age, String sname) {
		this.age = age;
		this.sname = sname;
	}

		
		public String toString() {
			return "student [age=" + age + ", sname=" + sname + "]";
		 
		 

	}

}

public class ComparableExample {

	public static void main(String[] args) {

		Comparator<student> com = new Comparator<student>() {

			public int compare(student i, student j) {
				if (i.age > j.age)
					return 1;
				else
					return -1;
			}
		};

		List<student> studs = new ArrayList<student>();

		studs.add(new student(85, "Nikita"));
		studs.add(new student(24, "priya"));
		studs.add(new student(45, "jaya"));

		Collections.sort(studs, com);

		for (student s : studs) {

			System.out.println(s);

		}
	}
}
