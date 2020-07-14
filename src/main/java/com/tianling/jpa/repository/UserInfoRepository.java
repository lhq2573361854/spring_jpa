package com.tianling.jpa.repository;

import com.tianling.jpa.entities.UserInfoEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;


/**
 * @author: TianLing
 * @Year: 2020
 * @DateTime: 2020/7/14 17:48
 */
public interface UserInfoRepository extends PagingAndSortingRepository<UserInfoEntity,Integer> {
    UserInfoEntity getByUserId(Integer userId);
    List<UserInfoEntity> getByUserNameStartingWithAndUserIdLessThan(String userName, Integer id);
}
