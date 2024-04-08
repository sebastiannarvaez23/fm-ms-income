package com.financemachine.income.controller;

import com.financemachine.income.repository.IncomeRepository;
import com.financemachine.income.entities.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/income")
public class IncomeRestController {
    
    @Autowired
    IncomeRepository incomeRepository;
            
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public Income findLastIncome() {
        return incomeRepository.findLastIncome();
    }
}
