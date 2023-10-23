package com.demo.Repository.DinvHeaderRepositoryH;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.demo.Model.DInvReqHeaderH.DInvReqHeaderH;
import com.demo.Model.DInvReqHeaderHPrimaryKey.DInvReqHeaderHPrimaryKey;

@EnableJpaRepositories
@Repository
public interface DinvHeaderRepositoryH extends JpaRepository<DInvReqHeaderH, DInvReqHeaderHPrimaryKey> {

	
//	@Query(nativeQuery = true, value = "SELECT * FROM D_INV_REQ_HEADER_H WHERE COMPANY_ID='2' AND REQ_NO = ?1")
//	List<DInvReqHeaderH> getReqDocumentHistory(String reqNo);
	
	@Query(nativeQuery = true, value = "SELECT * FROM D_INV_REQ_HEADER_H WHERE COMPANY_ID='2' LIMIT 10")
	List<DInvReqHeaderH> getReqDocumentHistoryList();
}
