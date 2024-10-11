package com.nogmo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nogmo.course.entities.OrderItem;
import com.nogmo.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
