package com.demotivirus.Day_225;

public class SwitchExample {
    public static void main(String[] args) {

    }

    private static Player createPlayer(PlayerTypes type) {
        switch (type) {
            case CHESS: return new ChessPlayer();
            case FOOTBALL: return new FootballPlayer();
            case BASKETBALL: return new BasketballPlayer();
            case TENNIS: return new TennisPlayer();
            case UNKNOWN:
            default: throw new IllegalArgumentException("Type is unknown");
        }
    }

    private static Player createPlayerNewSwitch(PlayerTypes type) {
        return switch (type) {
            case CHESS -> new ChessPlayer();
            case FOOTBALL -> new FootballPlayer();
            case BASKETBALL -> new BasketballPlayer();
            case TENNIS -> new TennisPlayer();
            case UNKNOWN -> throw new IllegalArgumentException("Type is unknown");
        };
    }

    private static Player createPlayerNewSwitch2(PlayerTypes type) {
        return switch (type) {
            case CHESS -> {
                System.out.println("Create chessmen");
                yield new ChessPlayer();
            }
            case TENNIS -> {
                System.out.println("Create tennis player");
                yield new TennisPlayer();
            }
            case FOOTBALL -> {
                System.out.println("Create football player");
                yield new FootballPlayer();
            }
            case BASKETBALL -> {
                System.out.println("Create basketball player");
                yield new BasketballPlayer();
            }
            case UNKNOWN -> {
                System.out.println("Player not create - unknown!");
                throw new IllegalArgumentException("unknown player");
            }
            default -> throw new IllegalArgumentException("unknown player");
        };
    }

    private static void createPlayerNewSwitch3(PlayerTypes type) {
        switch (type) {
            case CHESS, TENNIS -> System.out.println("Individual game");
            case UNKNOWN, FOOTBALL, BASKETBALL -> System.out.println("Command game");
        };
    }
}
