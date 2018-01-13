package com.jackdan.service;

import com.github.pagehelper.PageInfo;
import com.jackdan.domain.User;

import java.util.Map;

/**
 * Created by JackDan9 on 2018/1/1.
 */
public interface UserService {

    /**
     * 通过用户id查找用户
     *
     * @param userId 用户id
     * @return 用户对象
     */

    User findUserById(String userId);

    /**
     * 通过条件批量筛选用户
     *
     * @param params
     * @return
     */
    PageInfo selectAllUser(Map<String, String> params);
}
