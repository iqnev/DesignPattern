package decoratorpattern;

public class DecoratorTest {

	public static void main(String[] args) {
	Women women1 = new BulgarianWomen();
	
	BalkanWomen balkanWomen = new BalkanWomen(women1);
	System.out.println(balkanWomen.getDescription());

	}

}
