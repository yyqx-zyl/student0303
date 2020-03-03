package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.StudentService;
import Service.impl.StudentServiceImpl;
import entity.Students;

@WebServlet("/index")
public class StudentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//×Ö·û¿ØÖÆ
		req.setCharacterEncoding("UTF-8");
		
		StudentService ss=new StudentServiceImpl();
		List<Students> list=new ArrayList<Students>();
				list=ss.ShowAll();
		req.setAttribute("list",list);
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
		
	}

	
	
}
