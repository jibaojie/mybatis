package com.baojie.mybatis.common.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;

/**
 * @author jbj
 * @create 2019-05-13 12:02
 */
@Data
@EqualsAndHashCode
@NameStyle(Style.normal)
public class User extends BaseEntity{

    @Id
    private Integer id;

    private String userName;

    private String password;

}
