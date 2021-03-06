package join.security;


import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Size;

public class UserForm {
    @NotNull
    @Size(min=3, max=30)
    private String username;

    @NotNull
    @Size(min=4, max=30)
    private String password;


    @NotNull
    @Size(min=6, max=60)
    @Email
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserForm{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
