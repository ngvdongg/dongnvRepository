package fa.appcode.model;

import java.io.File;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CandidateProfile",schema="Group_2")
public class CandidateProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="candidate_profile_id")
	private int candidateProfileId;
	
	@Column(name="graduation_year")
	private int graduationYear;// date
	
	@OneToOne
	@JoinColumn(name="candidate__id")
	private Candidate candidate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="skill_id")
	private Skill skill;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="faculity_id")
	private Faculity faculity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="university_id")
	private University university;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="site_id")
	private Location location;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="status_id")
	private Status status;
		
	@Column(name="type")
	private String type;
	@Column(name="foreign_language")
	private String foreignLanguage;
	@Column(name="level")
	private int level;//string
	@Column(name="cv")
	private File cv;
	@Column(name="allocation_status")
	private boolean allocationStatus;
	@Column(name="note")
	private String note;
	@Column(name="history")
	private String history;
	@Column(name="remark")
	private String remark;
	
	
	public CandidateProfile(int candidateProfileId, int graduationYear, Candidate candidate, Skill skill,
			Faculity faculity, University university, Location location, Status status, String type,
			String foreignLanguage, int level, File cv, boolean allocationStatus, String note, String history,
			String remark) {
		super();
		this.candidateProfileId = candidateProfileId;
		this.graduationYear = graduationYear;
		this.candidate = candidate;
		this.skill = skill;
		this.faculity = faculity;
		this.university = university;
		this.location = location;
		this.status = status;
		this.type = type;
		this.foreignLanguage = foreignLanguage;
		this.level = level;
		this.cv = cv;
		this.allocationStatus = allocationStatus;
		this.note = note;
		this.history = history;
		this.remark = remark;
	}


	public int getCandidateProfileId() {
		return candidateProfileId;
	}
	public void setCandidateProfileId(int candidateProfileId) {
		this.candidateProfileId = candidateProfileId;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public Faculity getFaculity() {
		return faculity;
	}
	public void setFaculity(Faculity faculity) {
		this.faculity = faculity;
	}
	public University getUniversity() {
		return university;
	}
	public void setUniversity(University university) {
		this.university = university;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getForeignLanguage() {
		return foreignLanguage;
	}
	public void setForeignLanguage(String foreignLanguage) {
		this.foreignLanguage = foreignLanguage;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public File getCv() {
		return cv;
	}
	public int getGraduationYear() {
		return graduationYear;
	}


	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public void setCv(File cv) {
		this.cv = cv;
	}
	public boolean isAllocationStatus() {
		return allocationStatus;
	}
	public void setAllocationStatus(boolean allocationStatus) {
		this.allocationStatus = allocationStatus;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public CandidateProfile() {
		super();
	}
	
	
}
