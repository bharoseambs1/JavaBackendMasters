package com.satish.java8features;

import java.util.List;

@FunctionalInterface
public interface CricketInfoFI {
    List<String> getPlayerNames(List<Player> players);
}