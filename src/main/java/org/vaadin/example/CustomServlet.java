package org.vaadin.example;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletResponse;

import com.vaadin.flow.server.VaadinServlet;

@WebServlet(urlPatterns = {"/*"})
public class CustomServlet extends VaadinServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        setAccessControlHeaders((HttpServletResponse) res);
        super.service(req, res);
    }

    private void setAccessControlHeaders(HttpServletResponse resp) {
        resp.setHeader("Access-Control-Allow-Origin", "http://localhost:3000");
        resp.setHeader("Access-Control-Allow-Methods", "*");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, X-DevModePoll");
        resp.setHeader("Access-Control-Allow-Credentials", "true");
    }
}
