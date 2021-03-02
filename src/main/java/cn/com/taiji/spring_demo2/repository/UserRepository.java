package cn.com.taiji.spring_demo2.repository;

import cn.com.taiji.spring_demo2.pojo.User;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
