package ArthimeticCalculator;

public class ArthimeticOperation{
	
	public int addition(int num1, int num2){
		int result=0;
		result=num1+num2;
		return result;
	}
	public int subtraction(int num1, int num2){
		int result=0;
		result=num1-num2;
		return result;
	}
	public int multiplication(int num1, int num2){
		int result=0;
		result=num1*num2;
		return result;
	}	
	public int division(int num1, int num2){
		int result=0;
		if(num2>0)
			result=num1/num2;
		
		return result;
	}
	

}
