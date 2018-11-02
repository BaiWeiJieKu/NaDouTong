package com.ndt.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

public class UpLoadUtil {
	/**
	 * 上传图片工具类
	 * 
	 * @param file
	 * @param path
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public static String saveFile(MultipartFile file, String path) throws IllegalStateException, IOException {
		// 保存图片到
		String name = UUID.randomUUID().toString().replaceAll("-", "");
		// jpg
		String ext = FilenameUtils.getExtension(file.getOriginalFilename());
		// 判断有没有当前文件夹
		File f = new File(path + "upload/");
		if (!f.exists()) {
			f.mkdirs();
		}
		file.transferTo(new File(path + "upload/" + name + "." + ext));

		return "/upload/" + name + "." + ext;
	}
}
