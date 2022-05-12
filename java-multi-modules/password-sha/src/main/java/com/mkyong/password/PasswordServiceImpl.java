package com.mkyong.password;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;
import com.mkyong.password.*;

@Service
public class PasswordServiceImpl implements PasswordService {

    @Override
    public String hash(String input) {
        return DigestUtils.sha256Hex(input);
    }

    @Override
    public String algorithm() {
    	com.mkyong.password.PasswordServiceImpl c = new com.mkyong.password.PasswordServiceImpl();
    	c.algorithm();
        return "sha256";
    }

}