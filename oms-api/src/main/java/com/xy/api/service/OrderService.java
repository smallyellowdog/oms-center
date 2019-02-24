package com.xy.api.service;

import com.xy.api.request.OrderDetailQueryRequest;
import com.xy.common.response.BaseResponse;
import com.xy.pojo.order.Order;

public interface OrderService {
     BaseResponse<Order> getOrderDetail(OrderDetailQueryRequest orderDetailQueryRequest);
}
