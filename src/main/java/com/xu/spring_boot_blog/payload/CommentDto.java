package com.xu.spring_boot_blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CommentDto {
    private long id;

    @NotEmpty(message = "請輸入姓名")
    private String name;

    @NotEmpty(message = "請輸入電子郵件" )
    @Email
    private String email;

    @NotEmpty
    private String body;
}
