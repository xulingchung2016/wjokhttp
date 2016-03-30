/*
 * Copyright (C) 20015 MaiNaEr All rights reserved
 */
package com.mainaer.wjoklib.okhttp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 类/接口描述
 *
 * @author wangjian
 * @date 2016/3/30.
 */
public class LoggerUtil {

    static Logger mLogger = Logger.getLogger("okhttp");

    public static void i(String msg) {
        mLogger.log(Level.INFO, msg);
    }

    public static void w(String msg) {
        mLogger.log(Level.WARNING, msg);
    }

}
