package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("myPage.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String firstNumberText = req.getParameter("number_first").replace(",", ".");
        BigDecimal firstNumber = new BigDecimal(firstNumberText);

        String secondNumberText = req.getParameter("number_second").replace(",", ".");
        BigDecimal secondNumber = new BigDecimal(secondNumberText);

        BigDecimal result = firstNumber.multiply(secondNumber);

        req.setAttribute("number_first", req.getParameter("number_first"));
        req.setAttribute("number_second", req.getParameter("number_second"));
        req.setAttribute("result", result.toString().replace(".", ","));

        req.getRequestDispatcher("myPage.jsp").forward(req, resp);
    }

    public static void main(String[] args) {
        BigDecimal firstNumber = new BigDecimal("8");
        BigDecimal secondNumber = new BigDecimal("9");
        BigDecimal result = firstNumber.multiply(secondNumber);
        System.out.println(result);

    }

}
