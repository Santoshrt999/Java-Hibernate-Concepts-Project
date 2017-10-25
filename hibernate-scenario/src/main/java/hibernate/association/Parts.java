package hibernate.association;

public class Parts {

	private int partId;
	private String partName;
	public Parts() {
		//super();
	}
	public Parts(int partId, String partName) {
		//super();
		this.partId = partId;
		this.partName = partName;
	}
	public int getPartId() {
		return partId;
	}
	public void setPartId(int partId) {
		this.partId = partId;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	@Override
	public String toString() {
		return "Parts [partId=" + partId + ", partName=" + partName + "]";
	}
	
	
}
