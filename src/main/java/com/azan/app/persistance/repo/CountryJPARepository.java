package com.azan.app.persistance.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azan.app.persistance.entity.Country;



public interface CountryJPARepository extends JpaRepository<Country, Integer> {

}
