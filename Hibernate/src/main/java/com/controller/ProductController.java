package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.product;
import com.service.ProductService;

public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProductController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //doGet(request, response);
         PrintWriter pw = response.getWriter();
		 response.setContentType("text/html");
		 
		int pid = Integer.parseInt(request.getParameter("pid"));
	    String pname = request.getParameter("pname");
		String color = request.getParameter("color");
		 
		product p = new product();
		p.setPid(pid);
		p.setPname(pname);
		p.setColor(color);
		
      ProductService ps = new ProductService();
		
		String result = ps.storeProduct(p);
		
		pw.print(result);
		RequestDispatcher rd = request.getRequestDispatcher("StoreProduct.html");
		rd.include(request, response);	
	}

}
