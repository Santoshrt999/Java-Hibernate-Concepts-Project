package hibernate.inheritance;

public class Payment {

	private int paymenntid;
	private String amount;
	
	public Payment() {
		
		
	}

	public Payment(int paymenntid, String amount) {
		//super();
		this.paymenntid = paymenntid;
		this.amount = amount;
	}

	public int getPaymenntid() {
		return paymenntid;
	}

	public void setPaymenntid(int paymenntid) {
		this.paymenntid = paymenntid;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [paymenntid=" + paymenntid + ", amount=" + amount + "]";
	}
	
	
	
}
