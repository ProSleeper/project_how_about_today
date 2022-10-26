
/* orders 엔티티와 매핑되는 사이트 */

package com.phoenix.howabouttoday.payment.dto;
import com.phoenix.howabouttoday.member.entity.Member;
import com.phoenix.howabouttoday.payment.entity.Orders;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Getter
public class OrdersDTO {

    private Long ordersNum;         //pk값
    private LocalDate ordersDate;
    private Integer ordersPrice;
    private String ordersTel;
    private String ordersName;
    private String ordersType;
    private String ordersStatus;
    private String ordersMerchantId;
    private List<OrdersDetailDTO> ordersDetailDTOList;

    public OrdersDTO(Orders orders) {
        this.ordersNum = orders.getOrdersNum();
        this.ordersTel = orders.getOrdersTel();
        this.ordersName = orders.getOrdersName();
        this.ordersDate = orders.getOrdersDate().toLocalDate();
        this.ordersPrice = orders.getOrdersPrice();
        this.ordersType = orders.getOrdersType();
        this.ordersStatus = orders.getOrdersStatus().getValue();
        this.ordersMerchantId = orders.getMerchantId();
        this.ordersDetailDTOList = orders.getReservation().stream().map(OrdersDetailDTO::new).collect(Collectors.toList());
    }

    public OrdersDTO() {
    }
}
