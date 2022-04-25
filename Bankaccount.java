package bankpaket;

public class Bankaccount {
	long balance;
	
	
	
	
	public long getBalance()
	{
		return balance;
	}
	public void deposit(long einzahlWert)
	{
		balance = balance + einzahlWert;
	}
	public void withdraw(long value)
	{
		balance = balance - value;
		System.out.println("Sie haben "+value+" Euro abgehoben.");
	}
	public void withdraw(long foreignValue, double conversionfactor)
	{
		
	}
	
}

