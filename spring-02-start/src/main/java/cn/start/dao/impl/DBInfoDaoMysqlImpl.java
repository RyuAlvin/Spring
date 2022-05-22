package cn.start.dao.impl;

import cn.start.dao.DBInfoDao;

public class DBInfoDaoMysqlImpl implements DBInfoDao {
    @Override
    public void getDBInfo() {
        System.out.println("Mysql数据库信息");
    }
}
