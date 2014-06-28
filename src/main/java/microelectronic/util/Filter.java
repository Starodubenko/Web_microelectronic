package microelectronic.util;

import microelectronic.entity.Device;

public interface Filter {

    boolean compareDevice(Device device);
}
