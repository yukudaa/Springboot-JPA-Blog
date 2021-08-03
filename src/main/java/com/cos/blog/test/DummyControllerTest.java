package com.cos.blog.test;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 데이터만 return해주는, 응답만 해주는
public class DummyControllerTest {

    @Autowired  // 의존성 주입(DI)
    private UserRepository userRepository;


    // http://localhost:8000/blog/dummy/join (요청)
    // http의 body에 username, password, eamil 데이터를 가지고 (요청)
    @PostMapping("/dummy/join") // 회원가입을 할꺼기 때문에, insert할꺼니깐
    public String join(User user) { // key=value (약속된 규칙)
        System.out.println("id: "+user.getId());
        System.out.println("username: "+user.getUsername());
        System.out.println("password: "+user.getPassword());
        System.out.println("email: "+user.getEmail());
        System.out.println("role: "+user.getRole());
        System.out.println("createDate: "+user.getCreateDate());

        user.setRole(RoleType.USER);
        userRepository.save(user);
        return "회원가입이 완료되었습니다.";
    }
}
