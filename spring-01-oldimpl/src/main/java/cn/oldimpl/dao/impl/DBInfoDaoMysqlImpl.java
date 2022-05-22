package cn.oldimpl.dao.impl;

import cn.oldimpl.dao.DBInfoDao;

public class DBInfoDaoMysqlImpl implements DBInfoDao {
    @Override
    public void getDBInfo() {
        System.out.println("Mysql数据库信息");
    }
}
