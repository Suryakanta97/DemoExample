package com.surya.patterns.intercepting.filter.commands;

import com.surya.patterns.intercepting.filter.data.Bookshelf;

import javax.servlet.ServletException;
import java.io.IOException;

public class HomeCommand extends FrontCommand {
    @Override
    public void process() throws ServletException, IOException {
        super.process();
        Bookshelf bookshelf = (Bookshelf) request.getServletContext()
          .getAttribute("bookshelf");
        request.setAttribute("books", bookshelf);
        forward("home");
    }
}
