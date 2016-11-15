import org.junit.Test;

import junit.framework.TestCase;

public class testCases extends TestCase {
 final static double DELTA = .1;

	@Test
	public void testCase1() {

		//1 person, 1 wallet. visa, mc, discover 100 balance each
		
		visa visa1 = new visa("Visa", 100);
		mastercard mc1 = new mastercard("Mastercard", 100);
		discover discover1 = new discover("Discover", 100);
		
		double visaInterest = visa1.simpleInterest(visa1.getBalance(), visa1.getInterestRate());
		double mcInterest = mc1.simpleInterest(mc1.getBalance(), mc1.getInterestRate());
		double discInterest = discover1.simpleInterest(discover1.getBalance(), discover1.getInterestRate());
		double totInterest = visaInterest + mcInterest + discInterest;
		
		assertEquals(10,visaInterest, DELTA); //visa interest
		assertEquals(5,mcInterest,DELTA); //mastercard interest
		assertEquals(1, discInterest,DELTA); //discover interest
		assertEquals(16, totInterest,DELTA); //total interest
	}
	
	public void testCase2(){
		
		//1 person, 2 wallets. wallet1= visa, disc. wallet2= mc. 100 balance each
		
		visa visa1 = new visa("Visa", 100);
		discover discover1 = new discover("Discover", 100);
		mastercard mc2 = new mastercard("Mastercard", 100);
		
		double visaInterest = visa1.simpleInterest(visa1.getBalance(), visa1.getInterestRate());
		double mcInterest = mc2.simpleInterest(mc2.getBalance(), mc2.getInterestRate());
		double discInterest = discover1.simpleInterest(discover1.getBalance(), discover1.getInterestRate());
		double totInterest = visaInterest + mcInterest + discInterest;

		assertEquals(16, totInterest, DELTA);//total interest
		assertEquals(11, visaInterest+discInterest, DELTA); //wallet 1 interest
		assertEquals(5, mcInterest, DELTA);
	}
	
	public void testCase3(){
		
		//2 people 1 wallet each.
		//person 1 has mc and visa. person 2 has visa and mc.  100 balance all cards,
		
		mastercard mc1 = new mastercard("Mastercard", 100);
		visa visa1 = new visa("Visa", 100);
		
		double mcInterest1 = mc1.simpleInterest(mc1.getBalance(), mc1.getInterestRate());
		double visaInterest1 = visa1.simpleInterest(visa1.getBalance(), visa1.getInterestRate());
		
			assertEquals(15, mcInterest1+visaInterest1, DELTA);
		
		visa visa2 = new visa("Visa", 100);
		mastercard mc2 = new mastercard("Mastercard", 100);
	
		double mcInterest2 = mc2.simpleInterest(mc2.getBalance(), mc2.getInterestRate());
		double visaInterest2 = visa2.simpleInterest(visa2.getBalance(), visa2.getInterestRate());
			
		assertEquals(15, mcInterest2+visaInterest2, DELTA);
	}

}
