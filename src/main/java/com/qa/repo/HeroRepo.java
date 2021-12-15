package com.qa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qa.domain.Hero;

public interface HeroRepo extends JpaRepository<Hero, Long> {

}
