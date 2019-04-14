package com.autotable.autotable.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;


@Data
@Table(name = "t_user")
public class TUser {

    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    //用户id
    @Column(name = "user_id",type = MySqlTypeConstant.BIGINT,defaultValue = "0",length = 255)
    public Long userId;

    //姓名
    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,defaultValue = "0",length = 25)
    public String name;

    //用户名
    @Column(name = "user_name",type = MySqlTypeConstant.VARCHAR,defaultValue = "0",length = 25)
    public String userName;

    //密码
    @Column(name = "pass_word",type = MySqlTypeConstant.VARCHAR,defaultValue = "0",length = 255)
    public String passWord;

    //手机号码
    @Column(name = "phone_number",type = MySqlTypeConstant.VARCHAR,defaultValue = "0",length = 25)
    public String phoneNumber;

    //微信
    @Column(name = "wx",type = MySqlTypeConstant.VARCHAR,defaultValue = "0",length = 25)
    public String wx;

    //住址
    @Column(name = "address",type = MySqlTypeConstant.VARCHAR,defaultValue = "0",length = 255)
    public String address;

    //备注
    @Column(name = "remark",type = MySqlTypeConstant.VARCHAR,defaultValue = "0",length = 255)
    public String renark;

    //公司名称
    @Column(name = "company_name",type = MySqlTypeConstant.VARCHAR,defaultValue = "0",length = 255)
    public String companyName;


    //角色名称
    @Column(name = "role_name",type = MySqlTypeConstant.VARCHAR,defaultValue = "0",length = 255)
    public String roleName;

    //是否删除
    @Column(name = "is_del",type = MySqlTypeConstant.INT,defaultValue = "0",length = 25)
    public Integer isDel;

    //创建日期
    @Column(name = "create_time",type = MySqlTypeConstant.BIGINT,defaultValue = "0",length = 255)
    public Long createTime;

    //修改日期
    @Column(name = "update_time",type = MySqlTypeConstant.BIGINT,defaultValue = "0",length = 255)
    public Long updateTime;



}
