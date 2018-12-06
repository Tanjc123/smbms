package com.zl.smbms.service;

import com.zl.smbms.pojo.Smbms_user;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/9/19.
 */

public interface UserService {
    //用户登录
    Smbms_user userLogin(String userCode, String userPwd);
    //修改填充
    Smbms_user getuserall(@Param("id") Integer id);
    //用户信息修改
    int updatauser(Smbms_user user);
    //当前用户密码修改
    int updatauserpwd(Smbms_user user);
    //用户管理数据
    List<Smbms_user> getuserList(int isfrom, int pageSize);
    //用户数据总条数
    int userlistsum();
    List<Smbms_user> getuserlistbyname(@Param("username")String username,
                                       @Param("userrole")int userrole,
                                       @Param("isfrom")int isfrom,
                                       @Param("pageSize")int pageSize);
    //添加用户
    int adduser(Smbms_user user);
}
