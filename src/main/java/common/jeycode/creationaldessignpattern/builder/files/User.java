/**
 * 
 */
package common.jeycode.creationaldessignpattern.builder.files;

import java.util.Set;

public class User
{

      private String name,lastname,nickname,password;
      private Set<String> permissionList;

      protected User()
      {}

      public String getName()
      {
            return name;
      }

      public void setName(String name)
      {
            this.name = name;
      }

      public String getLastname()
      {
            return lastname;
      }

      public void setLastname(String lastname)
      {
            this.lastname = lastname;
      }

      public String getNickname()
      {
            return nickname;
      }

      public void setNickname(String nickname)
      {
            this.nickname = nickname;
      }

      public String getPassword()
      {
            return password;
      }

      public void setPassword(String password)
      {
            this.password = password;
      }

      public Set<String> getPermissionList()
      {
            return permissionList;
      }

      public void setPermissionList(Set<String> permissionList)
      {
            this.permissionList = permissionList;
      }

      @Override
      public String toString()
      {
            return "User [ " + name + " " + lastname + ", nick:" + nickname + ", pass:" + password + "]\n";
      }

}
