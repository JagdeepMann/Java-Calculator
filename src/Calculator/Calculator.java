package Calculator;

public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double results;
	
	
	
	//Constructors
	public Calculator() {
	}
	
	public Calculator(Double operandOne, String operation, Double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}

	
	// Getters and Setters
	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResults() {
		return results;
	}

	public void setResults(double results) {
		this.results = results;
	}
	
	//Other Methods
	public void performOperation() {
		if(getOperation().equals("+")) {
			Double addition = getOperandOne() + getOperandTwo();
			setResults(addition);
		}
		else if(getOperation().equals("-")) {
			Double subtraction = getOperandOne() - getOperandTwo();
			setResults(subtraction);
		}
	}
	public void getResult() {
		System.out.println(getResults());
	}	
	

	
}
