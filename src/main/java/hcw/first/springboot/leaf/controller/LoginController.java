package hcw.first.springboot.leaf.controller;

import com.github.pagehelper.PageHelper;
import hcw.first.springboot.leaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Company: 道盟科技
 * @Author : hechengwen
 * @Time : 2018/10/26 10:06
 * @Desc :
 * @version:
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    @ResponseBody
    public String login(@RequestParam(value = "uid", required = false) Integer uId, @RequestParam(value = "username", required = false) String username) {
        if (uId == null) return "参数为空";
        PageHelper.startPage(0,10);
        return userService.getUserById(uId).toString();
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/monitor")
    public String monitor(){
        return "redirect:/monitor/index";
    }
}
