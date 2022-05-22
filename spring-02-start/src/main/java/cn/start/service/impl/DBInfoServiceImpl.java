package cn.start.service.impl;

import cn.start.dao.DBInfoDao;
import cn.start.service.DBInfoService;

public class DBInfoServiceImpl implements DBInfoService {

    private DBInfoDao dbInfoDao;

    public void setDbInfoDao(DBInfoDao dbInfoDao) {
        this.dbInfoDao = dbInfoDao;
    }

    @Override
    public void getDBInfo() {
        dbInfoDao.getDBInfo();
    }
}
