package com.zl.smbms.service.impl;

import com.zl.smbms.mapper.UserMapper;
import com.zl.smbms.pojo.Smbms_user;
import com.zl.smbms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/9/19.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Smbms_user userLogin(String userCode, String userPwd) {
        return userMapper.queryUser(userCode,userPwd);
    }

    @Override
    public Smbms_user getuserall(Integer id) {
        return userMapper.getuserall(id);
    }

    @Override
    public int updatauser(Smbms_user user) {
        return userMapper.updatauser(user);
    }

    @Override
    public int updatauserpwd(Smbms_user user) {
        return userMapper.updatauserpwd(user);
    }

    @Override
    public List<Smbms_user> getuserList(int isfrom, int pageSize) {
        return userMapper.getuserList((isfrom-1)*pageSize,pageSize);
    }

    @Override
    public int userlistsum() {
        return userMapper.userlistsum();
    }

    @Override
    public List<Smbms_user> getuserlistbyname(String username, int userrole, int isfrom, int pageSize) {
        return userMapper.getuserlistbyname(username,userrole,isfrom,pageSize);
    }

    @Override
    public int adduser(Smbms_user user) {
        return userMapper.adduser(user);
    }


}
