package com.company.model.dao.imp;

import com.company.model.dao.OrderDao;
import com.company.model.entity.Food;
import com.company.model.entity.Transport;
import com.company.model.entity.trip.Order;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class JDBCOrderDao implements OrderDao {

  private Connection connection;

  public JDBCOrderDao(Connection connection) {
    this.connection=connection;
  }

  static Order extractFromResultSet(ResultSet rs) throws Exception{
    Order order = Order.builder().build();
    order.setDuration(rs.getInt("duration"));
    order.setType(rs.getString("type"));
    order.setFood(Food.valueOf(rs.getString("food")));
    order.setTransport(Transport.valueOf(rs.getString("transport")));
    return order;
  }

  @Override
  public void create(Order entity) {

  }

  @Override
  public Order findById(int id) {
    return null;
  }

  @Override
  public List<Order> findAll() {
    return null;
  }

  @Override
  public void update(Order entity) {

  }

  @Override
  public void delete(int id) {

  }

  @Override
  public void close() throws Exception {

  }
}
