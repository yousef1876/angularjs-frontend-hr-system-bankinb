package com.framework.core.springmvc.test;

import com.framework.core.springmvc.domain.Post;
import com.framework.core.springmvc.model.PostForm;

/**
 *
 * @author hantsy
 */
public final class Fixtures {
	
	private Fixtures() {
	      throw new InstantiationError( "Must not instantiate this class" );
	}

    public static Post createPost(String title, String content) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);

        return post;
    }

    public static PostForm createPostForm(String title, String content) {
        PostForm post = new PostForm();
        post.setTitle(title);
        post.setContent(content);

        return post;
    }

}
