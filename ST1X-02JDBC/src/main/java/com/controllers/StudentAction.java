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

import com.models.Student;

public class StudentAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception 
	{
		
		Student st=(Student)form;
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost:3306/struts1x","root","system123");
		
		PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?)");
		pstmt.setInt(1,st.getSid());
		pstmt.setString(2,st.getName());
		
		int record = pstmt.executeUpdate();
		
		request.setAttribute("record",record);
		
		return mapping.findForward("display");
	}

}
