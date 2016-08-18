package edu.cumtb.model;

import lombok.Data;

/**
 * Administrator
 * Created by tbpwang
 * 2016/8/3.
 */

@Data public class User extends BaseModel {
    // user model
    private Integer id;
    private String username;
    private String password;
    private String role;
}
