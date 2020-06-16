package com.example.demomvplast;

public class DayBean {

   private String user_id;
   private String version;
   private String current_device;
   private String unique_identifier;
   private String user_defined_name;
   private String download_channel;
   private String phone_version;
   private String phone_model;
   private String wx_unionid;



    public String getUser_id() {

        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCurrent_device() {
        return current_device;
    }

    public void setCurrent_device(String current_device) {
        this.current_device = current_device;
    }

    public String getUnique_identifier() {
        return unique_identifier;
    }

    public void setUnique_identifier(String unique_identifier) {
        this.unique_identifier = unique_identifier;
    }

    public String getUser_defined_name() {
        return user_defined_name;
    }

    public void setUser_defined_name(String user_defined_name) {
        this.user_defined_name = user_defined_name;
    }

    public String getDownload_channel() {
        return download_channel;
    }

    public void setDownload_channel(String download_channel) {
        this.download_channel = download_channel;
    }

    public String getPhone_version() {
        return phone_version;
    }

    public void setPhone_version(String phone_version) {
        this.phone_version = phone_version;
    }

    public String getPhone_model() {
        return phone_model;
    }

    public void setPhone_model(String phone_model) {
        this.phone_model = phone_model;
    }

    public String getWx_unionid() {
        return wx_unionid;
    }

    public void setWx_unionid(String wx_unionid) {
        this.wx_unionid = wx_unionid;
    }

    @Override
    public String toString() {
        return "DayBean{" +
                "user_id='" + user_id + '\'' +
                ", version='" + version + '\'' +
                ", current_device='" + current_device + '\'' +
                ", unique_identifier='" + unique_identifier + '\'' +
                ", user_defined_name='" + user_defined_name + '\'' +
                ", download_channel='" + download_channel + '\'' +
                ", phone_version='" + phone_version + '\'' +
                ", phone_model='" + phone_model + '\'' +
                ", wx_unionid='" + wx_unionid + '\'' +
                '}';
    }
}
