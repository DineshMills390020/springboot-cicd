package com.demo.Model.DInvReqHeaderHPrimaryKey;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;

public class DInvReqHeaderHPrimaryKey implements Serializable {

	    @Column(name = "COMPANY_ID", nullable = false)
	    private Long companyId;
	    
	    @Column(name = "REQ_NO", nullable = false)
	    private String reqNo;
	    
	    @Column(name = "REVISION_NO", nullable = false)
	    private Integer revisionNo;

		public DInvReqHeaderHPrimaryKey() {
			super();
		}

		public DInvReqHeaderHPrimaryKey(Long companyId, String reqNo, Integer revisionNo) {
			super();
			this.companyId = companyId;
			this.reqNo = reqNo;
			this.revisionNo = revisionNo;
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

		@Override
		public int hashCode() {
			return Objects.hash(companyId, reqNo, revisionNo);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DInvReqHeaderHPrimaryKey other = (DInvReqHeaderHPrimaryKey) obj;
			return Objects.equals(companyId, other.companyId) && Objects.equals(reqNo, other.reqNo)
					&& Objects.equals(revisionNo, other.revisionNo);
		}

		public Integer getRevisionNo() {
			return revisionNo;
		}

		public void setRevisionNo(Integer revisionNo) {
			this.revisionNo = revisionNo;
		}
	    
	    
	    
}
