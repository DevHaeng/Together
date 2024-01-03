package com.example.together.dto;

import java.util.Date;


//이미 모집완료된 동행게시글(모집장,참여자 둘다)
public interface PastAppliedDTO {
    String getCity();
    String getNickname();
    Date getEnddate();
    Long getId();
    Long getReviewedId();
}
