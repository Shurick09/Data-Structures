import java.util.HashMap;

class Person {
	String firstName, lastName;
	String email;
	Person (String first, String last, String email) {
		this.firstName = first;
		this.lastName = last;
		this.email = email;
	}
	public boolean equals (Object o) {
		if (o == null || !(o instanceof Person)) {
			return false;
		}
		Person other = (Person)o;
		return this.email.equals(other.email);
	}
	public String toString() {
		return "(" + firstName + " " + lastName + ", " + email + ")";
	}
}
class Point {
	int x,y;
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int hashCode() {
		return ("" + x + y).hashCode();
	}
	public boolean equals (Object o) {
		if (o == null || !(o instanceof Point)) {
			return false;
		}
		Point other = (Point)o;
		return other.x == this.x && other.y == this.y;
	}
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

public class HashUse {
	
	public static void main (String[] args) {
		/* HashMap maps a key to a value */
		/* people is the hash table */
		/* key is a email String, value is the Person that email refers to */
		HashMap<String, Person> people = new HashMap<String, Person>();
		String emailAna = "anapaula@cs.rugers.edu";
		Person personAna = new Person("Ana Paula", "Centeno", emailAna);
		
		/* Insert into the hash table */
		people.put(emailAna, personAna);
		
		String emailA = "atjang@cs.rutgers.edu";
		Person personAndrew = new Person("Andrew", "Tjang", emailA);
		people.put(emailA, personAndrew);
		
		Person aa = people.get(emailAna);
		System.out.println(aa);
		Person ba = people.get(emailA);
		System.out.println(ba);
		
		System.out.println("Using the foreach loop");
		for (String key:people.keySet()) {
			System.out.println(people.get(key));
		}
		
		/*
		 * HashTable where key is Point and value is also a point A-B
		 */
		HashMap<Point, Point> lines = new HashMap<Point, Point>(40,2);
		Point a = new Point(3,5);
		Point b = new Point(6,8);
		Point c = new Point(10,3);
		Point d = new Point(20,7);
		
		lines.put(a, b);
		lines.put(c,d);
		
		System.out.println(lines.get(a));
		System.out.print(lines.get(c));
	}
}
