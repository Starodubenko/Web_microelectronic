package star.servlet;

import microelectronic.entity.Board;
import microelectronic.entity.Device;
import microelectronic.factory.MicroelectronicFactory;
import microelectronic.util.SearchDevice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

public class MainWeb extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        PrintWriter writer=response.getWriter();

        Board board = MicroelectronicFactory.createCompleteBoard(5, Device.Type.RESISTOR, Device.Type.TRANSISTOR, Device.Type.DIOD, Device.Type.CHIP);
        board.setName("FirstBoard");

        writer.println("Element board was created");

        writer.println(board);
        Collections.sort(board.getDevices(), Device.PRICE_COMPARATOR);

        writer.println("Board was sorted by price");
        writer.println(board);


        writer.println("Found elements: ");
        writer.println(SearchDevice.deviceSearch(board.getDevices(),Device.Type.CHIP, Device.ScMaterial.GERMANIUM,10,100));
    }
}
