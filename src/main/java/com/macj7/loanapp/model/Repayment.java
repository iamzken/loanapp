package com.macj7.loanapp.model;
// Generated Aug 15, 2015 2:59:02 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Repayment generated by hbm2java
 */
public class Repayment  implements java.io.Serializable {


     private int loanNo;
     private Loan loan;
     private BigDecimal amtRepaid;
     private Date dateRepaid;

    public Repayment() {
    }

	
    public Repayment(Loan loan) {
        this.loan = loan;
    }
    public Repayment(Loan loan, BigDecimal amtRepaid, Date dateRepaid) {
       this.loan = loan;
       this.amtRepaid = amtRepaid;
       this.dateRepaid = dateRepaid;
    }
   
    public int getLoanNo() {
        return this.loanNo;
    }
    
    public void setLoanNo(int loanNo) {
        this.loanNo = loanNo;
    }
    public Loan getLoan() {
        return this.loan;
    }
    
    public void setLoan(Loan loan) {
        this.loan = loan;
    }
    public BigDecimal getAmtRepaid() {
        return this.amtRepaid;
    }
    
    public void setAmtRepaid(BigDecimal amtRepaid) {
        this.amtRepaid = amtRepaid;
    }
    public Date getDateRepaid() {
        return this.dateRepaid;
    }
    
    public void setDateRepaid(Date dateRepaid) {
        this.dateRepaid = dateRepaid;
    }




}

