package week03.day3.클래스만들기;

//주문정보
public class OrderInfo {
	//멤버변수
	private String orderNumber;
	private String orderId;
	private String orderDate;
	private String orderName;
	private String itemNumber;
	private String address;
	
	//생성자
	public OrderInfo(String orderNumber,String orderId,String orderDate,String orderName,String itemNumber,String address) {
		this.orderNumber = orderNumber;
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.itemNumber = itemNumber;
		this.address = address;
	}
	
	//출력
	public void printOrderInfo() {
		System.out.println("주문번호: "+orderNumber);
		System.out.println("주문자아이디: "+orderId);
		System.out.println("주문날짜: "+orderDate);
		System.out.println("주문자이름: "+orderName);
		System.out.println("주문상품번호: "+itemNumber);
		System.out.println("배송주소: "+address);
	}
	
	
	
}
