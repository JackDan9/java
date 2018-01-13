package com.jackdan.dao;

import com.jackdan.domain.Comment;

/**
 * Created by JackDan9 on 2018/1/1.
 */
public interface CommentMapper {
    int deleteByPrimaryKey(String commentId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(String commentId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);
}
