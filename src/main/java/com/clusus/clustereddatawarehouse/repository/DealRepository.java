package com.clusus.clustereddatawarehouse.repository;

import com.clusus.clustereddatawarehouse.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepository extends JpaRepository<Deal, Long> {
}
