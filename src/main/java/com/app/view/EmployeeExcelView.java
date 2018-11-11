package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.Employee;

public class EmployeeExcelView extends AbstractXlsxView
{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest reuest,
			HttpServletResponse response) throws Exception {
		
		//response.addHeader("Content-Disposition", "attachement;filename=Employees.xlsx");
		
		//Create sheet With name
		
		Sheet sheet=workbook.createSheet("emp");
		
		//create head
		setHead(sheet);
	     List<Employee> emps=(List<Employee>)model.get("emps");
		
	     //setbody
	     setbody(sheet,emps);
	}

     private void setHead(Sheet sheet) 
     {
    	Row row  =sheet.createRow(0);
    	row.createCell(0).setCellValue("Id");
       	row.createCell(1).setCellValue("Name");
       	row.createCell(2).setCellValue("Gender");
       	row.createCell(3).setCellValue("Address");
       	row.createCell(4).setCellValue("Country");
       	row.createCell(5).setCellValue("Language");
    	 
     }
   private void setbody(Sheet sheet , List<Employee> emps)
   {
	  int rowNum=1;
	 for (Employee e : emps) {
		
		Row row =sheet.createRow(rowNum++);
		row.createCell(0).setCellValue(e.getEmpId().toString());
		row.createCell(1).setCellValue(e.getEmpname());
		row.createCell(2).setCellValue(e.getEmpGeneder());
		row.createCell(3).setCellValue(e.getEmpAddress());
		row.createCell(4).setCellValue(e.getEmpcntry());
		row.createCell(5).setCellValue(e.getEmpLangs().toString());
		  
	  }   
   }
}

