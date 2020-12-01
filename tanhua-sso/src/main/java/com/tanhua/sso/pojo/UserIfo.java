package com.tanhua.sso.pojo;

import com.tanhua.sso.enums.SexEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserIfo {
    private Long id;
    //用户id
    private Long userId;
    //昵称
    private String nickName;
    //用户头像
    private String logo;
    //用户标签：多个用逗号分隔
    private String tags;
    //性别
    private SexEnum sex;
    //年龄
    private Integer age;
    //学历
    private String edu;
    //城市
    private String city;
    //生日
    private String birthday;
    // 封面图片
    private String coverPic;
    //行业
    private String industry;
    //收入
    private String income;
    //婚姻状态
    private String marriage;
}
