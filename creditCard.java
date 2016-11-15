
public class creditCard {
	private String name;
	private double balance;
	
	public creditCard(String name, double balance){
		this.name = name;
		this.balance= balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double simpleInterest(double balance, double interest){
		
		return balance * interest;
	}
	
}
