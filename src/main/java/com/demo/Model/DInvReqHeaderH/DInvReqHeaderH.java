package com.demo.Model.DInvReqHeaderH;

import java.sql.Date;
import java.util.Objects;

import com.demo.Model.DInvReqHeaderHPrimaryKey.DInvReqHeaderHPrimaryKey;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
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
@IdClass(DInvReqHeaderHPrimaryKey.class)
@Table(schema = "DINESHMILLS", name = "D_INV_REQ_HEADER_H")
public class DInvReqHeaderH {
	 private static final long serialVersionUID = 1L;

	    @Id
	    @Column(name = "COMPANY_ID", nullable = false)
	    private Long companyId;

	    @Id
	    @Column(name = "REQ_NO", nullable = false)
	    private String reqNo;

	    @Id
	    @Column(name = "REVISION_NO", nullable = false)
	    private Integer revisionNo;

	    @Column(name = "UPDATED_BY")
	    private Integer updatedBy;

	    @Column(name = "APPROVAL_STATUS")
	    private String approvalStatus;

	    @Column(name = "ENTRY_DATE")
	    private Date entryDate;

	    @Column(name = "REQ_DATE")
	    private Date reqDate;

	    @Column(name = "STORE")
	    private String store;

	    @Column(name = "SOURCE_DEPT_ID")
	    private Long sourceDeptId;

	    @Column(name = "DEST_DEPT_ID")
	    private Long destDeptId;

	    @Column(name = "REQUIRED_DATE")
	    private Date requiredDate;

	    @Column(name = "BUYER")
	    private Long buyer;

	    @Column(name = "APPROVED")
	    private Boolean approved;

	    @Column(name = "APPROVED_DATE")
	    private Date approvedDate;

	    @Column(name = "REJECTED_DATE")
	    private Date rejectedDate;

	    @Column(name = "REJECTED_REMARKS")
	    private String rejectedRemarks;

	    @Column(name = "CANCELED")
	    private Boolean canceled;

	    @Column(name = "STATUS")
	    private String status;

	    @Column(name = "CREATED_BY")
	    private Long createdBy;

	    @Column(name = "CREATED_DATE")
	    private Date createdDate;

	    @Column(name = "MODIFIED_BY")
	    private Long modifiedBy;

	    @Column(name = "MODIFIED_DATE")
	    private Date modifiedDate;

	    @Column(name = "HIERARCHY_ID")
	    private Integer hierarchyId;

	    @Column(name = "REJECTED")
	    private Boolean rejected;

	    @Column(name = "CHANGED")
	    private Boolean changed;

	    @Column(name = "CHANGED_DATE")
	    private Date changedDate;

	    @Column(name = "DOC_ID")
	    private Long docId;

	    @Column(name = "ATTACHEMENT")
	    private Boolean attachement;

	    @Column(name = "ATTACHEMENT_PATH")
	    private String attachementPath;

	    @Column(name = "TESTING_FLAG")
	    private Boolean testingFlag;

	    @Column(name = "TESTING_DAYS")
	    private Integer testingDays;

	    @Column(name = "TESTING_REASON")
	    private String testingReason;

	    @Column(name = "APPROVER_REMARKS")
	    private String approverRemarks;

	    @Column(name = "PURPOSE")
	    private String purpose;

	    @Column(name = "REMARKS")
	    private String remarks;

		public DInvReqHeaderH() {
			super();
			// TODO Auto-generated constructor stub
		}

		public DInvReqHeaderH(Long companyId, String reqNo, Integer revisionNo, Integer updatedBy,
				String approvalStatus, Date entryDate, Date reqDate, String store, Long sourceDeptId, Long destDeptId,
				Date requiredDate, Long buyer, Boolean approved, Date approvedDate, Date rejectedDate,
				String rejectedRemarks, Boolean canceled, String status, Long createdBy, Date createdDate,
				Long modifiedBy, Date modifiedDate, Integer hierarchyId, Boolean rejected, Boolean changed,
				Date changedDate, Long docId, Boolean attachement, String attachementPath, Boolean testingFlag,
				Integer testingDays, String testingReason, String approverRemarks, String purpose, String remarks) {
			super();
			this.companyId = companyId;
			this.reqNo = reqNo;
			this.revisionNo = revisionNo;
			this.updatedBy = updatedBy;
			this.approvalStatus = approvalStatus;
			this.entryDate = entryDate;
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
			this.approverRemarks = approverRemarks;
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

		public Integer getRevisionNo() {
			return revisionNo;
		}

		public void setRevisionNo(Integer revisionNo) {
			this.revisionNo = revisionNo;
		}

		public Integer getUpdatedBy() {
			return updatedBy;
		}

		public void setUpdatedBy(Integer updatedBy) {
			this.updatedBy = updatedBy;
		}

		public String getApprovalStatus() {
			return approvalStatus;
		}

		public void setApprovalStatus(String approvalStatus) {
			this.approvalStatus = approvalStatus;
		}

		public Date getEntryDate() {
			return entryDate;
		}

		public void setEntryDate(Date entryDate) {
			this.entryDate = entryDate;
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

		public String getApproverRemarks() {
			return approverRemarks;
		}

		public void setApproverRemarks(String approverRemarks) {
			this.approverRemarks = approverRemarks;
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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public int hashCode() {
			return Objects.hash(approvalStatus, approved, approvedDate, approverRemarks, attachement, attachementPath,
					buyer, canceled, changed, changedDate, companyId, createdBy, createdDate, destDeptId, docId,
					entryDate, hierarchyId, modifiedBy, modifiedDate, purpose, rejected, rejectedDate, rejectedRemarks,
					remarks, reqDate, reqNo, requiredDate, revisionNo, sourceDeptId, status, store, testingDays,
					testingFlag, testingReason, updatedBy);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DInvReqHeaderH other = (DInvReqHeaderH) obj;
			return Objects.equals(approvalStatus, other.approvalStatus) && Objects.equals(approved, other.approved)
					&& Objects.equals(approvedDate, other.approvedDate)
					&& Objects.equals(approverRemarks, other.approverRemarks)
					&& Objects.equals(attachement, other.attachement)
					&& Objects.equals(attachementPath, other.attachementPath) && Objects.equals(buyer, other.buyer)
					&& Objects.equals(canceled, other.canceled) && Objects.equals(changed, other.changed)
					&& Objects.equals(changedDate, other.changedDate) && Objects.equals(companyId, other.companyId)
					&& Objects.equals(createdBy, other.createdBy) && Objects.equals(createdDate, other.createdDate)
					&& Objects.equals(destDeptId, other.destDeptId) && Objects.equals(docId, other.docId)
					&& Objects.equals(entryDate, other.entryDate) && Objects.equals(hierarchyId, other.hierarchyId)
					&& Objects.equals(modifiedBy, other.modifiedBy) && Objects.equals(modifiedDate, other.modifiedDate)
					&& Objects.equals(purpose, other.purpose) && Objects.equals(rejected, other.rejected)
					&& Objects.equals(rejectedDate, other.rejectedDate)
					&& Objects.equals(rejectedRemarks, other.rejectedRemarks) && Objects.equals(remarks, other.remarks)
					&& Objects.equals(reqDate, other.reqDate) && Objects.equals(reqNo, other.reqNo)
					&& Objects.equals(requiredDate, other.requiredDate) && Objects.equals(revisionNo, other.revisionNo)
					&& Objects.equals(sourceDeptId, other.sourceDeptId) && Objects.equals(status, other.status)
					&& Objects.equals(store, other.store) && Objects.equals(testingDays, other.testingDays)
					&& Objects.equals(testingFlag, other.testingFlag)
					&& Objects.equals(testingReason, other.testingReason) && Objects.equals(updatedBy, other.updatedBy);
		}

		@Override
		public String toString() {
			return "D_INV_REQ_HEADER_H [companyId=" + companyId + ", reqNo=" + reqNo + ", revisionNo=" + revisionNo
					+ ", updatedBy=" + updatedBy + ", approvalStatus=" + approvalStatus + ", entryDate=" + entryDate
					+ ", reqDate=" + reqDate + ", store=" + store + ", sourceDeptId=" + sourceDeptId + ", destDeptId="
					+ destDeptId + ", requiredDate=" + requiredDate + ", buyer=" + buyer + ", approved=" + approved
					+ ", approvedDate=" + approvedDate + ", rejectedDate=" + rejectedDate + ", rejectedRemarks="
					+ rejectedRemarks + ", canceled=" + canceled + ", status=" + status + ", createdBy=" + createdBy
					+ ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy + ", modifiedDate=" + modifiedDate
					+ ", hierarchyId=" + hierarchyId + ", rejected=" + rejected + ", changed=" + changed
					+ ", changedDate=" + changedDate + ", docId=" + docId + ", attachement=" + attachement
					+ ", attachementPath=" + attachementPath + ", testingFlag=" + testingFlag + ", testingDays="
					+ testingDays + ", testingReason=" + testingReason + ", approverRemarks=" + approverRemarks
					+ ", purpose=" + purpose + ", remarks=" + remarks + "]";
		}

}
