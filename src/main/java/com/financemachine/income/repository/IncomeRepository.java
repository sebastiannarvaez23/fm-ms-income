package com.financemachine.income.repository;

import com.financemachine.income.entities.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IncomeRepository extends JpaRepository<Income, Long> {
    
    @Query(value = "SELECT * FROM Income ORDER BY id DESC LIMIT 1", nativeQuery = true)
    Income findLastIncome();
    
}