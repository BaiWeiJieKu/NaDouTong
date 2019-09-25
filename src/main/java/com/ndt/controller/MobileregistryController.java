package com.ndt.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ndt.entity.Driverinfo;
import com.ndt.entity.Mobileregistry;
import com.ndt.entity.Sendermanagementinfo;
import com.ndt.service.Mobileregistryservice;
import com.ndt.util.JsonData;
@Controller
public class MobileregistryController {
		@Autowired
		private Mobileregistryservice mobileregistryservice;
		
		@RequestMapping("/insertLogin.json")
		@ResponseBody
		public JsonData insertLogin(Mobileregistry mobileregistry){
			JsonData json=mobileregistryservice.insertLogin(mobileregistry);
			return json;
		}
	
		
		@RequestMapping("/selectYun.json")
		@ResponseBody
		public JsonData SelectYun(Mobileregistry mobileregistry){
			JsonData json=mobileregistryservice.selectYun(mobileregistry);
			return json;
		}
		
		@RequestMapping("/selectDing.json")
		@ResponseBody
		public JsonData SelectDing(Mobileregistry mobileregistry){
			JsonData json=mobileregistryservice.selectDing();
			return json;
		}
		
		@RequestMapping("/insertPoints.json")
		@ResponseBody
		public JsonData insertPoints(String bTime,String eTime,Sendermanagementinfo sendermanagementinfo){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			System.out.println(bTime);
			try {
				sendermanagementinfo.setBtime(sdf.parse(bTime));
				sendermanagementinfo.setEtime(sdf.parse(eTime));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return mobileregistryservice.insertPoints(sendermanagementinfo);
		}
		
		
		@RequestMapping("/selectState.json")
		@ResponseBody
		public JsonData selectState(Mobileregistry mobileregistry){
			return mobileregistryservice.selectState(mobileregistry);
		}
		
		
		@RequestMapping("/updateDriver.json")
		@ResponseBody
		public JsonData updateDriver(Driverinfo driver){
			return mobileregistryservice.updateDiver(driver);
		}
		
		@RequestMapping("/selectRen.json")
		@ResponseBody
		public JsonData selectRan(Mobileregistry mobileregistry){
			return mobileregistryservice.selectRen(mobileregistry);
		}
		
		/**
		 *人车图片上传
		 * @param reque
		 * @param response
		 * @return 
		 * @return
		 * @throws IOException 
		 * @throws IllegalStateException 
		 */
		@RequestMapping(value = "/uploadPcPhoto", method = { RequestMethod.POST,RequestMethod.GET})  
		@ResponseBody
	    public JsonData IdcardB(HttpServletRequest request, HttpServletResponse response) throws IOException {  
			MultipartHttpServletRequest req =(MultipartHttpServletRequest)request;
			MultipartFile multipartFile =  req.getFile("uploadfile_ant1"); //对应前端页面的name值
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			String path=request.getSession().getServletContext().getRealPath("/image/");
			String tel=request.getParameter("tel").toString().trim();
	        String realname=request.getParameter("realname").toString().trim();
	        realname=URLDecoder.decode(realname, "UTF-8");//解码
			File dir = new File(path);
			if (!dir.exists()) {
				 dir.mkdir();
			}              
			//生成一个新的文件名fileName
			String n=realname+tel+"人车照";
			String picName =n + "."+ "jpg";
			File file  =  new File(path,picName);
			multipartFile.transferTo(file); 
	        Mobileregistry mobileregistry=new Mobileregistry();
	        mobileregistry.setRealname(realname);
	        mobileregistry.setTel(tel);
	        mobileregistry.setPcphoto("/image/"+picName);
	        JsonData json=mobileregistryservice.updatePCphoto(mobileregistry);
	        return json;
	    }  
		
		@RequestMapping("/api/wechatInformation")
		@ResponseBody
		public JsonData selectMo(Integer page){
			return mobileregistryservice.updateMo(page);
			
		}
		
		@RequestMapping("/selectid.json")
		@ResponseBody
		public JsonData selectid(Mobileregistry mobileregistry){
			return mobileregistryservice.selectid(mobileregistry);
			
		}
		
		@RequestMapping("/selectdirid.json")
		@ResponseBody
		public JsonData selectdirid(Mobileregistry mobileregistry){
			return mobileregistryservice.selectDirid(mobileregistry);
		}
	
		

}
