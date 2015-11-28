package com.azan.app.core.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.azan.app.core.dao.ChurchInfoDao;
import com.azan.app.persistance.entity.ChurchInfo;


@Service
public class ChurchInfoDaoImpl implements ChurchInfoDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public ChurchInfo getChurchLocalidyInfo() {
		
		ChurchInfo info = new ChurchInfo();
		Session session = null;
		Query query = null;
		try{
			
			session = (Session) em.getDelegate();
			
			String hsql = " SELECT countryList AS , stateList AS , districtList as FROM ChurchInfo  ";
			query = session.createQuery("  ");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return info;
	}
	
	
	

}
