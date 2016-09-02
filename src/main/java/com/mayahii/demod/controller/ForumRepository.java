package com.mayahii.demod.controller;

import com.mayahii.demod.bean.Forum;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by root on 29/08/16.
 */
public interface ForumRepository  extends CrudRepository<Forum,Long>{
    public Forum findForumById(long id);
    
}
