package common.jeycode.creationaldessignpattern.builder.files;

public class PremiumUserBuilder extends UserBuilder {

						public PremiumUserBuilder() {}

						@Override
						void permissionList() {
												permissionList.add("Change nickname ten times");
												permissionList.add("Free shipping");
												permissionList.add("Discounts");
												user.setPermissionList(permissionList);
						}

						@Override
						public User build() {
												permissionList();
												return user;
						}

}
