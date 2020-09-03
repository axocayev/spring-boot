package az.atl.springdata.datajpa.controller;

import az.atl.springdata.datajpa.entity.User;
import az.atl.springdata.datajpa.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/save" ,method = RequestMethod.GET)
    public  @ResponseBody  String save(){
        User user=new User();
        user.setEmail("kamal@gmail.com");
        user.setName("Kamal");
        user.setSurname("Aliyev");
       return userService.save(user).toString();
    }

    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public  @ResponseBody  String test(){

        return userService.getUserByEmail("anarxocayev@gmail.com").toString();
    }

    @RequestMapping(value = "/test2" ,method = RequestMethod.GET)
    public  @ResponseBody  String test2(){

        return userService.getUserONe().toString();
    }
    @RequestMapping(value = "/test3" ,method = RequestMethod.GET)
    public  @ResponseBody  String test3(){

        return userService.getUserTwo().toString();
    }
    @RequestMapping(value = "/all" ,method = RequestMethod.GET)
    public  @ResponseBody  String all(){

        return userService.findAllUser().toString();
    }

    @RequestMapping(value = "/page" ,method = RequestMethod.GET)
    public  @ResponseBody  String page(){

        return userService.users().toString();
    }


}
