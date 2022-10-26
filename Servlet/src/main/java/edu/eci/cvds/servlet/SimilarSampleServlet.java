package edu.eci.cvds.servlet;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.eci.cvds.servlet.model.*;
import java.net.MalformedURLException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
@WebServlet(
        urlPatterns = "/SimilarSampleServlet"
)

public class SimilarSampleServlet extends HttpServlet{
    static final long serialVersionUID = 35L;
    private String message;

    /**
     * muestra html usando la clase service si equivale a ok de lo contrario manda excepcion
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer responseWriter = resp.getWriter();
        Optional<String> optName = Optional.ofNullable(req.getParameter("id"));
        try {
            Integer id = optName.isPresent() && !optName.get().isEmpty() ? Integer.parseInt(optName.get()) : null;
            Todo list = Service.getTodo(id);
            List<Todo> todoList = new ArrayList<Todo>();
            resp.setStatus(HttpServletResponse.SC_OK);
            todoList.add(list);
            responseWriter.write(Service.todosToHTMLTable(todoList));

        } catch (NumberFormatException | NullPointerException  e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } catch (FileNotFoundException e) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        } catch (MalformedURLException e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer responseWriter = resp.getWriter();
        Optional<String> optName = Optional.ofNullable(req.getParameter("id"));
        try {
            Integer id = optName.isPresent() && !optName.get().isEmpty() ? Integer.parseInt(optName.get()) : null;
            Todo list = Service.getTodo(id);
            List<Todo> todoList = new ArrayList<Todo>();
            resp.setStatus(HttpServletResponse.SC_OK);
            todoList.add(list);
            responseWriter.write(Service.todosToHTMLTable(todoList));
        } catch (NumberFormatException | NullPointerException  e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } catch (FileNotFoundException e) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        } catch (MalformedURLException e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}
