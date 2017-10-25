package hibernate.inheritance;

public class CreditCard extends Payment{
	
	private String ccnum;
	private String ccvv;
	
	
	public String getCcnum() {
		return ccnum;
	}
	public CreditCard(int paymenntid, String amount, String ccnum, String ccvv) {
		super(paymenntid, amount);
		this.ccnum = ccnum;
		this.ccvv = ccvv;
	}
	public void setCcnum(String ccnum) {
		this.ccnum = ccnum;
	}
	public String getCcvv() {
		return ccvv;
	}
	public void setCcvv(String ccvv) {
		this.ccvv = ccvv;
	}
	@Override
	public String toString() {
		return "CreditCard [ccnum=" + ccnum + ", ccvv=" + ccvv + "]";
	}
	
	
}