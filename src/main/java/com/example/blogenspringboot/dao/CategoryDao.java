package com.example.blogenspringboot.dao;

import com.example.blogenspringboot.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
