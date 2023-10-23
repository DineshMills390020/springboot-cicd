package com.demo.Model.AttpayEmpmst;

import java.math.BigDecimal;
import java.sql.Date;

import com.demo.Model.AttpayEmpmstPrimaryKey.AttpayEmpmstPrimaryKey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.IdClass;
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
//@IdClass(AttpayEmpmstPrimaryKey.class)
@Table(schema = "SDMLATTPAY", name = "ATTPAY_EMPMST")
public class AttpayEmpmst {

    @Id
    @Column(name = "EMP_NO", nullable = false)
    private String empNo;

    //@Id
    @Column(name = "PAY_EMP_NO", nullable = false)
    private String payEmpNo;

    @Column(name = "EMP_NAME")
    private String empName;

    @Column(name = "EMP_DESIGNATION")
    private String empDesignation;

    @Column(name = "EMP_DEPARTMENT")
    private String empDepartment;

    @Column(name = "EMP_BIRTH_DATE")
    private Date empBirthDate;

    @Column(name = "EMP_JOIN_DATE")
    private Date empJoinDate;

    @Column(name = "EMP_CONFIRM_DATE")
    private Date empConfirmDate;

    @Column(name = "EMP_LEFT_DATE")
    private Date empLeftDate;

    @Column(name = "EMP_QUALIFICATION")
    private String empQualification;

    @Column(name = "EMP_WEEKOFF")
    private String empWeekoff;

    @Column(name = "EMP_CORRES_ADDRESS")
    private String empCorresAddress;

    @Column(name = "EMP_PERM_ADDRESS")
    private String empPermAddress;

    @Column(name = "EMP_CITY")
    private String empCity;

    @Column(name = "EMP_DISTRICT")
    private String empDistrict;

    @Column(name = "EMP_STATE")
    private String empState;

    @Column(name = "EMP_COUNTRY")
    private String empCountry;

    @Column(name = "EMP_PINCODE")
    private String empPincode;

    @Column(name = "EMP_PHONE")
    private String empPhone;

    @Column(name = "EMP_EMAIL")
    private String empEmail;

    @Column(name = "EMP_BLOODGROUP")
    private String empBloodgroup;

    @Column(name = "EMP_MARITAL_STATUS")
    private String empMaritalStatus;

    @Column(name = "EMP_SEX")
    private String empSex;

    @Column(name = "EMP_COMPANY")
    private String empCompany;

    @Column(name = "EMP_DIVISION")
    private String empDivision;

    @Column(name = "EMP_CATEGORY")
    private String empCategory;

    @Column(name = "IP_CREATER")
    private String ipCreater;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "IP_MODIFIER")
    private String ipModifier;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_DATE")
    private Date modifiedDate;

    @Column(name = "EMP_SHIFT_ID_COSEC")
    private String empShiftIdCosec;

    @Column(name = "EMP_SHIFT_CATEGORY_COSEC")
    private String empShiftCategoryCosec;

    @Column(name = "EMP_SHIFT_ID")
    private String empShiftId;

    @Column(name = "EMP_MAIN_CATEGORY")
    private String empMainCategory;

    @Column(name = "CHANGED")
    private Integer changed;

    @Column(name = "CHANGED_DATE")
    private Date changedDate;

    @Column(name = "REJECTED")
    private Integer rejected;

    @Column(name = "REJECTED_BY")
    private String rejectedBy;

    @Column(name = "REJECTED_DATE")
    private Date rejectedDate;

    @Column(name = "APPROVED", nullable = false)
    private Integer approved;

    @Column(name = "APPROVED_BY")
    private String approvedBy;

    @Column(name = "APPROVED_DATE")
    private Date approvedDate;

    @Column(name = "CANCELED")
    private Boolean canceled;

    @Column(name = "HIERARCHY_ID")
    private Integer hierarchyId;

    @Column(name = "DOC_DATE")
    private Date docDate;

    @Column(name = "EMP_BASIC_RATE")
    private BigDecimal empBasicRate;

    @Column(name = "EMP_PERSONAL_PAY")
    private BigDecimal empPersonalPay;

    @Column(name = "EMP_PETROL_LTRS")
    private BigDecimal empPetrolLtrs;

    @Column(name = "EMP_VEHICLE_NO")
    private String empVehicleNo;

    @Column(name = "EMP_BANK_NAME")
    private String empBankName;

    @Column(name = "EMP_BANK_ACCOUNT_NO")
    private String empBankAccountNo;

    @Column(name = "FULL_PRESENT_IND")
    private String fullPresentInd;

    @Column(name = "FULL_PRESENT_UPTO_DATE")
    private Date fullPresentUptoDate;

    @Column(name = "EMP_WEEKOFF_DAY")
    private String empWeekoffDay;

    @Column(name = "PL_RULE")
    private String plRule;

    @Column(name = "EMP_MAGAZINE")
    private BigDecimal empMagazine;

    @Column(name = "EMP_ELECTRICITY")
    private BigDecimal empElectricity;

    @Column(name = "EMP_HRA")
    private BigDecimal empHra;

    @Column(name = "EMP_WASHING_ALLOWANCE")
    private BigDecimal empWashingAllowance;

    @Column(name = "EMP_SUPERANNUATION")
    private Boolean empSuperannuation;

    @Column(name = "EMP_INCREMENT_DUE_DATE")
    private Date empIncrementDueDate;

    @Column(name = "EMP_JOIN_DATE_GRATUITY")
    private Date empJoinDateGratuity;

    @Column(name = "EMP_CHQ_RETAINER_FEE")
    private BigDecimal empChqRetainerFee;

    @Column(name = "EMP_GRADE")
    private String empGrade;

    @Column(name = "EMP_PF_NO")
    private String empPfNo;

    @Column(name = "EMP_UAN_NO")
    private String empUanNo;

    @Column(name = "EMP_ESI_NO")
    private String empEsiNo;

    @Column(name = "EMP_NOMINATION_GRATUITY")
    private String empNominationGratuity;

    @Column(name = "EMP_NOMINATION_PF")
    private String empNominationPf;

    @Column(name = "EMP_OLD_ESIC_DAYS")
    private String empOldEsicDays;

    @Column(name = "EMP_ADHAAR_NO")
    private String empAdhaarNo;

    @Column(name = "EMP_PAN_NO")
    private String empPanNo;

    @Column(name = "EMP_ADDLN_AMOUNT")
    private BigDecimal empAddlnAmount;

    @Column(name = "EMP_INCREMENT_LAST_DUE_DATE")
    private Date empIncrementLastDueDate;

    @Column(name = "EMP_INCREMENT_NEXT_DUE_DATE")
    private Date empIncrementNextDueDate;
    
    
    public AttpayEmpmst() {
		super();
		// TODO Auto-generated constructor stub
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

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpJoinDate(Date empJoinDate) {
        this.empJoinDate = empJoinDate;
    }

    public Date getEmpJoinDate() {
        return empJoinDate;
    }

    public void setEmpConfirmDate(Date empConfirmDate) {
        this.empConfirmDate = empConfirmDate;
    }

    public Date getEmpConfirmDate() {
        return empConfirmDate;
    }

    public void setEmpLeftDate(Date empLeftDate) {
        this.empLeftDate = empLeftDate;
    }

    public Date getEmpLeftDate() {
        return empLeftDate;
    }

    public void setEmpQualification(String empQualification) {
        this.empQualification = empQualification;
    }

    public String getEmpQualification() {
        return empQualification;
    }

    public void setEmpWeekoff(String empWeekoff) {
        this.empWeekoff = empWeekoff;
    }

    public String getEmpWeekoff() {
        return empWeekoff;
    }

    public void setEmpCorresAddress(String empCorresAddress) {
        this.empCorresAddress = empCorresAddress;
    }

    public String getEmpCorresAddress() {
        return empCorresAddress;
    }

    public void setEmpPermAddress(String empPermAddress) {
        this.empPermAddress = empPermAddress;
    }

    public String getEmpPermAddress() {
        return empPermAddress;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpDistrict(String empDistrict) {
        this.empDistrict = empDistrict;
    }

    public String getEmpDistrict() {
        return empDistrict;
    }

    public void setEmpState(String empState) {
        this.empState = empState;
    }

    public String getEmpState() {
        return empState;
    }

    public void setEmpCountry(String empCountry) {
        this.empCountry = empCountry;
    }

    public String getEmpCountry() {
        return empCountry;
    }

    public void setEmpPincode(String empPincode) {
        this.empPincode = empPincode;
    }

    public String getEmpPincode() {
        return empPincode;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpBloodgroup(String empBloodgroup) {
        this.empBloodgroup = empBloodgroup;
    }

    public String getEmpBloodgroup() {
        return empBloodgroup;
    }

    public void setEmpMaritalStatus(String empMaritalStatus) {
        this.empMaritalStatus = empMaritalStatus;
    }

    public String getEmpMaritalStatus() {
        return empMaritalStatus;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpCompany(String empCompany) {
        this.empCompany = empCompany;
    }

    public String getEmpCompany() {
        return empCompany;
    }

    public void setEmpDivision(String empDivision) {
        this.empDivision = empDivision;
    }

    public String getEmpDivision() {
        return empDivision;
    }

    public void setEmpCategory(String empCategory) {
        this.empCategory = empCategory;
    }

    public String getEmpCategory() {
        return empCategory;
    }

    public void setIpCreater(String ipCreater) {
        this.ipCreater = ipCreater;
    }

    public String getIpCreater() {
        return ipCreater;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setIpModifier(String ipModifier) {
        this.ipModifier = ipModifier;
    }

    public String getIpModifier() {
        return ipModifier;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setEmpShiftIdCosec(String empShiftIdCosec) {
        this.empShiftIdCosec = empShiftIdCosec;
    }

    public String getEmpShiftIdCosec() {
        return empShiftIdCosec;
    }

    public void setEmpShiftCategoryCosec(String empShiftCategoryCosec) {
        this.empShiftCategoryCosec = empShiftCategoryCosec;
    }

    public String getEmpShiftCategoryCosec() {
        return empShiftCategoryCosec;
    }

    public void setEmpShiftId(String empShiftId) {
        this.empShiftId = empShiftId;
    }

    public String getEmpShiftId() {
        return empShiftId;
    }

    public void setEmpMainCategory(String empMainCategory) {
        this.empMainCategory = empMainCategory;
    }

    public String getEmpMainCategory() {
        return empMainCategory;
    }

    public void setChanged(Integer changed) {
        this.changed = changed;
    }

    public Integer getChanged() {
        return changed;
    }

    public void setChangedDate(Date changedDate) {
        this.changedDate = changedDate;
    }

    public Date getChangedDate() {
        return changedDate;
    }

    public void setRejected(Integer rejected) {
        this.rejected = rejected;
    }

    public Integer getRejected() {
        return rejected;
    }

    public void setRejectedBy(String rejectedBy) {
        this.rejectedBy = rejectedBy;
    }

    public String getRejectedBy() {
        return rejectedBy;
    }

    public void setRejectedDate(Date rejectedDate) {
        this.rejectedDate = rejectedDate;
    }

    public Date getRejectedDate() {
        return rejectedDate;
    }

    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    public Integer getApproved() {
        return approved;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setCanceled(Boolean canceled) {
        this.canceled = canceled;
    }

    public Boolean isCanceled() {
        return canceled;
    }

    public void setHierarchyId(Integer hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    public Integer getHierarchyId() {
        return hierarchyId;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setEmpBasicRate(BigDecimal empBasicRate) {
        this.empBasicRate = empBasicRate;
    }

    public BigDecimal getEmpBasicRate() {
        return empBasicRate;
    }

    public void setEmpPersonalPay(BigDecimal empPersonalPay) {
        this.empPersonalPay = empPersonalPay;
    }

    public BigDecimal getEmpPersonalPay() {
        return empPersonalPay;
    }

    public void setEmpPetrolLtrs(BigDecimal empPetrolLtrs) {
        this.empPetrolLtrs = empPetrolLtrs;
    }

    public BigDecimal getEmpPetrolLtrs() {
        return empPetrolLtrs;
    }

    public void setEmpVehicleNo(String empVehicleNo) {
        this.empVehicleNo = empVehicleNo;
    }

    public String getEmpVehicleNo() {
        return empVehicleNo;
    }

    public void setEmpBankName(String empBankName) {
        this.empBankName = empBankName;
    }

    public String getEmpBankName() {
        return empBankName;
    }

    public void setEmpBankAccountNo(String empBankAccountNo) {
        this.empBankAccountNo = empBankAccountNo;
    }

    public String getEmpBankAccountNo() {
        return empBankAccountNo;
    }

    public void setFullPresentInd(String fullPresentInd) {
        this.fullPresentInd = fullPresentInd;
    }

    public String getFullPresentInd() {
        return fullPresentInd;
    }

    public void setFullPresentUptoDate(Date fullPresentUptoDate) {
        this.fullPresentUptoDate = fullPresentUptoDate;
    }

    public Date getFullPresentUptoDate() {
        return fullPresentUptoDate;
    }

    public void setEmpWeekoffDay(String empWeekoffDay) {
        this.empWeekoffDay = empWeekoffDay;
    }

    public String getEmpWeekoffDay() {
        return empWeekoffDay;
    }

    public void setPlRule(String plRule) {
        this.plRule = plRule;
    }

    public String getPlRule() {
        return plRule;
    }

    public void setEmpMagazine(BigDecimal empMagazine) {
        this.empMagazine = empMagazine;
    }

    public BigDecimal getEmpMagazine() {
        return empMagazine;
    }

    public void setEmpElectricity(BigDecimal empElectricity) {
        this.empElectricity = empElectricity;
    }

    public BigDecimal getEmpElectricity() {
        return empElectricity;
    }

    public void setEmpHra(BigDecimal empHra) {
        this.empHra = empHra;
    }

    public BigDecimal getEmpHra() {
        return empHra;
    }

    public void setEmpWashingAllowance(BigDecimal empWashingAllowance) {
        this.empWashingAllowance = empWashingAllowance;
    }

    public BigDecimal getEmpWashingAllowance() {
        return empWashingAllowance;
    }

    public void setEmpSuperannuation(Boolean empSuperannuation) {
        this.empSuperannuation = empSuperannuation;
    }

    public Boolean isEmpSuperannuation() {
        return empSuperannuation;
    }

    public void setEmpIncrementDueDate(Date empIncrementDueDate) {
        this.empIncrementDueDate = empIncrementDueDate;
    }

    public Date getEmpIncrementDueDate() {
        return empIncrementDueDate;
    }

    public void setEmpJoinDateGratuity(Date empJoinDateGratuity) {
        this.empJoinDateGratuity = empJoinDateGratuity;
    }

    public Date getEmpJoinDateGratuity() {
        return empJoinDateGratuity;
    }

    public void setEmpChqRetainerFee(BigDecimal empChqRetainerFee) {
        this.empChqRetainerFee = empChqRetainerFee;
    }

    public BigDecimal getEmpChqRetainerFee() {
        return empChqRetainerFee;
    }

    public void setEmpGrade(String empGrade) {
        this.empGrade = empGrade;
    }

    public String getEmpGrade() {
        return empGrade;
    }

    public void setEmpPfNo(String empPfNo) {
        this.empPfNo = empPfNo;
    }

    public String getEmpPfNo() {
        return empPfNo;
    }

    public void setEmpUanNo(String empUanNo) {
        this.empUanNo = empUanNo;
    }

    public String getEmpUanNo() {
        return empUanNo;
    }

    public void setEmpEsiNo(String empEsiNo) {
        this.empEsiNo = empEsiNo;
    }

    public String getEmpEsiNo() {
        return empEsiNo;
    }

    public void setEmpNominationGratuity(String empNominationGratuity) {
        this.empNominationGratuity = empNominationGratuity;
    }

    public String getEmpNominationGratuity() {
        return empNominationGratuity;
    }

    public void setEmpNominationPf(String empNominationPf) {
        this.empNominationPf = empNominationPf;
    }

    public String getEmpNominationPf() {
        return empNominationPf;
    }

    public void setEmpOldEsicDays(String empOldEsicDays) {
        this.empOldEsicDays = empOldEsicDays;
    }

    public String getEmpOldEsicDays() {
        return empOldEsicDays;
    }

    public void setEmpAdhaarNo(String empAdhaarNo) {
        this.empAdhaarNo = empAdhaarNo;
    }

    public String getEmpAdhaarNo() {
        return empAdhaarNo;
    }

    public void setEmpPanNo(String empPanNo) {
        this.empPanNo = empPanNo;
    }

    public String getEmpPanNo() {
        return empPanNo;
    }

    public void setEmpAddlnAmount(BigDecimal empAddlnAmount) {
        this.empAddlnAmount = empAddlnAmount;
    }

    public BigDecimal getEmpAddlnAmount() {
        return empAddlnAmount;
    }

    public void setEmpIncrementLastDueDate(Date empIncrementLastDueDate) {
        this.empIncrementLastDueDate = empIncrementLastDueDate;
    }

    public Date getEmpIncrementLastDueDate() {
        return empIncrementLastDueDate;
    }

    public void setEmpIncrementNextDueDate(Date empIncrementNextDueDate) {
        this.empIncrementNextDueDate = empIncrementNextDueDate;
    }

    public Date getEmpIncrementNextDueDate() {
        return empIncrementNextDueDate;
    }
    
    

    @Override
    public String toString() {
        return "AttpayEmpmst{" +
                "empNo=" + empNo + '\'' +
                "payEmpNo=" + payEmpNo + '\'' +
                "empName=" + empName + '\'' +
                "empDesignation=" + empDesignation + '\'' +
                "empDepartment=" + empDepartment + '\'' +
                "empBirthDate=" + empBirthDate + '\'' +
                "empJoinDate=" + empJoinDate + '\'' +
                "empConfirmDate=" + empConfirmDate + '\'' +
                "empLeftDate=" + empLeftDate + '\'' +
                "empQualification=" + empQualification + '\'' +
                "empWeekoff=" + empWeekoff + '\'' +
                "empCorresAddress=" + empCorresAddress + '\'' +
                "empPermAddress=" + empPermAddress + '\'' +
                "empCity=" + empCity + '\'' +
                "empDistrict=" + empDistrict + '\'' +
                "empState=" + empState + '\'' +
                "empCountry=" + empCountry + '\'' +
                "empPincode=" + empPincode + '\'' +
                "empPhone=" + empPhone + '\'' +
                "empEmail=" + empEmail + '\'' +
                "empBloodgroup=" + empBloodgroup + '\'' +
                "empMaritalStatus=" + empMaritalStatus + '\'' +
                "empSex=" + empSex + '\'' +
                "empCompany=" + empCompany + '\'' +
                "empDivision=" + empDivision + '\'' +
                "empCategory=" + empCategory + '\'' +
                "ipCreater=" + ipCreater + '\'' +
                "createdBy=" + createdBy + '\'' +
                "createdDate=" + createdDate + '\'' +
                "ipModifier=" + ipModifier + '\'' +
                "modifiedBy=" + modifiedBy + '\'' +
                "modifiedDate=" + modifiedDate + '\'' +
                "empShiftIdCosec=" + empShiftIdCosec + '\'' +
                "empShiftCategoryCosec=" + empShiftCategoryCosec + '\'' +
                "empShiftId=" + empShiftId + '\'' +
                "empMainCategory=" + empMainCategory + '\'' +
                "changed=" + changed + '\'' +
                "changedDate=" + changedDate + '\'' +
                "rejected=" + rejected + '\'' +
                "rejectedBy=" + rejectedBy + '\'' +
                "rejectedDate=" + rejectedDate + '\'' +
                "approved=" + approved + '\'' +
                "approvedBy=" + approvedBy + '\'' +
                "approvedDate=" + approvedDate + '\'' +
                "canceled=" + canceled + '\'' +
                "hierarchyId=" + hierarchyId + '\'' +
                "docDate=" + docDate + '\'' +
                "empBasicRate=" + empBasicRate + '\'' +
                "empPersonalPay=" + empPersonalPay + '\'' +
                "empPetrolLtrs=" + empPetrolLtrs + '\'' +
                "empVehicleNo=" + empVehicleNo + '\'' +
                "empBankName=" + empBankName + '\'' +
                "empBankAccountNo=" + empBankAccountNo + '\'' +
                "fullPresentInd=" + fullPresentInd + '\'' +
                "fullPresentUptoDate=" + fullPresentUptoDate + '\'' +
                "empWeekoffDay=" + empWeekoffDay + '\'' +
                "plRule=" + plRule + '\'' +
                "empMagazine=" + empMagazine + '\'' +
                "empElectricity=" + empElectricity + '\'' +
                "empHra=" + empHra + '\'' +
                "empWashingAllowance=" + empWashingAllowance + '\'' +
                "empSuperannuation=" + empSuperannuation + '\'' +
                "empIncrementDueDate=" + empIncrementDueDate + '\'' +
                "empJoinDateGratuity=" + empJoinDateGratuity + '\'' +
                "empChqRetainerFee=" + empChqRetainerFee + '\'' +
                "empGrade=" + empGrade + '\'' +
                "empPfNo=" + empPfNo + '\'' +
                "empUanNo=" + empUanNo + '\'' +
                "empEsiNo=" + empEsiNo + '\'' +
                "empNominationGratuity=" + empNominationGratuity + '\'' +
                "empNominationPf=" + empNominationPf + '\'' +
                "empOldEsicDays=" + empOldEsicDays + '\'' +
                "empAdhaarNo=" + empAdhaarNo + '\'' +
                "empPanNo=" + empPanNo + '\'' +
                "empAddlnAmount=" + empAddlnAmount + '\'' +
                "empIncrementLastDueDate=" + empIncrementLastDueDate + '\'' +
                "empIncrementNextDueDate=" + empIncrementNextDueDate + '\'' +
                '}';
    }

	
    public AttpayEmpmst(String empNo, String payEmpNo, String empName, String empDesignation, String empDepartment,
			Date empBirthDate, Date empJoinDate, Date empConfirmDate, Date empLeftDate, String empQualification,
			String empWeekoff, String empCorresAddress, String empPermAddress, String empCity, String empDistrict,
			String empState, String empCountry, String empPincode, String empPhone, String empEmail,
			String empBloodgroup, String empMaritalStatus, String empSex, String empCompany, String empDivision,
			String empCategory, String ipCreater, String createdBy, Date createdDate, String ipModifier,
			String modifiedBy, Date modifiedDate, String empShiftIdCosec, String empShiftCategoryCosec,
			String empShiftId, String empMainCategory, Integer changed, Date changedDate, Integer rejected,
			String rejectedBy, Date rejectedDate, Integer approved, String approvedBy, Date approvedDate,
			Boolean canceled, Integer hierarchyId, Date docDate, BigDecimal empBasicRate, BigDecimal empPersonalPay,
			BigDecimal empPetrolLtrs, String empVehicleNo, String empBankName, String empBankAccountNo,
			String fullPresentInd, Date fullPresentUptoDate, String empWeekoffDay, String plRule,
			BigDecimal empMagazine, BigDecimal empElectricity, BigDecimal empHra, BigDecimal empWashingAllowance,
			Boolean empSuperannuation, Date empIncrementDueDate, Date empJoinDateGratuity, BigDecimal empChqRetainerFee,
			String empGrade, String empPfNo, String empUanNo, String empEsiNo, String empNominationGratuity,
			String empNominationPf, String empOldEsicDays, String empAdhaarNo, String empPanNo,
			BigDecimal empAddlnAmount, Date empIncrementLastDueDate, Date empIncrementNextDueDate) {
		super();
		this.empNo = empNo;
		this.payEmpNo = payEmpNo;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empDepartment = empDepartment;
		this.empBirthDate = empBirthDate;
		this.empJoinDate = empJoinDate;
		this.empConfirmDate = empConfirmDate;
		this.empLeftDate = empLeftDate;
		this.empQualification = empQualification;
		this.empWeekoff = empWeekoff;
		this.empCorresAddress = empCorresAddress;
		this.empPermAddress = empPermAddress;
		this.empCity = empCity;
		this.empDistrict = empDistrict;
		this.empState = empState;
		this.empCountry = empCountry;
		this.empPincode = empPincode;
		this.empPhone = empPhone;
		this.empEmail = empEmail;
		this.empBloodgroup = empBloodgroup;
		this.empMaritalStatus = empMaritalStatus;
		this.empSex = empSex;
		this.empCompany = empCompany;
		this.empDivision = empDivision;
		this.empCategory = empCategory;
		this.ipCreater = ipCreater;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.ipModifier = ipModifier;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.empShiftIdCosec = empShiftIdCosec;
		this.empShiftCategoryCosec = empShiftCategoryCosec;
		this.empShiftId = empShiftId;
		this.empMainCategory = empMainCategory;
		this.changed = changed;
		this.changedDate = changedDate;
		this.rejected = rejected;
		this.rejectedBy = rejectedBy;
		this.rejectedDate = rejectedDate;
		this.approved = approved;
		this.approvedBy = approvedBy;
		this.approvedDate = approvedDate;
		this.canceled = canceled;
		this.hierarchyId = hierarchyId;
		this.docDate = docDate;
		this.empBasicRate = empBasicRate;
		this.empPersonalPay = empPersonalPay;
		this.empPetrolLtrs = empPetrolLtrs;
		this.empVehicleNo = empVehicleNo;
		this.empBankName = empBankName;
		this.empBankAccountNo = empBankAccountNo;
		this.fullPresentInd = fullPresentInd;
		this.fullPresentUptoDate = fullPresentUptoDate;
		this.empWeekoffDay = empWeekoffDay;
		this.plRule = plRule;
		this.empMagazine = empMagazine;
		this.empElectricity = empElectricity;
		this.empHra = empHra;
		this.empWashingAllowance = empWashingAllowance;
		this.empSuperannuation = empSuperannuation;
		this.empIncrementDueDate = empIncrementDueDate;
		this.empJoinDateGratuity = empJoinDateGratuity;
		this.empChqRetainerFee = empChqRetainerFee;
		this.empGrade = empGrade;
		this.empPfNo = empPfNo;
		this.empUanNo = empUanNo;
		this.empEsiNo = empEsiNo;
		this.empNominationGratuity = empNominationGratuity;
		this.empNominationPf = empNominationPf;
		this.empOldEsicDays = empOldEsicDays;
		this.empAdhaarNo = empAdhaarNo;
		this.empPanNo = empPanNo;
		this.empAddlnAmount = empAddlnAmount;
		this.empIncrementLastDueDate = empIncrementLastDueDate;
		this.empIncrementNextDueDate = empIncrementNextDueDate;
	}
	

    


}
