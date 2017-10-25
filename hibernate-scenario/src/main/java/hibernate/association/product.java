package hibernate.association;

import java.util.Set;

public class product {

	private int prodid;
	private String prodname;
	
	

private Set<Parts> setpart;

public product() {
	super();
}


public product(int prodid, String prodname, Set<Parts> setpart) {
	super();
	this.prodid = prodid;
	this.prodname = prodname;
	this.setpart = setpart;
}


public int getProdid() {
	return prodid;
}

public void setProdid(int prodid) {
	this.prodid = prodid;
}

public String getProdname() {
	return prodname;
}

public void setProdname(String prodname) {
	this.prodname = prodname;
}

public Set<Parts> getSetpart() {
	return setpart;
}

public void setSetpart(Set<Parts> setpart) {
	this.setpart = setpart;
}

@Override
public String toString() {
	return "product [prodid=" + prodid + ", prodname=" + prodname + ", setpart=" + setpart + "]";
}


}
