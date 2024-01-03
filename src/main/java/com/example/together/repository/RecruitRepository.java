package com.example.together.repository;

import com.together.togetherpj.domain.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecruitRepository extends JpaRepository<Recruit, Long>, RecruitRepositoryCustom {

    List<Recruit> findTop10ByOrderByIdDesc();
}
