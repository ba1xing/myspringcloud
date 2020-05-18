package cn.wellcare.user.service;

import cn.wellcare.model.Order;
import cn.wellcare.model.ServiceResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("order-service")
public interface UserService {

    @GetMapping("/order/getOrderList/{id}")
    ServiceResult<List<Order>> getUserOrders(@PathVariable("id") String id);
}
