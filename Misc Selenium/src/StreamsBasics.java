import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Program to print words starting with letter A from the arraylist
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Azbhi");
		a.add("Avi");
		a.add("Don");
		a.add("Abhiraji");
		
		//Another way to declare arraylist using streams
		Stream.of("Azbhi","Avi","Don","Abhiraji");
		
		//To convert arraylist into streams
		a.stream();
		
		//Will perform following operations using streams
		
		//1. Print the all elements from the arraylist using streams
		Stream.of("Azbhi","Avi","Don","Abhiraji").forEach(s->System.out.println(s));
		
		//2. Print the count of elements present in the list
		long st=Stream.of("Azbhi","Avi","Don","Abhiraji").count();
		System.out.println(st);
		
		//3. Print the words which starts with "A"
		Stream.of("Azbhi","Avi","Don","Abhiraji").filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
		
		System.out.println("----------------------");
		
		//4. Print the words which starts with A and sort it and then convert it to uppercase
		Stream.of("Azbhi","Avi","Don","Abhiraji").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("----------------------");
		
		//5. Print the unique numbers from the integer array and sort it
	
		//Converting the array to list
		List<Integer> tu=Arrays.asList(3,3,6,6,1,2,4);
		
		tu.stream().distinct().sorted().forEach(si->System.out.println(si));
		System.out.println("----------------------");
	   
	   //6. Collect all the number from above step into list and print the third number from the new list
		
		List<Integer> newlist=tu.stream().distinct().sorted().collect(Collectors.toList());
		
		//Printing the third index numbers from the generated list
		System.out.println(newlist.get(2));
	
	}

}
