package cn.oldimpl.service.impl;

import cn.oldimpl.dao.DBInfoDao;
import cn.oldimpl.service.DBInfoService;

public class DBInfoServiceImpl implements DBInfoService {
//    private DBInfoDao mysqlDao = new DBInfoDaoMysqlImpl();
//    private DBInfoDao oracleDao = new DBInfoDaoOracleImpl();

    /**
     * 对以上方式进行修改，在需要用到DBInfoDao的地方，不去实现它，而是预留出一个接口，利用set
     */
    private DBInfoDao dbInfoDao;

    public void setDbInfoDao(DBInfoDao dbInfoDao) {
        this.dbInfoDao = dbInfoDao;
    }

    @Override
    public void getDBInfo() {
//        mysqlDao.getDBInfo();
        dbInfoDao.getDBInfo();
    }
}
