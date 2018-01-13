package com.jackdan.domain;

import java.util.Date;

public class Comment {
    private String commentId;

    private String commentUser;

    private String commentArticle;

    private String replyUser;

    private String commentContent;

    private Date commentDate;

    private Integer floor;

    public Comment(String commentId, String commentUser, String commentArticle, String replyUser, String commentContent, Date commentDate, Integer floor) {
        this.commentId = commentId;
        this.commentUser = commentUser;
        this.commentArticle = commentArticle;
        this.replyUser = replyUser;
        this.commentContent = commentContent;
        this.commentDate = commentDate;
        this.floor = floor;
    }

    public Comment() {
        super();
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser;
    }

    public String getCommentArticle() {
        return commentArticle;
    }

    public void setCommentArticle(String commentArticle) {
        this.commentArticle = commentArticle;
    }

    public String getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(String replyUser) {
        this.replyUser = replyUser;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}