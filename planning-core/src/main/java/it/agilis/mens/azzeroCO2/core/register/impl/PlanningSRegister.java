package it.agilis.mens.azzeroCO2.core.register.impl;

import it.agilis.mens.azzeroCO2.core.dao.IUserInfoDAO;
import it.agilis.mens.azzeroCO2.core.entity.UserInfo;
import it.agilis.mens.azzeroCO2.core.register.IPlaningSRegister;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * User: giovannilt
 * Date: 3/10/11
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */

public class PlanningSRegister implements IPlaningSRegister {

    @Autowired
    private IUserInfoDAO userInfoDAO;



    public void setUserInfoDAO(IUserInfoDAO userInfoDAO) {
        this.userInfoDAO = userInfoDAO;
    }



    @Override
    public UserInfo saveUserInfo(UserInfo userInfo) throws Exception {
        return userInfoDAO.save(userInfo);
    }

    @Override
    public UserInfo getUserInfo(String userInfo) throws Exception {
        return null;
    }

}
