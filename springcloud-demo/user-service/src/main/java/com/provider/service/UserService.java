package com.provider.service;

import com.provider.mapper.UserMapper;
import com.provider.pojo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Haotian
 * @Date: 2020/1/13 16:11
 * @Description: 用户服务
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 更据id查询用户信息
     *
     * @param ids id数组
     * @return 用户数据list集合
     */
    public List<Girl> findByIds(Integer[] ids) {
        return this.userMapper.selectBatchIds( Arrays.asList( ids ) );
    }
}