package com.hjl.rollingpaper.domain.post;

import com.hjl.rollingpaper.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
  @Query(value = "SELECT * from Post where name = ?1", nativeQuery = true)
  String showPosts(String name);

}
