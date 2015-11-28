package com.azan.app.persistance.repo;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azan.app.persistance.entity.ChurchAdditionalInfo;

public interface ChurchAddInfoJPARepository extends
JpaRepository<ChurchAdditionalInfo, BigInteger> {

}
