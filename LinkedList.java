
public class LinkedList {
	private Node head;
	
	public LinkedList() {
		head = new Node('0');// O girilmedigini varsaydim.
	}

	public void addLast(char harf) {
		Node iterator = head;
		Node node = new Node(harf);
		
		while(iterator.getNext() != null)
			iterator = iterator.getNext();
		
		iterator.setNext(node);
	}
	
	public void araVeSil(String s){
		
		String arananKelime="";
		
		Node iterator = head;
		Node tut;
		Node kontrol=head.getNext();
		
		
		
		
		if(head.getNext() == null )
			return;
		
		
		while(kontrol.getNext() !=null) {
		
		
			while(s.charAt(0) != iterator.getNext().getHarf()) {//silinecek stringin ilk harfi ile esit olana kadar devam edicek.
				
				iterator=iterator.getNext();
				
			}
			
			tut=iterator;
			int i=0;
			
			
			while(i<s.length()) {
				
				arananKelime +=""+ tut.getHarf();
				tut=tut.getNext();
				i++;
			}
			
			
			if(arananKelime.equals(s)) {
				
				Node tut1;
				tut1=head.getNext();
				
				
				
				while(tut1.getNext().getHarf() != iterator.getHarf())
					tut1=tut1.getNext();
				
				tut1.setNext(tut.getNext());
				kontrol.setNext(tut.getNext());
				
				
			}
			else {
				kontrol=kontrol.getNext();
				iterator=head;
				continue;
			}
				
		}
		
	}
	public void print() {
		Node iterator = head.getNext();
		
		while(iterator != null) {
			System.out.print(""+iterator.getHarf());
			iterator = iterator.getNext();
		}
	}
	
	
}
