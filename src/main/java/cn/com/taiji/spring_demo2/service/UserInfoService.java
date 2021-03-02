package cn.com.taiji.spring_demo2.service;


import cn.com.taiji.spring_demo2.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    private Logger log=LoggerFactory.getLogger(UserInfoService.class);

    public UserDTO getUserDTO(){
        UserDTO userDTO=new UserDTO();
        userDTO.setId("1");
        userDTO.setUserName("小张");
        log.info("UserInfoService-getUserName,当前用户：{}",userDTO.getUserName());
        return userDTO;
    }


}
