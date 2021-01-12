package common.jeycode.creationaldessignpattern.factorymethod.files;

import java.util.Objects;

public final class BankDepositService implements PaymentFactory
{

						private static BankDepositService factoryInstance;

						private BankDepositService()
						{}

						public static PaymentFactory getPaymentServiceInstance()
						{
												factoryInstance = Objects.isNull(factoryInstance) ? new BankDepositService() : factoryInstance;
												return factoryInstance;
						}

						@Override
						public Payment createPayment()
						{
												return PaymentType.BANK_DEPOSIT.payment;
						}

}
