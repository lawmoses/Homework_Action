package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CommandHandler;

public class DeleteFormAction implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		int num = Integer.parseInt(req.getParameter("num"));
		String pageNum = req.getParameter("pageNum");
		req.setAttribute("pageNum", pageNum);
		req.setAttribute("num", num);
		return "/view/deleteForm.jsp";
	}

}
