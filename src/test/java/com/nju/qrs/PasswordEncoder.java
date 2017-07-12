package com.nju.qrs;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by qingrongshan on 17/5/25.
 */
public class PasswordEncoder {

    public static void main(String[] args) {
        String password = "123";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode(password));
    }
}
