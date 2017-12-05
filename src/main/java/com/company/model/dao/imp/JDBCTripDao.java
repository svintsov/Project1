package com.company.model.dao.imp;

import com.company.model.SimpleTripFactory;
import com.company.model.dao.TripDao;
import com.company.model.entity.trip.Order;
import com.company.model.entity.trip.Trip;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCTripDao implements TripDao {

  private Connection connection;

  public JDBCTripDao(Connection connection) {
    this.connection = connection;
  }

  private Trip extractFromResultSet(ResultSet rs) throws Exception{
    SimpleTripFactory factory = new SimpleTripFactory();
    Order order = JDBCOrderDao.extractFromResultSet(rs);

    Trip trip = factory.createTrip(order);
    trip.setId(rs.getInt("idtrips"));
    trip.setCost(rs.getLong("cost"));
    return trip;
  }

  @Override
  public void create(Trip entity) {

  }

  @Override
  public Trip findById(int id) {
    return null;
  }

  @Override
  public List<Trip> findAll() {
    List<Trip> resultList = new ArrayList<>();
    try (Statement ps = connection.createStatement()){
      ResultSet rs = ps.executeQuery(
          "select * from trips left join orders using(idtrips)");
      while ( rs.next() ){
        Trip result = extractFromResultSet(rs);

        resultList.add(result);
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return resultList;
  }


  @Override
  public void update(Trip entity) {

  }

  @Override
  public void delete(int id) {

  }

  @Override
  public void close() throws Exception {

  }
}
