package models;
import static com.google.common.base.MoreObjects.toStringHelper;
import com.google.common.base.Objects;
public class User 
{
  static long counter=01;
  public Long id;
  public String firstName;
  public String lastName;
  public String email;
  public String password;
  
  

  
  @Override  
  public int hashCode()  
  {  
     return Objects.hashCode(this.lastName, this.firstName, this.email, this.password);  
  }

  public User()
  {
	  
  }

  public User(String firstName, String lastName, String email, String password)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.id=counter++;
  }
  @Override
  public String toString()
  {
	  return toStringHelper(this).addValue(id)
			  .addValue(firstName)
			  .addValue(lastName)
			  .addValue(password)
			  .addValue(email)
			  .toString();
  }
  
}

