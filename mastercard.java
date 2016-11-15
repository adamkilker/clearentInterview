
public class mastercard extends creditCard {

		private double interestRate;
		
		public mastercard(String name, double balance){
			super(name, balance);
			this.interestRate = .05;
		}

		public double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		
		
}
