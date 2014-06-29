package star.servlet;

import microelectronic.entity.Board;
import microelectronic.entity.Device;
import microelectronic.factory.MicroelectronicFactory;
import microelectronic.util.Filter;
import microelectronic.util.SearchDevice;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;


public class Controller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        Board board = MicroelectronicFactory.createCompleteBoard(5, Device.Type.CHIP, Device.Type.DIOD, Device.Type.TRANSISTOR, Device.Type.RESISTOR);
//
//        request.setAttribute("Board", board);
//
//        int aaa = 50;
//
//        request.setAttribute("Filtered_devices", SearchDevice.filterDevices(board.getDevices(), new Filter() {
//            @Override
//            public boolean compareDevice(Device device) {
//                return device.getPrice().compareTo(BigDecimal.valueOf(aaa)) > 0;
//            }
//        }));
        request.setAttribute("board", board.getDevices());
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }
}
