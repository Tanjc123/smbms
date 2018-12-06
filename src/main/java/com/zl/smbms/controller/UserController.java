package com.zl.smbms.controller;

import com.zl.smbms.pojo.Page;
import com.zl.smbms.pojo.Smbms_user;
import com.zl.smbms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2018/9/19.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    private Integer id;

    @RequestMapping(value = "/")
    public String main() {
        return "userLogin";
    }

    /**
     * 用户登陆
     * @param userCode
     * @param userPwd
     * @param session
     * @return
     */
    @RequestMapping(value = "login")
    public String login(@RequestParam("userCode") String userCode,@RequestParam("userPwd")  String userPwd, HttpSession session) {
        Smbms_user user = userService.userLogin(userCode,userPwd);
        session.setAttribute("SESSION_USER",user);
        this.id=user.getId();
        return "main";
    }



    /**
     * 密码修改（页面跳转）
     * @return
     */
    @RequestMapping("updatepwd")
    public String updatepwd(){
        return "user/updatepwd";
    }

    /**
     * 密码修改提交
     * @param rnewpassword
     * @param models
     * @return
     */
    @RequestMapping("updateuserpwd")
    public String updateuserpwd(
            @RequestParam("rnewpassword")String rnewpassword, Model models){
        Smbms_user userid=new Smbms_user();
        userid.setId(this.id);
        userid.setUserpassword(rnewpassword);
        int arr=userService.updatauserpwd(userid);

        if (arr==1){
            return "main";
        }else {
            return "updatepwd";
        }

    }

    /**
     * 用户管理页面跳转（分页数据携带）
     * @param isfrom
     * @param model
     * @return
     */
    @RequestMapping("userhomelist")
    public String userhomelist(@RequestParam(value = "isfrom",defaultValue = "1",required = true) int isfrom ,Model model){
        Page page=new Page();
        if (isfrom<=0){
            isfrom=page.getCurrPageNo();
        }else {
            page.setCurrPageNo(isfrom);
        }
        int sum=userService.userlistsum();
        page.setTotalCount(sum);
        List<Smbms_user> userList=userService.getuserList(isfrom,page.getPageSize());
        page.setTuserList(userList);
        model.addAttribute("page",page);

        return "user/userhome";
    }
    /**
     * 用户修改（跳转页面携带数据）
     * @param model
     * @return
     */
    @RequestMapping("userUpdate")
    public String userUpdate( Model model,@RequestParam("id") int id) {
        Smbms_user getuser = userService.getuserall(id);
        model.addAttribute("getuser",getuser);
        System.out.println(getuser);
        return "user/userUpdate";

    }

    /**
     * 用户修改提交
     * @param user
     * @return
     */
    @RequestMapping("updateuserisok")
    public  String updateuserisok(Smbms_user user){
        int arr=userService.updatauser(user);
        System.out.println(user.getAddress());
        if(arr==1){
            return "redirect:userhomelist";
        }
        return "userUpdate";
    }

    /**
     * 用户查看信息
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("userinfo")
    public  String userinfo(@RequestParam("id")int id,Model model){
        Smbms_user user=userService.getuserall(id);
        model.addAttribute("user",user);
        return "user/userinfo";
    }

    /**
     * 用户模糊查询（分页显示）
     * @param username
     * @param userrole
     * @param isfrom
     * @param model
     * @return
     */
    @RequestMapping("getuserlistbyname")
    public String getuserlistbyname(@RequestParam("username")String username,
                                    @RequestParam("userrole")int userrole,
                                    @RequestParam(value = "isfrom",defaultValue = "1",required = true) int isfrom,
                                    Model model){
        Page page=new Page();
        if (isfrom<=0){
            isfrom=page.getCurrPageNo();
        }else {
            page.setCurrPageNo(isfrom);
        }
        int sum=userService.userlistsum();
        page.setTotalCount(sum);
        List<Smbms_user> userList=userService.getuserlistbyname(username,userrole,isfrom,page.getPageSize());
        page.setTuserList(userList);
        model.addAttribute("page",page);
        return "user/userhome";
    }

    /**
     * 添加用户（页面跳转）
     * @return
     */
    @RequestMapping("adduserinfo")
    public  String adduserinfo()
    {
        return "user/useradd";
    }

    /**
     * 添加用户提交
     * @return
     */
    @RequestMapping("adduser")
    public  String adduser(Smbms_user user){

        return "user/useradd";
    }
}
