package common.jeycode.creationaldessignpattern.factorymethod.files;

public class CreditCard extends AbstractPayment
{

						private static final String TICKET_MESSAGE = "Efectuado pago con Targeta con Éxito ";
						private static final String TICKET_NAME = "CreditCard.txt";

						protected CreditCard()
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
																		case "4567 3444  4545  3434":
																								message = SUCCES;
																								return true;
																		case "1233 1233 2133 1233":
																								message = SUCCES;
																								return true;
																		default:
																								message = ERROR;
																								return false;
												}
						}

}
