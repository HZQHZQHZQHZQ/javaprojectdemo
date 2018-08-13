package com.chu.demo.pictest;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class LittlePicUtil {

	public static void main(String[] args) {
		
//		AppointSize("images/a.jpg", "images/ab.jpg", 58, 58);//指定大小进行缩放 
//		AppoinitProportion("images/a.jpg", "images/ab.jpg", 0.25f);//按照比例进行缩放 
//		NotAppoinitProportion("images/a.jpg", "images/ab.jpg", 58, 58);//指定大小进行缩放 
//		AppointRotate("images/a.jpg", "images/ab.jpg", 58, 58, 90);//旋转 
//		Watermark("images/a.jpg", "images/c.jpg", 500, 500, "images/ab.jpg", 0.3f, 0.1f);//水印
		storeThumbnail("images/a.jpg", "images/ab.jpg");
	}
	
	private static String storeThumbnail(String standardImgPath, String thumName) {
	    File file = new File(standardImgPath);
	    if(file!=null&&file.isFile()){
	        try {
	            File outFIle = new File(thumName);
	            Thumbnails.of(file).size(100, 150).toFile(outFIle);
	            return outFIle.getName();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    return null;
	}
	
	/**
	 * 指定大小进行缩放 
	 */
	public static void AppointSize(String ofPath, String toPath, int width, int height) {
		try {
			Thumbnails.of(ofPath)   
			.size(width, height)  
			.toFile(toPath);
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
	
	/**
	 * 按照比例进行缩放 
	 */
	public static void AppoinitProportion(String ofPath, String toPath, double arg0) {
		try {
			Thumbnails.of(ofPath)   
			.scale(arg0)  
			.toFile(toPath);
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
	
	/**
	 * 不按照比例，指定大小进行缩放 
	 */
	public static void NotAppoinitProportion(String ofPath, String toPath, int width, int height) {
		try {
			Thumbnails.of(ofPath)   
			.size(width, height)  
			.keepAspectRatio(false)  
			.toFile(toPath);
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
	
	/**
	 * 旋转 
	 */
	public static void AppointRotate(String ofPath, String toPath, int width, int height, int angle) {
		try {
			Thumbnails.of(ofPath)   
			.size(width, height)  
			.rotate(angle)   
			.toFile(toPath);
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
	
	public static void Watermark(String ofPath, String toPath, int width, int height, String watermarkPath, float arg0, float arg1) {
		try {
			Thumbnails.of(ofPath)   
	        .size(width, height)  
	        .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(watermarkPath)), arg0)   
	        .outputQuality(arg1)   
	        .toFile(toPath); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
