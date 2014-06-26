package microelectronic.main;

import microelectronic.entity.*;
import microelectronic.factory.MicroelectronicFactory;
import microelectronic.util.Comparator_Searcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;

//This project emulate process of creating microelements, and put them on the board
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {

        Board board = MicroelectronicFactory.createCompleteBoard(5, Device.Type.RESISTOR, Device.Type.TRANSISTOR, Device.Type.DIOD, Device.Type.CHIP);
        board.setName("FirstBoard");
        LOGGER.info("board was created: {}", board);

//        Board boardCopy = board.createCopy();
//        boardCopy.setName("SecondBoard");
//        boardCopy.getDevices().get(1).setPrice(555);
//        boardCopy.deleteElement(0);
//        LOGGER.info("board was copied: {}", boardCopy);
//
        Collections.sort(board.getDevices(), Device.PRICE_COMPARATOR);
//        LOGGER.info("sort of the board was performed: {}", board);
//
//        LOGGER.info("tottal sum of the board was calculaded: {}",board.totalSummElements());

//        SearchDevice searcher = new SearchDevice(board.getDevices());
//
//        LOGGER.info("Search is coplete {}", searcher.deviceSearch(Device.Type.CHIP, Device.ScMaterial.MANGANIN,1,100));
//        LOGGER.info("Search is coplete {}", searcher.deviceSearch(Device.ScMaterial.MANGANIN,1,100));
//        LOGGER.info("Search is coplete {}", searcher.deviceSearch(Device.Type.CHIP));


       // LOGGER.info("Search is coplete {}", SearchDevice.deviceSearch(board.getDevices(),Device.Type.CHIP, Device.ScMaterial.MANGANIN, 1, 100).toString());
        LOGGER.info("Search is coplete "+board.getDevices().get(0).getPrice()+" "+ board.getDevices().get(1).getPrice()+" {}", Device.PRICE_COMPARATOR.compare(board.getDevices().get(0),board.getDevices().get(1)));
        Collections.sort(board.getDevices(),Comparator_Searcher.COMPARATOR
        );
        LOGGER.info("Search is coplete {}", board);
    }
}
