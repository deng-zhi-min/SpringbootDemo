package cn.com.taiji.spring_demo2.service;


import cn.com.taiji.spring_demo2.dto.UserDTO;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserInfoServiceTest {

    @Autowired
    private UserInfoService userInfoService;

    private Logger log=LoggerFactory.getLogger(UserInfoServiceTest.class);

    @Test
    void getUserDTO() {
        UserDTO userDTO= userInfoService.getUserDTO();
        log.info("UserInfoServiceTest-getUserDTO-获取当前用户，Id：{}",userDTO.getId());
        log.info("UserInfoServiceTest-getUserDTO-获取当前用户，姓名：{}",userDTO.getUserName());
    }
}