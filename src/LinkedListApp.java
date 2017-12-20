import java.util.NoSuchElementException;

public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> powerRangers = new LinkedList<String>();
		powerRangers.addToFront("Dino Charge");
		powerRangers.addToFront("Jungle Fury");
		powerRangers.addToFront("Ninja Storm");
		powerRangers.traverse();
		
		LinkedList<Double> math = new LinkedList<Double>();
		math.addToFront(3.14159);
		math.addToFront(2.144);
		math.addToFront(2.718);
		math.traverse();
		
		LinkedList<Integer> math2 = new LinkedList<Integer>();
		math2.addToFront(12);
		math2.addToFront(6);
		math2.addToFront(5);
		math2.traverse();
		
		LinkedList<Integer> math3 = new LinkedList<Integer>();
		math3.addToFront(10);
		math3.addToFront(6);
		math3.addToFront(2);
		math3.traverse();
		
		//LinkedList<Integer> numberOfComputers = new LinkedList<Integer>();
		//try {
		//	numberOfComputers.deleteFront();
		//} catch (NoSuchElementException e) {
		//	System.out.println("Oooops, list is empty");
		//	e.printStackTrace();
		//}
		
		
	}

}
