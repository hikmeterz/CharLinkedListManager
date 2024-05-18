import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner k= new Scanner(System.in);
		
		LinkedList list = new LinkedList();
		
		System.out.println("stringi giriniz:");
		String s1=k.nextLine();
		
		
		
		
		for(int i=0;i<s1.length();i++){//linked liste teker teker eklendi.
			list.addLast(s1.charAt(i));
			
		}
		
		System.out.println("Silinecek stirngi giriniz:");
		String s2= k.nextLine();
		
		list.araVeSil(s2);
		
		list.print();
		
		
		System.out.println();
		
		
		
		
		
	}
	
}
