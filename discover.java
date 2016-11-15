
public class discover extends creditCard{
	
	private double interestRate;

	public discover(String name, double balance){
		super(name, balance);
		this.interestRate = .01;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	

}
