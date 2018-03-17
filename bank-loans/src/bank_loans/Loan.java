package bank_loans;

public class Loan {
	private String name;
	private int repaymentPeriod;
	private int loanAmount;
	private double nominalInterestRate;
	private int bankFee;
	private double totalLoanAmount;
	private double monthlyAnnuity;
	private double effectiveInterestRate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRepaymentPeriod() {
		return repaymentPeriod;
	}
	public void setRepaymentPeriod(int repaymentPeriod) {
		this.repaymentPeriod = repaymentPeriod;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getNominalInterestRate() {
		return nominalInterestRate;
	}
	public void setNominalInterestRate(double nominalInterestRate) {
		this.nominalInterestRate = nominalInterestRate;
	}
	public int getBankFee() {
		return bankFee;
	}
	public void setBankFee(int bankFee) {
		this.bankFee = bankFee;
	}
	public double getTotalLoanAmount() {
		return totalLoanAmount;
	}
	public void setTotalLoanAmount(double totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}
	public double getMonthlyAnnuity() {
		return monthlyAnnuity;
	}
	public void setMonthlyAnnuity(double monthlyAnnuity) {
		this.monthlyAnnuity = monthlyAnnuity;
	}
	public double getEffectiveInterestRate() {
		return effectiveInterestRate;
	}
	public void setEffectiveInterestRate(double effectiveInterestRate) {
		this.effectiveInterestRate = effectiveInterestRate;
	}
}
