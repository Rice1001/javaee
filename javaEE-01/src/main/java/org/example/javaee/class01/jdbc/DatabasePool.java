package org.example.javaee.class01.jdbc;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author rice
 * @version 1.0
 * @date 2020/3/25 19:30
 */
public class DatabasePool {

    private static HikariDataSource hikariDataSource;

    public static HikariDataSource getHikariDataSource(){
        if(hikariDataSource != null){
            return hikariDataSource;
        }

        synchronized (DatabasePool.class){
            if(null == hikariDataSource){
                String jdbcurl = "jdbc:mysql://127.0.0.1:3306/school?useUnicode=true&characterEncoding=utf8&useSSL=false";
                String driveName = "com.mysql.cj.jdbc.Driver";
                HikariConfig hikariConfig = new HikariConfig();
                hikariConfig.setUsername("root");
                hikariConfig.setPassword("root");
                hikariConfig.setJdbcUrl(jdbcurl);
                hikariConfig.setDriverClassName(driveName);
                hikariDataSource = new HikariDataSource(hikariConfig);
                return hikariDataSource;
            }
        }
        return  null;
    }

    public static void main(String[] args) {
        getHikariDataSource();

    }
}
