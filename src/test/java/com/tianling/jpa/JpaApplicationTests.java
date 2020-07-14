package com.tianling.jpa;

import com.tianling.jpa.entities.UserInfoEntity;
import com.tianling.jpa.repository.UserInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import javax.persistence.PersistenceContext;
import java.util.ArrayList;

@SpringBootTest
@Slf4j
class JpaApplicationTests {
    @Autowired
    UserInfoRepository userInfoRepository;


    @Test
    void contextLoads() {
//        UserInfoEntity byUserId = userInfoRepository.getByUserId(1);
//        System.out.println("byUserId = " + byUserId);
//        List<UserInfoEntity> zhangsan = userInfoRepository.getByUserNameStartingWithAndUserIdLessThan("zhangsan", 100);
//        for (UserInfoEntity userInfoEntity : zhangsan) {
//            System.out.println("userInfoEntity = " + userInfoEntity);
//        }
        PageRequest user_id = PageRequest.of(0, 3, Sort.by(new Sort.Order(Sort.Direction.DESC, "userId")));

        Page<UserInfoEntity> page = userInfoRepository.findAll(user_id);

        System.out.println("总记录数 = " + page.getTotalElements());
        System.out.println("总页数 = " + page.getTotalPages());
        System.out.println("第几页 = " + page.getNumber());
        System.out.println("当前页面的记录数 = " + page.getNumberOfElements());

    }

}
