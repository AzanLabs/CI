package com.azan.app.persistance.repo;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azan.app.persistance.entity.ChurchEvent;

public interface AddEventJPARepository extends JpaRepository<ChurchEvent,BigInteger>{

}
