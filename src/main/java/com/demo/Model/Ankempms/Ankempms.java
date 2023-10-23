package com.demo.Model.Ankempms;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "SDMLATTPAY", name = "ANKEMPMS")
public class Ankempms {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "EMP_NO")
    private Integer empNo;

    @Column(name = "EMPCODE")
    private Integer empcode;

    @Column(name = "CARD")
    private Integer card;

    @Column(name = "CO_CODE")
    private Integer coCode;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DEPT_CD")
    private String deptCd;

    @Column(name = "DEPT_CD_4")
    private String deptCd4;

    @Column(name = "CATFLG")
    private String catflg;

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpcode(Integer empcode) {
        this.empcode = empcode;
    }

    public Integer getEmpcode() {
        return empcode;
    }

    public void setCard(Integer card) {
        this.card = card;
    }

    public Integer getCard() {
        return card;
    }

    public void setCoCode(Integer coCode) {
        this.coCode = coCode;
    }

    public Integer getCoCode() {
        return coCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDeptCd(String deptCd) {
        this.deptCd = deptCd;
    }

    public String getDeptCd() {
        return deptCd;
    }

    public void setDeptCd4(String deptCd4) {
        this.deptCd4 = deptCd4;
    }

    public String getDeptCd4() {
        return deptCd4;
    }

    public void setCatflg(String catflg) {
        this.catflg = catflg;
    }

    public String getCatflg() {
        return catflg;
    }

    public Ankempms() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ankempms(Integer empNo, Integer empcode, Integer card, Integer coCode, String name, String deptCd,
			String deptCd4, String catflg) {
		super();
		this.empNo = empNo;
		this.empcode = empcode;
		this.card = card;
		this.coCode = coCode;
		this.name = name;
		this.deptCd = deptCd;
		this.deptCd4 = deptCd4;
		this.catflg = catflg;
	}

	@Override
    public String toString() {
        return "Ankempms{" +
                "empNo=" + empNo + '\'' +
                "empcode=" + empcode + '\'' +
                "card=" + card + '\'' +
                "coCode=" + coCode + '\'' +
                "name=" + name + '\'' +
                "deptCd=" + deptCd + '\'' +
                "deptCd4=" + deptCd4 + '\'' +
                "catflg=" + catflg + '\'' +
                '}';
    }
	
}
