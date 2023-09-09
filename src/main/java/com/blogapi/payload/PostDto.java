package com.blogapi.payload;

import lombok.Data;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {

    private long id;



    @NotEmpty
    @Size(min = 2, message = "Title should be at least 2 character")
    private String title;


    @NotEmpty(message = "description is empty")
    @Size(min = 4, message = "description at least 4 character")
    private String description;

    @NotEmpty
    private String content;


}
