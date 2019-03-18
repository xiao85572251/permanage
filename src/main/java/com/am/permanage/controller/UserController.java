package com.am.permanage.controller;




import com.am.permanage.bean.User;
import com.am.permanage.service.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserImpl userimpl;

    @RequestMapping("/index")
    public String index(Model model, User user){
        model.addAttribute("user",userimpl.AllUser());
        user.uid = 2;
        user.uname = "nan";
        user.upassword = "lou";
        userimpl.Update(user);
        System.out.println("******************"+userimpl.AllUser());
        System.out.println("******************"+userimpl.Update(user));
        return "index";
    }

}
