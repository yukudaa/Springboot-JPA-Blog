package com.cos.blog.test;

import lombok.*;

//@Getter
//Setter
@Data   // getter + setter
//@AllArgsConstructor // 전체 constructor
@NoArgsConstructor // 빈 constructor

public class Member {
    private int id;
    private String username;
    private String password;
    private String email;

    @Builder
    public Member(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
