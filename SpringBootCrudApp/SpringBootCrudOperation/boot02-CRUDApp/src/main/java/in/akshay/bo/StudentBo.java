package in.akshay.bo;

import java.time.LocalDate;
import java.util.Date;

public class StudentBo {
	private String sname;
	private String saddrss;
	private int sage;
	private LocalDate sdob;
	
	
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


	public int getSage() {
		return sage;
	}


	public void setSage(int sage) {
		this.sage = sage;
	}


	public LocalDate getSdob() {
		return sdob;
	}


	public void setSdob(LocalDate sdob) {
		this.sdob = sdob;
	}


	@Override
	public String toString() {
		return "StudentBo [sname=" + sname + ", saddrss=" + saddrss + ", sage=" + sage + ", sdob=" + sdob + "]";
	}
	
	
}
