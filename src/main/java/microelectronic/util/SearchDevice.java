package microelectronic.util;

import microelectronic.entity.Device;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SearchDevice {

    private static List<Device> OA = new ArrayList<>();


//    public SearchDevice(List<Device> finishedArray) {
//        this.originArray = finishedArray;
//    }
//
//    public SearchDevice() {
//    }
//
//    public List<Device> deviceSearch(Device.Type type){
//
//        List<Device> finishedArray = new ArrayList<>();
//        for (Device device : originArray) {
//            String firstType = device.getClass().getSimpleName().toUpperCase();
//            if (firstType.equals(type.toString())) {
//                finishedArray.add(device);
//            }
//        }
//        return finishedArray;
//    }
//
//    public List<Device> deviceSearch(Device.ScMaterial scMaterial){
//
//        List<Device> finishedArray = new ArrayList<>();
//        for (Device device : originArray) {
//            Device.ScMaterial firstScMaterial = device.getSemiconductorMaterial();
//            if (firstScMaterial == scMaterial) {
//                finishedArray.add(device);
//            }
//        }
//        return finishedArray;
//    }
//
//    public List<Device> deviceSearch(int startPrice, int finishPrice){
//
//        List<Device> finishedArray = new ArrayList<>();
//        for (Device device : originArray) {
//            String firstType = device.getClass().getSimpleName().toUpperCase();
//            Device.ScMaterial firstScMaterial = device.getSemiconductorMaterial();
//            if (device.getPrice().compareTo(BigDecimal.valueOf(startPrice)) >0 &&
//                    device.getPrice().compareTo(BigDecimal.valueOf(finishPrice)) <0) {
//                finishedArray.add(device);
//            }
//        }
//        return finishedArray;
//    }
//
//    public List<Device> deviceSearch(Device.Type type,Device.ScMaterial scMaterial){
//
//        List<Device> finishedArray = new ArrayList<>();
//        for (Device device : originArray) {
//            String firstType = device.getClass().getSimpleName().toUpperCase();
//            Device.ScMaterial firstScMaterial = device.getSemiconductorMaterial();
//            if (firstType.equals(type.toString()) && firstScMaterial == scMaterial){
//                finishedArray.add(device);
//            }
//        }
//        return finishedArray;
//    }
//
//    public List<Device> deviceSearch(Device.Type type, int startPrice, int finishPrice){
//
//        List<Device> finishedArray = new ArrayList<>();
//        for (Device device : originArray) {
//            String firstType = device.getClass().getSimpleName().toUpperCase();
//            if (firstType.equals(type.toString()) &&
//                    device.getPrice().compareTo(BigDecimal.valueOf(startPrice)) >0 &&
//                    device.getPrice().compareTo(BigDecimal.valueOf(finishPrice)) <0) {
//                finishedArray.add(device);
//            }
//        }
//        return finishedArray;
//    }
//
//    public List<Device> deviceSearch(Device.ScMaterial scMaterial, int startPrice, int finishPrice){
//
//        List<Device> finishedArray = new ArrayList<>();
//        for (Device device : originArray) {
//            Device.ScMaterial firstScMaterial = device.getSemiconductorMaterial();
//            if (firstScMaterial == scMaterial &&
//                    device.getPrice().compareTo(BigDecimal.valueOf(startPrice)) >0 &&
//                    device.getPrice().compareTo(BigDecimal.valueOf(finishPrice)) <0) {
//                finishedArray.add(device);
//            }
//        }
//        return finishedArray;
//    }

    public static List<Device> deviceSearch(List<Device> originArray,Device.Type type,Device.ScMaterial scMaterial, int startPrice, int finishPrice){

        List<Device> finishedArray = new ArrayList<>();
        for (Device device : originArray) {
            String firstType = device.getClass().getSimpleName().toUpperCase();
            Device.ScMaterial firstScMaterial = device.getSemiconductorMaterial();
            if (firstType.equals(type.toString()) &&
                    firstScMaterial == scMaterial &&
                    device.getPrice().compareTo(BigDecimal.valueOf(startPrice)) >0 &&
                    device.getPrice().compareTo(BigDecimal.valueOf(finishPrice)) <0) {
                finishedArray.add(device);
            }
        }
        OA = finishedArray;
        return finishedArray;
    }

    @Override
    public String toString() {
        String elements = "";
        for (Device s : OA) {
            elements = elements + s.toString() + "\n";
        }
        return "SearchDevice{" +
                "originArray=" + elements +

                '}';
    }
}
