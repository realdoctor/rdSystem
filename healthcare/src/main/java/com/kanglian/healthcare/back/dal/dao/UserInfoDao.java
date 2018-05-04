package com.kanglian.healthcare.back.dal.dao;

import com.easyway.business.framework.dao.CrudDao;
import com.kanglian.healthcare.back.dal.pojo.User;
import com.kanglian.healthcare.back.dal.pojo.UserInfo;

public interface UserInfoDao extends CrudDao<UserInfo> {

    /**
     * 用户基本信息
     * 
     * @param user
     * @return
     */
    public UserInfo getUserInfo(User user);
}