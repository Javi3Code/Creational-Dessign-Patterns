package common.jeycode.creationaldessignpattern.builder.files;

import java.util.HashSet;
import java.util.Set;

public abstract class UserBuilder
{

						protected User user;
						protected Set<String> permissionList = new HashSet<>();

						protected UserBuilder()
						{
												user = new User();
												permissionList.add("Buy products & Return products");
												permissionList.add("Write comments & Edit comments");
						}

						public UserBuilder name(String name)
						{
												user.setName(name);
												return this;
						}

						public UserBuilder lastname(String lastname)
						{
												user.setLastname(lastname);
												return this;
						}

						public UserBuilder nickname(String nickname)
						{
												user.setNickname(nickname);
												return this;
						}

						public UserBuilder password(String password)
						{
												user.setPassword(password);
												return this;
						}

						abstract void permissionList();

						public abstract User build();
}
