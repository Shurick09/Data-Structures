
public class DLLApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL<String> shoes = new DLL<String>();
		shoes.addToFront("Vans");
		shoes.addToFront("Crocs");
		shoes.addToFront("Nike");
		shoes.addAfter("Merrels", "Crocs");
		shoes.traverse();
		shoes.delete("Nike");	
		shoes.traverse();
	}
}
