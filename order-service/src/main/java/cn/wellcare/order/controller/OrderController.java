package cn.wellcare.order.controller;

import cn.wellcare.model.Order;
import cn.wellcare.model.ServiceResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @GetMapping("/getOrderList/{id}")
    public ServiceResult<List<Order>> getOrderList(@PathVariable("id") String id){
        ServiceResult<List<Order>> serviceResult = new ServiceResult<>();

        List<Order> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setId(i+"");
            order.setCreateTime(new Date());
            orders.add(order);
        }
        serviceResult.setData(orders);
        return serviceResult;
    }

}
