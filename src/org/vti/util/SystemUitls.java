package org.vti.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

public class SystemUitls {

	public static Image getImage(String path){
		BufferedImage image=null;
		try {
			image = ImageIO.read(Runtime.getRuntime().getClass().getResource("/"+path));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return image;
	}
	
	public static String getText(){
		try {
			InputStream inputStream = Runtime.getRuntime().getClass().getResourceAsStream("/resource/small.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			String temp = "";
			while (reader.ready()) {
				temp += reader.readLine() + "\n";
			}
			return temp;
		} catch (Exception e) {
			return "";
		}
	}
}
