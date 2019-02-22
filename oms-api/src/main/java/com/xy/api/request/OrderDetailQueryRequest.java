package com.xy.api.request;

import lombok.Data;

import java.io.Serializable;
@Data
public class OrderDetailQueryRequest implements Serializable {
    private static final long serialVersionUID = -502189579006286810L;
    private Long orderId;
}
