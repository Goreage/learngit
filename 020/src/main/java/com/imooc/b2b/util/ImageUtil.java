package com.imooc.b2b.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import ch.qos.logback.classic.Logger;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {
	//获取绝对地址，从线程反推
	private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
	private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	private static final Random r = new Random(); 
	public static String generateThumbnail(InputStream thumbnailInputStream, String fileName, String targetAddr) {
		String realFileName = getRandomFileName();
		String extension = getFileExtension(fileName);
		makeDirPath(targetAddr);
		String relativeAddr = targetAddr + realFileName +extension;
		File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
		try {
			Thumbnails.of(thumbnailInputStream).size(200, 200)
			.watermark(Positions.BOTTOM_RIGHT,
					ImageIO.read(new File(basePath+"/watermark.jpg")),0.25f)
			.outputQuality(0.8f).toFile(dest);
		}catch(IOException e) {
			throw new RuntimeException("创建缩略图失败:" + e.toString());
		}
		return relativeAddr;
	}
	/**
	 * 创建目标路径所涉及的到的目录， 即/home/work/xiangzai/xxx.jpg
	 * 那么 home work xiangzai 这三个文件夹都得自动创建
	 * @param targetAddr
	 */
	private static void makeDirPath(String targetAddr) {
		String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
		File dirPath = new File(realFileParentPath);
		if(!dirPath.exists()) {
			dirPath.mkdirs();
		}
	}
	/**
	 * 获取输入文件流的扩展名，看后缀是JPG ,还是其他
	 * 只需获取最后点号后的字符
	 * @param thumbnailx`
	 * @return
	 */
	private static String getFileExtension(String fileName) {
		//String originalFileName = file.getName();// 返回客户端文件系统中的原始文件名
		return fileName.substring(fileName.lastIndexOf("."));
	}
	/**
	 * 生成随机文件名。当前年月日小时分钟秒钟+五位数随机数
	 * 确保在不同的批次所传的文件名都不同
	 * @return
	 */
	public static String getRandomFileName() {
		// 获取随机的五位数
		int rannum = r.nextInt(89999) + 10000;
		String nowTimeStr = sDateFormat.format(new Date());
		return nowTimeStr + rannum;
	}
	public static void main(String[] args) throws IOException {
		//String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		Thumbnails.of(new File("D:\\projectdev\\image\\finsh.jpg"))
		.size(200, 200).watermark(Positions.BOTTOM_RIGHT,
				ImageIO.read(new File(basePath+"/watermark.jpg")),0.25f).outputQuality(0.8f).toFile("D:\\projectdev\\image\\finshwartermark.jpg");
	}
	/**
	 * store是文件的路径还是目录的路径，
	 * 如果storePath是文件路径则删除改文件，
	 * 如果storePath是目录路径则删除该目录下的所有文件
	 * @param storePath
	 */
	public static void deleteFileOrPath(String storePath) {
		File fileOrPath = new File(PathUtil.getImgBasePath() + storePath);
		if(fileOrPath.exists()) {
			if(fileOrPath.isDirectory()) {
				File files[] = fileOrPath.listFiles();
				for(int i=0; i<files.length; i++) {
					//递归的删除文件
					files[i].delete();
				}
			}
			fileOrPath.delete();
		}
	}
}
