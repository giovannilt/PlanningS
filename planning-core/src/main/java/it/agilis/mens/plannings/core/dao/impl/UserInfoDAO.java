package it.agilis.mens.plannings.core.dao.impl;

import it.agilis.mens.plannings.core.criteria.UserInfoCriteria;
import it.agilis.mens.plannings.core.dao.DAOSupport;
import it.agilis.mens.plannings.core.dao.IUserInfoDAO;
import it.agilis.mens.plannings.core.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: giovannilt
 * Date: 3/10/11
 * Time: 10:06 PM
 * To change this template use File | Settings | File Templates.
 */


@Repository
public class UserInfoDAO extends DAOSupport implements IUserInfoDAO {
    @Override
    public UserInfo save(UserInfo userInfo) throws Exception {
        return (UserInfo) saveObject(userInfo);
    }

    @Override
    public UserInfo findUserInfo(String userName) {
        UserInfoCriteria userCriteria = new UserInfoCriteria();
        userCriteria.setUsername(userName);

        List<UserInfo> userInfoList = (List<UserInfo>) getList(userCriteria.getDetachedCriteria(), true);
        if (userInfoList.size() > 0) {
            return userInfoList.get(0);
        }

        return null;
    }
}
