package com.java.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * description:JavaBean、POJO
 * author: 河发
 * time: 16:04
 */
public class DB {
    private String driver;//驱动
    private String url;//链接地址
    private String username;//用户名
    private String password;//密码
    private Integer port;//端口号
    private Float price;//价钱
    private Admin admin;//当前数据库的管理员

    //单列集合
    private List list;
    private Set set;
    //双列
    private Map map;
    private Properties properties;//表示.properties的配置文件

    public DB(){
        System.out.println("DB...无参构造方法");
    }

    public DB(String driver, Integer port, Float price, Admin admin) {
        System.out.println("DB....有参构造方法");
        this.driver = driver;
        this.port = port;
        this.price = price;
        this.admin = admin;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DB{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", port=" + port +
                ", price=" + price +
                ", admin=" + admin +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
