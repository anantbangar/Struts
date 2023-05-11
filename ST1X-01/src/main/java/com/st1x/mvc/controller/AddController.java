package com.st1x.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.st1x.mvc.models.AddBean;

public class AddController extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception 
	{
		AddBean ab=(AddBean)form;
		
		int num1=ab.getNum1(); 
		int num2=ab.getNum2(); 
		int add=num1+num2;
		System.out.println(add);
		 
		request.setAttribute("addition",add);
		
		return mapping.findForward("display");
	}

}
