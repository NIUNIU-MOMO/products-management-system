package com.lfy.management.service;

import com.lfy.management.exception.MsgException;
import com.lfy.management.mapper.LoginAndQuitMapper;
import com.lfy.management.pojo.SystemUser;
import com.lfy.management.utils.SecretkeyFileVerify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class LoginAndQuitService {

    @Autowired(required = false)
    private LoginAndQuitMapper loginAndQuitMapper;

    public SystemUser login(String name, String password) throws Exception {
        SystemUser user = null;
        if (SecretkeyFileVerify.checkSecretkeyFile()) {
            user = loginAndQuitMapper.selectUserByNameAndPassword(name, password);
        }
        return user;
    }
}
