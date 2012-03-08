package it.agilis.mens.plannings.core.register.impl;

import it.agilis.mens.plannings.core.dao.IUserInfoDAO;
import it.agilis.mens.plannings.core.entity.UserInfo;
import it.agilis.mens.plannings.core.register.IPlaningSRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: giovannilt
 * Date: 3/10/11
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */

@Transactional(readOnly= true)
public class PlanningSRegister implements IPlaningSRegister {

    @Autowired
    @Qualifier("userInfoDAO")
    private IUserInfoDAO userInfoDAO;


    public void setUserInfoDAO(IUserInfoDAO userInfoDAO) {
        this.userInfoDAO = userInfoDAO;
    }



    @Override
    @Transactional(readOnly = false)
    public UserInfo saveUserInfo(UserInfo userInfo) throws Exception {
        return userInfoDAO.save(userInfo);
    }

    @Override
    public UserInfo getUserInfo(String userInfo) throws Exception {
        return null;
    }

}
