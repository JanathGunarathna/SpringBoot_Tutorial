package com.tutorial_SpringBoot.Tutorial.External.Repository;

import com.tutorial_SpringBoot.Tutorial.Domain.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<student, Integer> {
}
