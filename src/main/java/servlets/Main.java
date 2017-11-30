package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

/* Объявляем класс наследующийся от HttpServlet и переопределяющий два его метода
doGet(HttpServletRequest req, HttpServletResponse resp) и
doPost(HttpServletRequest req, HttpServletResponse resp)
 */
public class Main extends HttpServlet {

    /**
     * Метод загружающий страницу myPage.jsp,
     * метод срабатывает при запросе типа GET
     *
     * @param req объект-запрос
     * @param resp объект-ответ
     * @throws ServletException исключение типа ServletException
     * @throws IOException исключение типа IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Загрузка страницы myPage.jsp
        req.getRequestDispatcher("myPage.jsp").forward(req, resp);
    }

    /**
     * Метод считающий произведение введенных чисел
     * и выводящий результат на экран
     * метод срабатывает при запросе на урл /
     * тип запроса POST
     *
     * @param req объект-запрос
     * @param resp объект-ответ
     * @throws ServletException исключение типа ServletException
     * @throws IOException исключение типа IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        /* Получаем строковое значение параметра number_first из объекта запроса req
        при этом заменяем симов , на .
         */
        String firstNumberText = req.getParameter("number_first").replace(",", ".");
        // Создаем объект класса BigDecimal со значением полученного параметра
        BigDecimal firstNumber = new BigDecimal(firstNumberText);

        /* Получаем строковое значение параметра number_second из объекта запроса req
        при этом заменяем симов , на .
         */
        String secondNumberText = req.getParameter("number_second").replace(",", ".");
        // Создаем объект класса BigDecimal со значением полученного параметра
        BigDecimal secondNumber = new BigDecimal(secondNumberText);

        // Создаем объект класса BigDecimal, ранвый результату умножения первого числа на второе
        BigDecimal result = firstNumber.multiply(secondNumber);

        // Кладем в объект-запрос атрибут и присваиваем атрбуту значение
        req.setAttribute("number_first", req.getParameter("number_first"));
        // Кладем в объект-запрос атрибут и присваиваем атрбуту значение
        req.setAttribute("number_second", req.getParameter("number_second"));
        // Кладем в объект-запрос атрибут результата и присваиваем атрбуту значение при этом заменяем у значения . на ,
        req.setAttribute("result", result.toString().replace(".", ","));

        // Загрузка страницы myPage.jsp
        req.getRequestDispatcher("myPage.jsp").forward(req, resp);
    }

}
