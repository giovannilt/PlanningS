package it.agilis.mens.plannings.core.register;

import it.agilis.mens.plannings.core.entity.UserInfo;

/**
 * Created by IntelliJ IDEA.
 * User: giovannilt
 * Date: 3/11/11
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IPlaningSRegister {


    UserInfo saveUserInfo(UserInfo userInfo) throws Exception;



    UserInfo getUserInfo(String userInfo) throws Exception;




}

