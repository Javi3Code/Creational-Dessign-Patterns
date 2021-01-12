package common.jeycode.creationaldessignpattern.factorymethod.files;

import java.util.Objects;

public class PaypalService implements PaymentFactory {

						private static PaypalService factoryInstance;

						private PaypalService() {}

						public static PaymentFactory getPaymentServiceInstance() {
												factoryInstance = Objects.isNull(factoryInstance) ? new PaypalService() : factoryInstance;
												return factoryInstance;
						}

						@Override
						public Payment createPayment() { return PaymentType.PAYPAL.payment; }

}
