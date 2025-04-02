package springboot.blog.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.blog.springbootdeveloper.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
