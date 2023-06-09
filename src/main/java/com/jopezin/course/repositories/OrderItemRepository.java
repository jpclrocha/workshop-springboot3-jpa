package com.jopezin.course.repositories;

import com.jopezin.course.entities.OrderItem;
import com.jopezin.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
