package com.generate.QR;

import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class GenerateQRcode {
	
	
public static void createQR(String data , String path) throws Exception {
		
		
		BitMatrix matrix = new MultiFormatWriter()
				.encode(data, BarcodeFormat.QR_CODE, 500, 500);
		
		MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));

	}
  
}