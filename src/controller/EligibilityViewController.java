package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CDS;
import model.IAS;
import model.IBPS;

@WebServlet(urlPatterns = { "/eligible" })
public class EligibilityViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EligibilityViewController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String fatherName = request.getParameter("fname");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		String maritial = request.getParameter("status");
		String country = request.getParameter("country");
		String degree = request.getParameter("degree");
		int height = Integer.parseInt(request.getParameter("height"));
		int weight = Integer.parseInt(request.getParameter("weight"));
		int tooth = Integer.parseInt(request.getParameter("tooth"));
		String vision = request.getParameter("eye");
		String swim = request.getParameter("swim");
		String computer = request.getParameter("computer");
		int attempts = Integer.parseInt(request.getParameter("attempts"));
		String eligible;
		String choice = request.getParameter("exam");

		switch (choice) {
		case "CDS":
			CDS cds = new CDS(age, maritial, country, height, weight, tooth, vision, swim);
			boolean a = cds.baseEligibility();
			boolean b = cds.cdsEligible();

			if (a == true && b == true) {

				request.setAttribute("name", name);
				request.setAttribute("fatherName", fatherName);
				request.setAttribute("age", age);
				request.setAttribute("gender", gender);
				request.setAttribute("marital", maritial);
				request.setAttribute("country", country);
				request.setAttribute("choice", choice);
				eligible = "ELIGIBLE";
				request.setAttribute("eligible", eligible);
				RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/outputView.jsp");
				rd.forward(request, response);

			} else {

				request.setAttribute("name", name);
				request.setAttribute("fatherName", fatherName);
				request.setAttribute("age", age);
				request.setAttribute("gender", gender);
				request.setAttribute("marital", maritial);
				request.setAttribute("country", country);
				request.setAttribute("choice", choice);
				eligible = "NOT ELIGIBLE";
				request.setAttribute("eligible", eligible);
				RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/outputView.jsp");
				rd.forward(request, response);

			}

			break;

		case "IAS":
			IAS ias = new IAS(age, maritial, country, attempts);
			boolean c = ias.baseEligibility();
			boolean d = ias.iasEligible();

			if (c == true && d == true) {

				request.setAttribute("name", name);
				request.setAttribute("fatherName", fatherName);
				request.setAttribute("age", age);
				request.setAttribute("gender", gender);
				request.setAttribute("marital", maritial);
				request.setAttribute("country", country);
				request.setAttribute("choice", choice);
				eligible = "ELIGIBLE";
				request.setAttribute("eligible", eligible);
				RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/outputView.jsp");
				rd.forward(request, response);

			} else {

				request.setAttribute("name", name);
				request.setAttribute("fatherName", fatherName);
				request.setAttribute("age", age);
				request.setAttribute("gender", gender);
				request.setAttribute("marital", maritial);
				request.setAttribute("country", country);
				request.setAttribute("choice", choice);
				eligible = "NOT ELIGIBLE";
				request.setAttribute("eligible", eligible);
				RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/outputView.jsp");
				rd.forward(request, response);

			}

			break;

		case "IBPS Clerk":
			IBPS ibps = new IBPS(age, maritial, country, computer);
			boolean e = ibps.baseEligibility();
			boolean f = ibps.ibpsEligible();

			if (e == true && f == true) {

				request.setAttribute("name", name);
				request.setAttribute("fatherName", fatherName);
				request.setAttribute("age", age);
				request.setAttribute("gender", gender);
				request.setAttribute("marital", maritial);
				request.setAttribute("country", country);
				request.setAttribute("choice", choice);
				eligible = "ELIGIBLE";
				request.setAttribute("eligible", eligible);
				RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/outputView.jsp");
				rd.forward(request, response);

			} else {

				request.setAttribute("name", name);
				request.setAttribute("fatherName", fatherName);
				request.setAttribute("age", age);
				request.setAttribute("gender", gender);
				request.setAttribute("marital", maritial);
				request.setAttribute("country", country);
				request.setAttribute("choice", choice);
				eligible = "NOT ELIGIBLE";
				request.setAttribute("eligible", eligible);
				RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/outputView.jsp");
				rd.forward(request, response);

			}

			break;
		default:
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/outputView.jsp");
			rd.forward(request, response);

		}

	}

}
