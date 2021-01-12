package common.jeycode.creationaldessignpattern.builder.files;

import java.util.Objects;

public final class UserFactory
{

						private static UserFactory instance;

						private UserFactory()
						{}

						public static UserFactory getInstance()
						{
												instance = Objects.isNull(instance) ? new UserFactory() : instance;
												return instance;
						}

						public UserBuilder user(Type user)
						{
												return user.getUser();
						}

						public enum Type
						{

							DEFAULT(new DefaultUserBuilder()),
							PREMIUM(new PremiumUserBuilder());

												private UserBuilder user;

												Type(UserBuilder user)
												{
																		this.user = user;
												}

												public UserBuilder getUser()
												{
																		return user;
												}
						}

}
