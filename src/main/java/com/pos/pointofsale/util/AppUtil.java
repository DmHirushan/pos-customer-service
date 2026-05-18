package com.pos.pointofsale.util;

import java.util.UUID;

public class AppUtil {
    public static String generateCustomerCode(long id){
        return String.format("CUS-%04d", id);
    }
}
