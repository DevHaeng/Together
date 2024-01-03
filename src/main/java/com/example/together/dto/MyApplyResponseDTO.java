package com.example.together.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//내가 모집장인 동행 dto
public class MyApplyResponseDTO {
    private String title;//recruit
    private long per_num;//recruit
    private long cur_num;//recruit
    private String nickname;//member

}
