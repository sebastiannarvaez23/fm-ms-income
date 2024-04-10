package com.financemachine.income.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Income {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private float basic;
    private Float additional;
    
    @ManyToOne
    @JoinColumn(name = "reason_id", referencedColumnName = "id")
    private Reason reason;
    
    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;
        
}