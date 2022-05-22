package cn.oldimpl.dao.impl;

import cn.oldimpl.dao.DBInfoDao;

public class DBInfoDaoOracleImpl implements DBInfoDao {
    @Override
    public void getDBInfo() {
        System.out.println("Oracle数据库信息");
    }
}
