
public class visa extends creditCard{
	
	private double interestRate ;
	
	public visa(String name, double balance){
		super(name, balance);
		this.interestRate = .10;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
