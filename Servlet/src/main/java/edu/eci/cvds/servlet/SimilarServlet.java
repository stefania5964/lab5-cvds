package edu.eci.cvds.servlet;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.MalformedParametersException;
import java.net.MalformedURLException;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import edu.eci.cvds.servlet.model.Todo;
public class SimilarServlet extends HttpServlet{
    static final long serialVersionUID = 35L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer responseWriter = resp.getWriter();
        Optional<String> optName = Optional.ofNullable(req.getParameter("name"));
        String name = optName.isPresent() && !optName.get().isEmpty() ? optName.get() : "";

        resp.setStatus(HttpServletResponse.SC_OK);
        responseWriter.write("Hello" + name + "!");
        responseWriter.flush();
    }
}
