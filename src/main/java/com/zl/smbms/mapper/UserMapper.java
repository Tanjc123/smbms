package com.zl.smbms.mapper;

import com.zl.smbms.pojo.Smbms_user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/9/19.
 */
public interface UserMapper {
    //用户登陆
    Smbms_user queryUser(@Param("userCode") String userCode,@Param("userPwd") String userPwd);
    //用户修改填充信息
    Smbms_user getuserall(@Param("id") Integer id);
    //用户修改
    int updatauser(Smbms_user user);
    //当前用户密码修改
    int updatauserpwd(Smbms_user user);
    //用户管理数据(分页)
    List<Smbms_user> getuserList(@Param("isfrom")int isfrom,@Param("pageSize")int pageSize);
    //用户数据总条数
    int userlistsum();
    //用户查询（模糊）
    List<Smbms_user> getuserlistbyname(@Param("username")String username,
                                       @Param("userrole")int userrole,
                                       @Param("isfrom")int isfrom,
                                       @Param("pageSize")int pageSize);
    //添加用户
    int adduser(Smbms_user user);
}
