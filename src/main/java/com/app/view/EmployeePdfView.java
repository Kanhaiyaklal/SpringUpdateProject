package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Employee;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class EmployeePdfView  extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//response.addHeader("content-Disposition", "attachment;filename=Employees.pdf");//for download
		Paragraph p=new Paragraph("Welcome");
		document.add(p);
		List<Employee> emps=(List<Employee>) model.get("emps");
		PdfPTable t=new PdfPTable(6);
		t.addCell("Id");
		t.addCell("Gender");
		t.addCell("Country");
		t.addCell("Name");
		t.addCell("Address");
		t.addCell("Langs");
		
		for(Employee e:emps)
		{
			t.addCell(e.getEmpId().toString());
			t.addCell(e.getEmpGeneder());
			t.addCell(e.getEmpcntry());
			t.addCell(e.getEmpname());
			t.addCell(e.getEmpAddress());
			t.addCell(e.getEmpLangs().toString());
		}
		document.add(t);
		document.add(new Paragraph(new Date().toString()));
		
	}
}
