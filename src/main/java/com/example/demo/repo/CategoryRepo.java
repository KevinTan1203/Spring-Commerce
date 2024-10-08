package com.example.demo.repo;

import com.example.demo.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
    
}