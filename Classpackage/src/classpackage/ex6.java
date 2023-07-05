package classpackage;

class Dogs{
	
	String breed;
	
	String color;
	
	int age;
	
	public String getinfo() {
		
		return("breed is : "+" "+breed+" " + "color is : "+" "+color+" "+ "age is : "+" "+age);
	}
	
	
}


public class ex6 {
	public static void main(String args[]) {
		
		Dogs Labror = new Dogs();
		
		Labror.breed = "labror";
		Labror.color = "brown";
		Labror.age = 3;
		
		String pet_details = Labror.getinfo();
		
		System.out.println(pet_details);
		
	}
}
