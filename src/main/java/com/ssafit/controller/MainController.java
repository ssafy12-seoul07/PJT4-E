package com.ssafit.controller;

import com.ssafit.dto.*;
import com.ssafit.dao.Reviewdaoimpl;
import com.ssafit.dao.Videodaoimpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Service
 */

@WebServlet("/main")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int count = 1;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String action = req.getParameter("action");
		Videodaoimpl videos = new Videodaoimpl();
		Reviewdaoimpl reviews = new Reviewdaoimpl();
		
		switch (action) {
			case "videolist": {
				req.setAttribute("list", videos.getAllVideos());
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/videolist.jsp");
				dispatcher.forward(req, res);
				break;
			}
			case "reviewlist": {
				String id = req.getParameter("id");
				req.setAttribute("reviewlist", reviews.getReviewsByVideoId(id));
				req.setAttribute("video", videos.findById(id));
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/reviewlist.jsp");
				dispatcher.forward(req, res);
				break;
			}
			case "new": {
				String videoId = req.getParameter("videoId");
				String userId = req.getParameter("userId");
				String content = req.getParameter("content");
				Review review = new Review(count++, videoId, userId, content);
				reviews.addReview(review);
				req.setAttribute("reviewlist", reviews.getReviewsByVideoId(videoId));
				req.setAttribute("video", videos.findById(videoId));
				RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/reviewlist.jsp");
				dispatcher.forward(req, res);
				break;
			}
			case "delete": {
				int id = Integer.parseInt(req.getParameter("id"));
				String videoId = req.getParameter("videoId");
                reviews.deleteReview(id);
                req.setAttribute("reviewlist", reviews.getReviewsByVideoId(videoId));
                req.setAttribute("video", videos.findById(videoId));
                RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/reviewlist.jsp");
                dispatcher.forward(req, res);
				break;
			}
			case "toupdateform": {
				int id =  Integer.parseInt(req.getParameter("id"));
				Review review = reviews.findReviewById(id);
                req.setAttribute("review", review);
                RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/updateform.jsp");
                dispatcher.forward(req, res);
				break;
			}
			case "update": {
				int id = Integer.parseInt(req.getParameter("id"));
				String videoId = req.getParameter("videoId");
				String content = req.getParameter("content");
                String userId = req.getParameter("userId");
                Review review = new Review(id, videoId, content, userId);
                reviews.updateReview(review);
                req.setAttribute("reviewlist", reviews.getReviewsByVideoId(videoId));
                req.setAttribute("video", videos.findById(videoId));
                RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/reviewlist.jsp");
                dispatcher.forward(req, res);
				break;
			}
			
		}
		
		
	}
}
