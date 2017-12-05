package com.company.model.dao;

import com.company.model.dao.imp.JDBCDaoFactory;

public abstract class DaoFactory {
  private static DaoFactory daoFactory;

  public abstract TripDao createTripDao();
  public abstract OrderDao createOrderDao();

  public static DaoFactory getInstance(){
    if( daoFactory == null ){
      synchronized (DaoFactory.class){
        if(daoFactory==null){
          DaoFactory temp = new JDBCDaoFactory();
          daoFactory = temp;
        }
      }
    }
    return daoFactory;
  }
}
