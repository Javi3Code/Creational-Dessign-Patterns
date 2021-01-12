package common.jeycode.creationaldessignpattern.builder.files;

public class DefaultUserBuilder extends UserBuilder
{

      protected DefaultUserBuilder()
      {
            super();
      }

      @Override
      void permissionList()
      {
            permissionList.add("Change nickname only one time");
            permissionList.add("Pay for shipping");
            user.setPermissionList(permissionList);
      }

      @Override
      public User build()
      {
            permissionList();
            return user;
      }

}
