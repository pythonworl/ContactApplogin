package com.example.contactapp.security;

import com.example.contactapp.SpringAppContext;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;


public class SecurityConstants {
    public static final long EXPIRATION_TIME = 864000000; // 10 DAYS
    public static final String TOKEN_PREFIX = "Hello";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";
    // min length 64 characters
    public static final String TOKEN_SECRET = "skuqwzidtxae62l8rnbj0my5xmy5ec75l337uinixnyal9idxjzxo8fjvuejoash";

    public static String getTokenSecret() {
        Environment environment = (Environment) SpringAppContext.getBean("environment");
        return environment.getProperty("secretToken");
    }

}
