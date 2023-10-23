package com.demo.Config.Bean;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class DInvReqHeaderBean {

	public Long companyId;

	public String reqNo;

	public Date reqDate;

	public String store;

	public Long sourceDeptId;

	public Long destDeptId;

	public Date requiredDate;

	public Long buyer;
	
	public Boolean approved;

	public Date approvedDate;

	public Date rejectedDate;

	public String rejectedRemarks;

	public Boolean canceled;

	public String status;

	public Long createdBy;

	public Date createdDate;

	public Long modifiedBy;

	public Date modifiedDate;

	public Integer hierarchyId;

	public Boolean rejected;

	public Boolean changed;

	public Date changedDate;

	public Long docId;
	
	public Boolean attachement;
	
	public String attachementPath;

	public Boolean testingFlag;

	public Integer testingDays;

	public String testingReason;

	public String purpose;

	public String remarks;

	public DInvReqHeaderBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DInvReqHeaderBean(Long companyId, String reqNo, Date reqDate, String store, Long sourceDeptId, Long destDeptId,
			Date requiredDate, Long buyer, Boolean approved, Date approvedDate, Date rejectedDate,
			String rejectedRemarks, Boolean canceled, String status, Long createdBy, Date createdDate, Long modifiedBy,
			Date modifiedDate, Integer hierarchyId, Boolean rejected, Boolean changed, Date changedDate, Long docId,
			Boolean attachement, String attachementPath, Boolean testingFlag, Integer testingDays, String testingReason,
			String purpose, String remarks) {
		super();
		this.companyId = companyId;
		this.reqNo = reqNo;
		this.reqDate = reqDate;
		this.store = store;
		this.sourceDeptId = sourceDeptId;
		this.destDeptId = destDeptId;
		this.requiredDate = requiredDate;
		this.buyer = buyer;
		this.approved = approved;
		this.approvedDate = approvedDate;
		this.rejectedDate = rejectedDate;
		this.rejectedRemarks = rejectedRemarks;
		this.canceled = canceled;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.hierarchyId = hierarchyId;
		this.rejected = rejected;
		this.changed = changed;
		this.changedDate = changedDate;
		this.docId = docId;
		this.attachement = attachement;
		this.attachementPath = attachementPath;
		this.testingFlag = testingFlag;
		this.testingDays = testingDays;
		this.testingReason = testingReason;
		this.purpose = purpose;
		this.remarks = remarks;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getReqNo() {
		return reqNo;
	}

	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}

	public Date getReqDate() {
		return reqDate;
	}

	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public Long getSourceDeptId() {
		return sourceDeptId;
	}

	public void setSourceDeptId(Long sourceDeptId) {
		this.sourceDeptId = sourceDeptId;
	}

	public Long getDestDeptId() {
		return destDeptId;
	}

	public void setDestDeptId(Long destDeptId) {
		this.destDeptId = destDeptId;
	}

	public Date getRequiredDate() {
		return requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Long getBuyer() {
		return buyer;
	}

	public void setBuyer(Long buyer) {
		this.buyer = buyer;
	}

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public Date getRejectedDate() {
		return rejectedDate;
	}

	public void setRejectedDate(Date rejectedDate) {
		this.rejectedDate = rejectedDate;
	}

	public String getRejectedRemarks() {
		return rejectedRemarks;
	}

	public void setRejectedRemarks(String rejectedRemarks) {
		this.rejectedRemarks = rejectedRemarks;
	}

	public Boolean getCanceled() {
		return canceled;
	}

	public void setCanceled(Boolean canceled) {
		this.canceled = canceled;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Integer getHierarchyId() {
		return hierarchyId;
	}

	public void setHierarchyId(Integer hierarchyId) {
		this.hierarchyId = hierarchyId;
	}

	public Boolean getRejected() {
		return rejected;
	}

	public void setRejected(Boolean rejected) {
		this.rejected = rejected;
	}

	public Boolean getChanged() {
		return changed;
	}

	public void setChanged(Boolean changed) {
		this.changed = changed;
	}

	public Date getChangedDate() {
		return changedDate;
	}

	public void setChangedDate(Date changedDate) {
		this.changedDate = changedDate;
	}

	public Long getDocId() {
		return docId;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public Boolean getAttachement() {
		return attachement;
	}

	public void setAttachement(Boolean attachement) {
		this.attachement = attachement;
	}

	public String getAttachementPath() {
		return attachementPath;
	}

	public void setAttachementPath(String attachementPath) {
		this.attachementPath = attachementPath;
	}

	public Boolean getTestingFlag() {
		return testingFlag;
	}

	public void setTestingFlag(Boolean testingFlag) {
		this.testingFlag = testingFlag;
	}

	public Integer getTestingDays() {
		return testingDays;
	}

	public void setTestingDays(Integer testingDays) {
		this.testingDays = testingDays;
	}

	public String getTestingReason() {
		return testingReason;
	}

	public void setTestingReason(String testingReason) {
		this.testingReason = testingReason;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	

}
