package cn.start.dao.impl;

import cn.start.dao.DBInfoDao;

public class DBInfoDaoOracleImpl implements DBInfoDao {
    @Override
    public void getDBInfo() {
        System.out.println("Oracle数据库信息");
    }
}
