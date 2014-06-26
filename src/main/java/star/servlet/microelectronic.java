package star.servlet;

import microelectronic.entity.Board;
import microelectronic.entity.Device;
import microelectronic.factory.MicroelectronicFactory;
import microelectronic.util.SearchDevice;

import java.io.IOException;
import java.util.Collections;

/**
 * Created by Rody on 25.06.2014.
 */
public class microelectronic extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Board board = MicroelectronicFactory.createCompleteBoard(5, Device.Type.RESISTOR, Device.Type.TRANSISTOR, Device.Type.DIOD, Device.Type.CHIP);
        board.setName("FirstBoard");

        Collections.sort(board.getDevices(), Device.PRICE_COMPARATOR);


        SearchDevice.deviceSearch(board.getDevices(),Device.Type.CHIP, Device.ScMaterial.GERMANIUM,10,100);
    }
}
