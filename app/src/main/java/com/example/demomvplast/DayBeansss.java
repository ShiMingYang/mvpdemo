package com.example.demomvplast;

public class DayBeansss {

    /**
     * data : {"_id":"5d7a0cb8d12f4212e33cd309","content":"只有敢于冒险，才有机遇发现赚钱的机会","create_time":"2019-09-12 17:14","end_hour":24,"img":"https://img.yaofun.vip/2019/09/12/e0df93ee-d53d-11e9-b369-acde48001122.jpeg","lunar_time":"[辛巳 九月十三]","number_time":"11","prompt":"忌胆怯","solar_time":"2019年10月 星期五","start_hour":0,"title":"name,早上好","use_time":"all"}
     * msg : 请求成功
     * page : 0
     * pageSize : 0
     * success : true
     * total : 1
     */

    private DataBean data;
    private String msg;
    private String page;
    private int pageSize;
    private boolean success;
    private int total;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static class DataBean {
        /**
         * _id : 5d7a0cb8d12f4212e33cd309
         * content : 只有敢于冒险，才有机遇发现赚钱的机会
         * create_time : 2019-09-12 17:14
         * end_hour : 24
         * img : https://img.yaofun.vip/2019/09/12/e0df93ee-d53d-11e9-b369-acde48001122.jpeg
         * lunar_time : [辛巳 九月十三]
         * number_time : 11
         * prompt : 忌胆怯
         * solar_time : 2019年10月 星期五
         * start_hour : 0
         * title : name,早上好
         * use_time : all
         */

        private String _id;
        private String content;
        private String create_time;
        private int end_hour;
        private String img;
        private String lunar_time;
        private String number_time;
        private String prompt;
        private String solar_time;
        private int start_hour;
        private String title;
        private String use_time;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public int getEnd_hour() {
            return end_hour;
        }

        public void setEnd_hour(int end_hour) {
            this.end_hour = end_hour;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getLunar_time() {
            return lunar_time;
        }

        public void setLunar_time(String lunar_time) {
            this.lunar_time = lunar_time;
        }

        public String getNumber_time() {
            return number_time;
        }

        public void setNumber_time(String number_time) {
            this.number_time = number_time;
        }

        public String getPrompt() {
            return prompt;
        }

        public void setPrompt(String prompt) {
            this.prompt = prompt;
        }

        public String getSolar_time() {
            return solar_time;
        }

        public void setSolar_time(String solar_time) {
            this.solar_time = solar_time;
        }

        public int getStart_hour() {
            return start_hour;
        }

        public void setStart_hour(int start_hour) {
            this.start_hour = start_hour;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUse_time() {
            return use_time;
        }

        public void setUse_time(String use_time) {
            this.use_time = use_time;
        }
    }
}
