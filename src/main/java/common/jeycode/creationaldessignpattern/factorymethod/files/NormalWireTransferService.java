package common.jeycode.creationaldessignpattern.factorymethod.files;

import java.util.Objects;

public class NormalWireTransferService implements PaymentFactory {

						private static NormalWireTransferService factoryInstance;

						private NormalWireTransferService() {}

						public static PaymentFactory getPaymentServiceInstance() {
												factoryInstance = Objects.isNull(factoryInstance) ? new NormalWireTransferService() : factoryInstance;
												return factoryInstance;
						}

						@Override
						public Payment createPayment() { return PaymentType.NORMAL_WIRE_TRANSFER.payment; }

}
