package com.demotivirus.Day_224;

import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@ToString
public class UserWithBuilder {
    private final String nickname;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Date created;

    public UserWithBuilder(UserBuilder builder) {
        this.nickname = builder.nickname;
        this.password = builder.password;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.created = builder.created;
    }

    public static UserBuilder getBuilder(String nickname, String password) {
        return new UserWithBuilder.UserBuilder(nickname, password);
    }

    @Getter
    @ToString
    public static final class UserBuilder {
        @NotNull(message = "Nickname not must be null")
        @Size(min = 3, max = 20, message = "Must be 3-20 symbols")
        private final String nickname;

        @NotNull(message = "Password not must be null")
        @Size(min = 3, max = 50, message = "Must be 3-50 symbols")
        private final String password;


        private final Date created;

        @NotNull(message = "FirstName not must be null")
        @Size(min = 3, max = 50, message = "Must be 3-50 symbols")
        private String firstName;

        @NotNull(message = "LastName not must be null")
        @Size(min = 3, max = 50, message = "Must be 3-50 symbols")
        private String lastName;

        @Email(message = "Email must be correct")
        private String email;

        public UserBuilder(String nickname, String password) {
            this.nickname = nickname;
            this.password = password;
            this.created = new Date();
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserWithBuilder build() {
            return new UserWithBuilder(this);
        }
    }
}
