
public class SwitchStatement {
	
	public static void main(String args[]) {
		int a = 70;
		
		switch(a) {
		case 10:
		case 30:
			System.out.println("Hello");
			break;
		case 15:
			System.out.println("Hi");
			break;
		default:
				System.out.println("bye");
				break;
		}
		
		
		
		char b = 'j';
		
		switch(b) {
		case 'l':
		case 'h':
			System.out.println("Elle and Harvey");
			break;
		case 'j':
			System.out.println("Jane");
			break;
		default:
				System.out.println("Suf.");
				break;
		}
	}

}
