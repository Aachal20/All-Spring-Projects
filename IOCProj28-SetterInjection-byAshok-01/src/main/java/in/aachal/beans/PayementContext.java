package in.aachal.beans;

public class PayementContext {

	private IPayement paymentService;

	public void setPaymentService(IPayement paymentService) {
		System.out.println("Setter Injection");
		this.paymentService = paymentService;
	}

	public void payBill(Double amount , int pin) {
		boolean status = paymentService.pay(amount, pin);
		System.out.println("payaement completed ::" +status);

	}

	
	public PayementContext(IPayement paymentService) {
		System.out.println("PayementContext.PayementContext()::Param constructor");
		this.paymentService = paymentService;
	}

}
