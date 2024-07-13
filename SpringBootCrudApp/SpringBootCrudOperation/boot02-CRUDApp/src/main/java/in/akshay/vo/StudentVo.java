package in.akshay.vo;

import java.util.Date;

public class StudentVo {
	private String sname;
	private String saddrss;
	private String sage;
	private String sdob;
	
	
	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getSaddrss() {
		return saddrss;
	}


	public void setSaddrss(String saddrss) {
		this.saddrss = saddrss;
	}


	public String getSage() {
		return sage;
	}


	public void setSage(String sage) {
		this.sage = sage;
	}


	public String getSdob() {
		return sdob;
	}


	public void setSdob(String sdob) {
		this.sdob = sdob;
	}


	@Override
	public String toString() {
		return "Student [sname=" + sname + ", saddrss=" + saddrss + ", sage=" + sage + ", sdob=" + sdob + "]";
	}

	
}
