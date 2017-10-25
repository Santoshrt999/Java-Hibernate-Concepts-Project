package hibernate.inheritance;

public class ChequePayment {

	private String cheqnum;
	private String ccqu;
	
	public ChequePayment() {
		
		
	}
	public ChequePayment(String cheqnum, String ccqu) {
		super();
		this.cheqnum = cheqnum;
		this.ccqu = ccqu;
}
	public String getCheqnum() {
		return cheqnum;
	}
	public void setCheqnum(String cheqnum) {
		this.cheqnum = cheqnum;
	}
	public String getCcqu() {
		return ccqu;
	}
	public void setCcqu(String ccqu) {
		this.ccqu = ccqu;
	}
	@Override
	public String toString() {
		return "ChequePayment [cheqnum=" + cheqnum + ", ccqu=" + ccqu + "]";
	}
	
	
}
