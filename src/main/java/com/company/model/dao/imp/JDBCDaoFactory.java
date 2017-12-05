package com.company.model.dao.imp;

import com.company.model.dao.DaoFactory;
import com.company.model.dao.OrderDao;
import com.company.model.dao.TripDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDaoFactory extends DaoFactory {

  @Override
  public TripDao createTripDao() {
    return new JDBCTripDao(getConnection());
  }
  @Override
  public OrderDao createOrderDao() {
    return new JDBCOrderDao(getConnection());
  }

  private Connection getConnection(){
    try {
      return DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/project1_db",
          "root" ,
          "qwaszx45" );
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
