package com.xy.server.rpc.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xy.api.constant.Status;
import com.xy.api.request.OrderDetailQueryRequest;
import com.xy.api.response.BaseResponse;
import com.xy.api.service.OrderService;
import com.xy.mapper.OrderMapper;
import com.xy.pojo.order.Order;
import com.xy.pojo.order.OrderExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * RPC服务方实现(对外提供)
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public BaseResponse<Order> getOrderStatus(OrderDetailQueryRequest orderDetailQueryRequest) {

        if(orderDetailQueryRequest != null){
            return BaseResponse.result(Status.PARAMS_ERROR);
        }

        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andIdEqualTo(orderDetailQueryRequest.getOrderId());
        List<Order> orderList = orderMapper.selectByExample(orderExample);

        if(!CollectionUtils.isEmpty(orderList)){
            return BaseResponse.ok(orderList);
        }

        return BaseResponse.result(Status.FAILED);
    }
}
