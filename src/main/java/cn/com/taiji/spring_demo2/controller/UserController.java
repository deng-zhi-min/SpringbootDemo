package cn.com.taiji.spring_demo2.controller;

import cn.com.taiji.spring_demo2.pojo.User;
import cn.com.taiji.spring_demo2.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    private Logger logger= LoggerFactory.getLogger(UserController.class);
    //查找所有
    @GetMapping(value="/users")
    public List<User> userList(){
        return userRepository.findAll();
    }

    //新增一个
    @GetMapping(value="/adduser")
    public String addUser(@RequestParam("uid") int uid,@RequestParam("uname")String uname,@RequestParam("age")int age){
        logger.info("UserController-addUser添加学生ID："+uid+"uname"+uname+"age"+age);
        User user=new User(uid,uname,age);
        userRepository.save(user);
        return user.toString()+"已经添加！";
    }


    //按照uid查找
    @GetMapping(value = "/getUser")
    public User findUserByUid(@RequestParam("uid") int uid){
        return userRepository.findById(uid).get();
    }

    //按照uid修改用户姓名
    @ResponseBody
    @RequestMapping(value="/update")
    public User updateUser(@RequestParam("uid")int uid,@RequestParam("uname")String uname){

        User user =userRepository.findById(uid).get();
        user.setUname(uname);
        logger.info("修改的学生ID为"+uid+"修改的学生内容"+user);

        return userRepository.save(user);
    }

    @GetMapping(value="/delete")
    public String delete(@RequestParam("uid") int uid){
        logger.info("UserController-delete删除学生，ID="+uid);
        User user=userRepository.findById(uid).get();
        userRepository.deleteById(uid);
        return user.toString()+"已经被删除！";
    }
}
