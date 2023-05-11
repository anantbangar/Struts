package com.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.models.Student1;

public class Student1Action extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception 
	{
		
		Configuration cfg=new Configuration();
		cfg.configure("com/controllers/hibernate.cfg.xml");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Student1 st1=(Student1)form;
		System.out.println(st1);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(st1);
		transaction.commit();
		session.close();
		
		request.setAttribute("student", st1);
		
		return mapping.findForward("display");
	}

}
