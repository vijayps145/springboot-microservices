package net.javaguides.springboot.config;

import java.util.List;

public class Utils {

    public static boolean isValidIPAddress(String ipAddress) {
        List<String> blackListIPs = List.of("192.168.1.2", "192.168.1.3", "192.168.1.4", "192.168.1.5");
        if (blackListIPs.contains(ipAddress)) {
            return true;
        }
        return false;

    }


}
