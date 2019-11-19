package fa.appcode.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EntryTest",schema="Group_2")
public class EntryTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="entry_test_id")
	private int entryTestId;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@Column(name="entry_test_date")
	private LocalDate entryTestDate;
	@Column(name="entry_test_time")
	private LocalTime entryTestTime;
	@Column(name="language_valuator")
	private double languageValuator;
	@Column(name="language_result")
	private String languageResult;
	@Column(name="technical_valuator")
	private double technicalValuator;
	@Column(name="technical_result")
	private String technicalResult;
	@Column(name="result")
	private String result;
	@Column(name="remark")
	private String remark;
	public EntryTest(int entryTestId, Candidate candidate, LocalDate entryTestDate, LocalTime entryTestTime,
			double languageValuator, String languageResult, double technicalValuator, String technicalResult,
			String result, String remark) {
		super();
		this.entryTestId = entryTestId;
		this.candidate = candidate;
		this.entryTestDate = entryTestDate;
		this.entryTestTime = entryTestTime;
		this.languageValuator = languageValuator;
		this.languageResult = languageResult;
		this.technicalValuator = technicalValuator;
		this.technicalResult = technicalResult;
		this.result = result;
		this.remark = remark;
	}
	public int getEntryTestId() {
		return entryTestId;
	}
	public void setEntryTestId(int entryTestId) {
		this.entryTestId = entryTestId;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public LocalDate getEntryTestDate() {
		return entryTestDate;
	}
	public void setEntryTestDate(LocalDate entryTestDate) {
		this.entryTestDate = entryTestDate;
	}
	public LocalTime getEntryTestTime() {
		return entryTestTime;
	}
	public void setEntryTestTime(LocalTime entryTestTime) {
		this.entryTestTime = entryTestTime;
	}
	public double getLanguageValuator() {
		return languageValuator;
	}
	public void setLanguageValuator(double languageValuator) {
		this.languageValuator = languageValuator;
	}
	public String getLanguageResult() {
		return languageResult;
	}
	public void setLanguageResult(String languageResult) {
		this.languageResult = languageResult;
	}
	public double getTechnicalValuator() {
		return technicalValuator;
	}
	public void setTechnicalValuator(double technicalValuator) {
		this.technicalValuator = technicalValuator;
	}
	public String getTechnicalResult() {
		return technicalResult;
	}
	public void setTechnicalResult(String technicalResult) {
		this.technicalResult = technicalResult;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
