package fa.appcode.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Profile",schema="Group_2")
public class Profile {
	@Id
	@GeneratedValue()
	@Column(name="profile_id")
	private int profileId;
	
	@Column(name="full_name")
	private String fullName;
	@Column(name="dob")
	private Date dateOfBirth;
	@Column(name="gender")
	private boolean gender;
	@Column(name="phone")
	private String phone;
	@Column(name="email")
	private String email;	
	@Column(name="remark")
	private String remark;
	
	@OneToOne
	@JoinColumn(name="candidate_profile")
	private CandidateProfile candidateProfile;

	public Profile(int profileId, String fullName, Date dateOfBirth, boolean gender, String phone, String email,
			String remark, CandidateProfile candidateProfile) {
		super();
		this.profileId = profileId;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.remark = remark;
		this.candidateProfile = candidateProfile;
	}

	public Profile() {
		super();
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public CandidateProfile getCandidateProfile() {
		return candidateProfile;
	}

	public void setCandidateProfile(CandidateProfile candidateProfile) {
		this.candidateProfile = candidateProfile;
	}
	
	
}
