package com.imqsl.util.common;

import java.util.UUID;

/**
 * Created by imqsl on 2017/9/14.
 */
public class UUid {
    public static String getUUid() {
        String id = UUID.randomUUID().toString();
        id = id.replaceAll("\\-", "");
        return id;
    }
}
