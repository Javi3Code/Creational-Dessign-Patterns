package common.jeycode.creationaldessignpattern.factorymethod.files;

import java.util.Objects;

public class BizumService implements PaymentFactory
{

						private static BizumService factoryInstance;

						private BizumService()
						{}

						public static PaymentFactory getPaymentServiceInstance()
						{
												factoryInstance = Objects.isNull(factoryInstance) ? new BizumService() : factoryInstance;
												return factoryInstance;
						}

						@Override
						public Payment createPayment()
						{
												return PaymentType.BIZUM.payment;
						}

}
