package common.jeycode.creationaldessignpattern.factorymethod.files;

public class NormalWireTransfer extends AbstractPayment
{

						private static final String TICKET_MESSAGE = "Efectuada transferencia";
						private static final String TICKET_NAME = "Transfer.txt";

						protected NormalWireTransfer()
						{
												super();
												setTicketMessage(TICKET_MESSAGE);
												setTicketName(TICKET_NAME);
						}

						@Override
						protected boolean checkDatabase()
						{
												switch (variable)
												{
																		case "ES124144241213":
																								message = SUCCES;
																								return true;
																		case "BA324432432412313":
																								message = SUCCES;
																								return true;
																		default:
																								message = ERROR;
																								return false;
												}
						}

}
