package Calculator;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println("-------Addition using Complete contructor---------");
		Calculator c = new Calculator(10.5, "+", 5.2);
		c.performOperation();
		c.getResult();

		System.out.println("--------Subtraction using Empty contructor-------");
		c.setOperandOne(10.5);
		c.setOperation("-");
		c.setOperandTwo(5.2);
		c.performOperation();
		System.out.println(c.getResults());

	}

}
