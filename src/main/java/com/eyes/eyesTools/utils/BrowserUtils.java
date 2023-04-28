package com.eyes.eyesTools.utils;

import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.UserAgent;

import javax.servlet.http.HttpServletRequest;

/**
 * 浏览器工具类
 * @author eyes
 */
public class BrowserUtils {

    private BrowserUtils() {
        throw new UnsupportedOperationException("It is not recommended to instantiate this class. It is recommended to use static method calls");
    }

    /**
     * 获取浏览器名称及版本
     * @param request HttpServletRequest
     * @return String
     */
    public static String browserName(HttpServletRequest request){
        String userAgent = request.getHeader("User-Agent");
        UserAgent ua = UserAgent.parseUserAgentString(userAgent);
        Browser browser = ua.getBrowser();
        return browser.getName() + "-" + browser.getVersion(userAgent);
    }
}