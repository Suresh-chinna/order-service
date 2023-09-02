package com.order.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.manage.entity.OrdersEntity;

@Repository
public interface OrderDao extends JpaRepository<OrdersEntity, Integer> {

}
