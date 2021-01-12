/**
 * 
 */
package common.jeycode.creationaldessignpattern.builder;

import common.jeycode.creationaldessignpattern.builder.files.User;
import common.jeycode.creationaldessignpattern.builder.files.UserFactory;
import common.jeycode.creationaldessignpattern.builder.files.UserFactory.Type;

public class BuilderPattern
{

						private final User user;

						public BuilderPattern()
						{

												user = UserFactory.getInstance()
																														.user(Type.PREMIUM)
																														.name("J.")
																														.lastname("Code")
																														.nickname("Javitxu")
																														.password("qwerty")
																														.build();

												showPermissionList();
						}

						private void showPermissionList()
						{
												var textBuilder = new StringBuilder(user.toString());
												createMessage(textBuilder);
												System.out.println(textBuilder.toString());
						}

						private void createMessage(StringBuilder textBuilder)
						{
												user.getPermissionList()
																.stream()
																.map(e-> e + "<br>")
																.forEach(textBuilder::append);
						}

						public static void main(String[] args)
						{
												new BuilderPattern();
						}
}
