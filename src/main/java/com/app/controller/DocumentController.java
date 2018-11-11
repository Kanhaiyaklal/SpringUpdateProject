package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.iservice.IDocumentService;
import com.app.model.Document;

@Controller
@RequestMapping("/document")
public class DocumentController {
	@Autowired
	private IDocumentService service;
	@RequestMapping("/show")
	
	public String showDocument(ModelMap map)
	{
        map.addAttribute("document", new Document());
		return "Document";
	}

	@RequestMapping(value="uplaod", method=RequestMethod.POST)
	public String uploadDoc(@RequestParam CommonsMultipartFile file ,ModelMap map)
	{
		
		if(file!=null) {
			
			Document doc=new Document();
			
			doc.setFileName(file.getOriginalFilename());
			doc.setFileData(file.getBytes());
			int fileId=service.saveDocument(doc);
			map.addAttribute("message", "File Uploaded ' "+fileId+"' SuccessFull");
			
			
			List<Object[]> obj=service.getDocumentIdAndName();
			map.addAttribute("docs",obj);
		}			
		return "Document";
	}

	@RequestMapping("/download")
	public void downloadDoc(@RequestParam("docId")int docId,HttpServletResponse response)
	{
		
		Document doc=service.getDocumentById(docId);
		response.addHeader("Content-Disposition", "attachment;filename="+doc.getFileName());
	  try
	  {
		  FileCopyUtils.copy(doc.getFileData(), response.getOutputStream());
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	}
}
