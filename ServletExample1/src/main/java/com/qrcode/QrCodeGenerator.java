package com.qrcode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * Servlet implementation class QrCodeGenerator
 */
@WebServlet("/QrCodeGenerator")
public class QrCodeGenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QrCodeGenerator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name=request.getParameter("name");
		response.setContentType("image/png");
		OutputStream outputStream= response.getOutputStream();
		outputStream.write(getQrCodeImage(name, 400, 400));
		outputStream.flush();
		outputStream.close();
		}

	private byte[] getQrCodeImage(String txt,int wid,int height)
	{
		try
		{
			QRCodeWriter qrCodeWriter=new QRCodeWriter();
			BitMatrix bitMatrix=qrCodeWriter.encode(txt, BarcodeFormat.QR_CODE , wid, height);
			ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
			MatrixToImageWriter.writeToStream(bitMatrix, "png", byteArrayOutputStream);
			return byteArrayOutputStream.toByteArray();
		}catch (Exception e) {
		    return null;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub doGet(request, response); }
	 */

}
