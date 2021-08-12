package com.demotivirus.Day_224;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class TestUserBuilderWithValidation {
    private static final Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public static void main(String[] args) {
        UserWithBuilder.UserBuilder user1 = new UserWithBuilder.UserBuilder("mathcu-pikchu", "9fghs933s");

        UserWithBuilder.UserBuilder user2 = new UserWithBuilder.UserBuilder("lowa-lowa", "su(|)c*s")
                .setEmail("ilonMask.google.com");

        UserWithBuilder.UserBuilder user3 = new UserWithBuilder.UserBuilder("guest", "guest")
                .setLastName("guest")
                .setFirstName("guest")
                .setEmail("guest@guest.com");

        validation(user1);
        validation(user2);
        validation(user3);
    }

    private static void validation(UserWithBuilder.UserBuilder user) {
        final Set<ConstraintViolation<UserWithBuilder.UserBuilder>> violations = validator.validate(user);

        if (violations.isEmpty()) {
            UserWithBuilder newUser = user.build();
            System.out.println("User create success: " + newUser);
        }
        else System.err.println("Incorrect values: " + violations);
    }
}
