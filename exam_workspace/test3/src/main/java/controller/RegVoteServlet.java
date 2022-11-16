package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Candidate;
import model.Dao;
import model.VoterReg;
import model.Votes;

@WebServlet("/reg-vote")
public class RegVoteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/views/reg_vote.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//form 데이터
		request.setCharacterEncoding("UTF-8");
		String v_jumin = request.getParameter("v_jumin");
		String v_name = request.getParameter("v_name");
		String n_no = request.getParameter("n_no");
		String v_area = request.getParameter("v_area");
		String v_time = request.getParameter("v_time");
		String v_confirm = request.getParameter("v_confirm");
		Dao dao = new Dao();
		dao.insertVoter(new VoterReg(v_jumin, v_name, n_no, v_area, v_time, v_confirm));
		
		response.sendRedirect("/test3/voter");
		
	}
}
