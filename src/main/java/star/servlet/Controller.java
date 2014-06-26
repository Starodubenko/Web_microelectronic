package star.servlet;

import microelectronic.entity.Board;
import microelectronic.entity.Device;
import microelectronic.factory.MicroelectronicFactory;
import microelectronic.util.SearchDevice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

public class Controller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setAttribute("Board", MicroelectronicFactory.createCompleteBoard(5, Device.Type.CHIP, Device.Type.DIOD, Device.Type.TRANSISTOR, Device.Type.RESISTOR));
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
