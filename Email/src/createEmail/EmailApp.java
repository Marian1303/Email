package createEmail;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Marian", "Miulescu");
		em1.getAlternateEmail();
		System.out.println(em1.showInfo());
		
	}
}
