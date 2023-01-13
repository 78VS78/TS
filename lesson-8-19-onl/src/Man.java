/**
 * @author Simon Pirko on 11.01.23
 */
public class Man extends Human {

	String name = "Denis";

	@Override
	void sayHello() {
		System.out.println("Hello " + name);
	}

}
