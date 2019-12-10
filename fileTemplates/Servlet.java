#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
/**
 * Class:${NAME}Servlet
 * Author: Eyes
 * Create Date:${DATE} ${TIME}
 * Last Modify Date:${DATE} ${TIME}
 * Last Modify Author: 
 * Last Modify：
 */
#parse("File Header.java")
@WebServlet("/${NAME}")
public class ${NAME}Servlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        //ToDO Something
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
         //ToDO Something
    }
}