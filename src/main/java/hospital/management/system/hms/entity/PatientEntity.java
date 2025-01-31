package hospital.management.system.hms.entity;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PatientEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int PId;
	private String pName;
	private Date dob;
	private String gender;
	private String BloodGroup;
	private String emailId;
	private String address;
	private String mobilNo;
	private String cghsPvt;
	private String password;

	public int getPId() {
		return PId;
	}
	public void setPId(int pId) {
		PId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobilNo() {
		return mobilNo;
	}
	public void setMobilNo(String mobilNo) {
		this.mobilNo = mobilNo;
	}
	public String getCghsPvt() {
		return cghsPvt;
	}
	
	public void setCghsPvt(String cghsPvt) {
		this.cghsPvt = cghsPvt;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
