package springboot.blog.springbootdeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.blog.springbootdeveloper.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
