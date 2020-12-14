

class depositLimitationException extends Exception{
	String message;
	public depositLimitationException(String message) {
		this.message = message;
	}
	
	public String returnMessage(){
		return message;
	}
}

class Deposit{
	int balance = 500;
	public void depositMoney(int depositAmount) throws depositLimitationException {
	 if(depositAmount > 10000) {
		 throw new depositLimitationException("You cannot depoist more than $10000");
	 }
	 else {
		 balance += depositAmount;
		 System.out.println("Your balance is:" + balance);
	 }
	}
}
public class BankDeposit {
	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
		try {
			Deposit dep = new Deposit();
			dep.depositMoney(16000);
		}
		catch(depositLimitationException ex){
			System.out.println(ex.returnMessage());
		}
	}
}
