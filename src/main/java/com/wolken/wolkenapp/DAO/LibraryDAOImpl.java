package com.wolken.wolkenapp.DAO;

import java.util.List;


import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wolken.wolkenapp.HibernateUtil;
import com.wolken.wolkenapp.DTO.LibraryDTO;
import com.wolken.wolkenapp.Exception.libexception;

public class LibraryDAOImpl implements LibraryDAO {
	Logger logger=Logger.getLogger("LibraryDAOImpl");
	@Override
	public void save(LibraryDTO librarydto) {
		try {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(librarydto);
		transaction.commit();
		session.close();
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("exception");
		}
		
		
	}

	@Override
	public void updatePriceByBookName(String bookname, double price) throws libexception  {
		boolean flag=false;
		try {
		// TODO Auto-generated method stub
		if(price>0) {
			logger.info("inside update");
		Session session= HibernateUtil.getFactory().openSession();
		Query query1=session.createQuery("select bookname  from LibraryDTO ld where ld.bookname= :bookname");
		query1.setParameter("bookname", bookname);
		if(query1!=null) {
		flag=true;
		}
		System.out.println(flag);
		Query query=session.getNamedQuery("update");
		query.setParameter("pr", price);
		query.setParameter("bknm",bookname);
		Transaction transaction=session.beginTransaction();
		query.executeUpdate();
		
		System.out.println(flag);
		
		
		transaction.commit();
		session.close();
		
		 }else { 
			 throw new libexception(); 
			 }
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void delete(String bookname) {
		// TODO Auto-generated method stub
		try {
		Session session=HibernateUtil.getFactory().openSession();
		Query query=session.createQuery("delete from LibraryDTO lr where lr.bookname= :bknm");
		query.setParameter("bknm", bookname);
		
		Transaction transaction = session.beginTransaction();
		
		query.executeUpdate();
		session.close();
		transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			logger.error("exception");
			e.printStackTrace();
			
		}
		
		
	}

	@Override
	public List<LibraryDTO> getAll() {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getFactory().openSession();
		Query query=session.getNamedQuery("selectAll");
		 List<LibraryDTO> dto2=query.list();
		 //dto2.forEach(System.out::print);
		 
		
		return dto2;
	}

}
