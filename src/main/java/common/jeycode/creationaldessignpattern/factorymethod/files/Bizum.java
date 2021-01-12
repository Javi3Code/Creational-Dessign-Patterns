package common.jeycode.creationaldessignpattern.factorymethod.files;

public class Bizum extends AbstractPayment {

						private static final String TICKET_MESSAGE = "SMS->Su Bizum se ha realizado";
						private static final String TICKET_NAME = "Bizum.txt";

						protected Bizum() {
												super();
												setTicketMessage(TICKET_MESSAGE);
												setTicketName(TICKET_NAME);
						}

						@Override
						protected boolean checkDatabase() {
												switch (variable) {
																		case "654344555":
																								message = SUCCES;
																								return true;
																		case "708945999":
																								message = SUCCES;
																								return true;
																		default:
																								message = ERROR;
																								return false;
												}
						}

}
