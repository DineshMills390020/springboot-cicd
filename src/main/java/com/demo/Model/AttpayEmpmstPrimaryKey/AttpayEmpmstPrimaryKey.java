package com.demo.Model.AttpayEmpmstPrimaryKey;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Id;


public class AttpayEmpmstPrimaryKey implements Serializable {
	
	@Column(name = "EMP_NO", nullable = false)
    private String empNo;
	
	@Column(name = "PAY_EMP_NO", nullable = false)
    private String payEmpNo;

    
    public AttpayEmpmstPrimaryKey() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public AttpayEmpmstPrimaryKey(String empNo, String payEmpNo) {
		super();
		this.empNo = empNo;
		this.payEmpNo = payEmpNo;
		
	}

	public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setPayEmpNo(String payEmpNo) {
        this.payEmpNo = payEmpNo;
    }

    public String getPayEmpNo() {
        return payEmpNo;
    }

	@Override
	public int hashCode() {
		return Objects.hash(empNo, payEmpNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AttpayEmpmstPrimaryKey other = (AttpayEmpmstPrimaryKey) obj;
		return Objects.equals(empNo, other.empNo) && Objects.equals(payEmpNo, other.payEmpNo);
	}
    
    
   
}
