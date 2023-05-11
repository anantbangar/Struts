package qrcode;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class QRCodeGenerator 
{
	public static void main(String[] args) 
	{
		try 
		{
			
			String str="https://www.youtube.com/watch?v=ajXMWivZuiU&list=PL0zysOflRCekeiERASkpi-crREVensZGS&index=79&ab_channel=LearnCodeWithDurgesh";
			
			String path="C:\\Users\\Anant\\Desktop\\QRCodes\\youtubeCode1.jpg";
			
			BitMatrix bitMatrix=new MultiFormatWriter()
					.encode(str, BarcodeFormat.QR_CODE, 500, 500);
			
			MatrixToImageWriter.writeToPath(bitMatrix, "jpg", Paths.get(path));
			
			System.out.println("QR code is generated successfully ");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
