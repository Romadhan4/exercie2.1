
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Animals dog = new Animals ();
			dog.name="Doggy";
			dog.breed="Buldog";
			dog.age = 4;
			System.out.println("Animals 1:");
			System.out.println("Name :"+dog.name);
			System.out.println("Breed:"+dog.breed);
			System.out.println("Age:"+dog.age);
			dog.canRun();
			
			System.out.println();
			
			Animals cat = new Animals ();
			cat.name="Catti";
			cat.breed="Anggora";
			cat.age=3;
			
			System.out.println("Animals 2");
			System.out.println("Name :"+cat.name);
			System.out.println("Breed :"+cat.breed);
			System.out.println("Age :"+cat.age);
			cat.canRun();
			
			System.out.println();
			
			
			
			
	}

}
