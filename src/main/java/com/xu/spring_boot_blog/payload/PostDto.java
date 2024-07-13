package com.xu.spring_boot_blog.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.Set;

@Data
public class PostDto {
    private long id;

    @NotEmpty
    @Size(min = 1, message = "標題字少要一個字")
    private String title;

    @NotEmpty
    @Size(min = 1, message = "請輸入至少一個字")
    private String description;

    @NotEmpty
    private String content;
    private Set<CommentDto> comments;


}
