package qrcode.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.zxing.qrcode.encoder.QRCode;

import net.glxn.qrgen.image.ImageType;

public class QRCodeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		processRequest(req,resp);
	}
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		processRequest(req,resp);
	}
	
	protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		
		HttpSession httpSession=req.getSession(false);
		
		String qrtext = (String) httpSession.getAttribute("qrtext");
		
		ByteArrayOutputStream byteArrayOutputStream = 
				net.glxn.qrgen.QRCode.from(qrtext).to(ImageType.JPG).stream();
				
		resp.setContentType("image/jpg");
				
		OutputStream outputStream=resp.getOutputStream();
		
		outputStream.write(byteArrayOutputStream.toByteArray());
		
		outputStream.flush();
		outputStream.close();
				
	}

}
