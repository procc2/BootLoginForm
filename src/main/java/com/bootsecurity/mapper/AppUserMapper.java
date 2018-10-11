package com.bootsecurity.mapper;
 
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bootsecurity.model.AppUser;
 
public class AppUserMapper implements RowMapper<AppUser> {
 
    public static final String BASE_SQL //
            = "Select u.userId, u.userName, u.password From User u ";
 
    @Override
    public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {
 
        Long userId = rs.getLong("userId");
        String userName = rs.getString("UserName");
        String encrytedPassword = rs.getString("Password");
 
        return new AppUser(userId, userName, encrytedPassword);
    }
 
}