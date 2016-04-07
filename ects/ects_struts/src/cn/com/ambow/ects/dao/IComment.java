package cn.com.ambow.ects.dao;

import java.util.List;

import cn.com.ambow.ects.entity.Comment;

public interface IComment {

	public List findByProduct(int pid );
	
	public void addComment(Comment comment);
}
