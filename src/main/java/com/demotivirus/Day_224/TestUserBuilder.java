package com.demotivirus.Day_224;

public class TestUserBuilder {
    public static void main(String[] args) {
        UserWithBuilder user1 = UserWithBuilder.getBuilder("mathcu-pikchu", "9fghs933s")
                .build();

        UserWithBuilder user2 = UserWithBuilder.getBuilder("lowa-lowa", "su(|)c*s")
                .setEmail("ilonMask@google.com")
                .build();

        UserWithBuilder user3 = UserWithBuilder.getBuilder("guest", "guest")
                .setLastName("guest")
                .setFirstName("guest")
                .setEmail("guest@guest.com")
                .build();
    }
}
