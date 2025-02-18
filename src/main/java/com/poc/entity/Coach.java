package com.poc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coach {

    @Id
    private int id;

    private double height;
    private double weight;

    // Lombok @Data will automatically generate:
    // - Getters and Setters
    // - toString()
    // - equals() and hashCode()
    
}
