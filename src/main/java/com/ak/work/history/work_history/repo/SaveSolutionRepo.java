package com.ak.work.history.work_history.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ak.work.history.work_history.entity.SolutionsEntity;
@Repository
public interface SaveSolutionRepo extends JpaRepository<SolutionsEntity, String>{
	public List<SolutionsEntity> findByIssueContaining(String issue);
}
