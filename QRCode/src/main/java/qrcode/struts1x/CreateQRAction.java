package qrcode.struts1x;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.chain.contexts.ServletActionContext;

import net.glxn.qrgen.image.ImageType;

public class CreateQRAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception 
	{
		HttpSession httpSession= request.getSession();
		
		String qrtext=request.getParameter("qrtext");
		
		httpSession.setAttribute("qrtext", qrtext);
				
		return mapping.findForward("qrCode");
	}
}
