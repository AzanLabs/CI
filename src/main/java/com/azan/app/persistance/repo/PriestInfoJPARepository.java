package com.azan.app.persistance.repo;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azan.app.persistance.entity.PriestInfo;
import com.azan.app.persistance.entity.User;

public interface PriestInfoJPARepository extends
JpaRepository<PriestInfo , BigInteger>{

	public PriestInfo findByUser(User user);

}
