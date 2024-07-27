package com.xu.spring_boot_blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.Set;

@Data
@Schema(description = "PostDto Model Information")
public class PostDto {
    private long id;

    @Schema(description = "文章標題")
    @NotEmpty
    @Size(min = 1, message = "標題字少要一個字")
    private String title;

    @Schema(description = "文章摘要")
    @NotEmpty
    @Size(min = 1, message = "請輸入至少一個字")
    private String description;

    @Schema(description = "文章內容")
    @NotEmpty
    private String content;

    private Set<CommentDto> comments;

    @Schema(description = "文章分類")
    private Long categoryId;

}
