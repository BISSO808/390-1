import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("How many nodes do you want?");
		int i=input.nextInt();
		linkedList link= new linkedList();
		for(int j=0;j<i;j++) {
			link.makeNode(j);
		}

	link.showList();
	link.findTail();
	}
}
