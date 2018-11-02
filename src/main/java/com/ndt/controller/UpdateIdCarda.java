package com.ndt.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ndt.entity.Mobileregistry;
import com.ndt.service.Mobileregistryservice;
import com.ndt.util.JsonData;
@Controller
public class UpdateIdCarda {
	

	
		@Autowired
		private Mobileregistryservice mobileregistryservice;
	/**
	 *身份证反图片上传
	 * @param reque
	 * @param response
	 * @return 
	 * @return
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@RequestMapping(value = "/uploadIdcarda", method = { RequestMethod.POST,RequestMethod.GET})  
	@ResponseBody
    public JsonData IdcardB(HttpServletRequest request, HttpServletResponse response) throws IOException {  
		MultipartHttpServletRequest req =(MultipartHttpServletRequest)request;
		MultipartFile multipartFile =  req.getFile("uploadfile_ant3"); //对应前端页面的name值
		String path=request.getSession().getServletContext().getRealPath("/image/");
		String tel=request.getParameter("tel").toString().trim();
        String realname=request.getParameter("realname").toString().trim();
		File dir = new File(path);
		if (!dir.exists()) {
			 dir.mkdir();
			 }              
		//生成一个新的文件名fileName
		String n=realname+tel+"身份证正";
		String picName =n + "."+ "jpg";
		File file  =  new File(path,picName);
		multipartFile.transferTo(file); 
        Mobileregistry mobileregistry=new Mobileregistry();
        mobileregistry.setRealname(realname);
        mobileregistry.setTel(tel);
        mobileregistry.setIdcardb(path+picName);
		JsonData json=mobileregistryservice.updateIdcardA(mobileregistry);
        return json;
	        
    }  
	

}
