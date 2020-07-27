package Enum;


import java.util.Date;

import entities2.Order;
import entities2.enums.OrderStatus;

public class EnumPrograma {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERY;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERY");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}