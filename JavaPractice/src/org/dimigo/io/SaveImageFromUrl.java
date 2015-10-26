package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		// TODO Auto-gener
		String imageUrl = "http://hackdef.dothome.co.kr/game/img/monster/monsterD.png";
		try {
			
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/logo.png")){
				int result;
				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1){
					os.write(buf, 0, result);
				}
			} catch(IOException e){
				e.printStackTrace();
			}
			System.out.println("파일 다운로드 완료.");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
