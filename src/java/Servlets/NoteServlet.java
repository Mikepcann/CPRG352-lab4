package Servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet {
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to read files
        
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String title, contents;
        title =br.readLine();
        contents =br.readLine();
        // create note obj from the file
        Note note = new Note(title,contents);
        // print out the contents of the note
        System.out.println(title + " " + contents);
    
        
       
       
        // set an attribute on the file
        request.setAttribute("note", note);
        
        if(request.getParameter("edit") == null){
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        } else if(request.getParameter("edit") != null){
             getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
             
        }
             
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ttl = request.getParameter("title");
        String con = request.getParameter("contents");
        
        Note note = new Note(ttl, con);
        
        request.setAttribute("note", note);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;

    }

}
