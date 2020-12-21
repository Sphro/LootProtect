package com.jonah.lootprotect.util;

import org.bukkit.ChatColor;

import java.util.List;
import java.util.stream.Collectors;

public final class Col {

    private Col(){}

    public static String text(String toColor) {
        return ChatColor.translateAlternateColorCodes('&', toColor);
    }

    public static List<String> text(List<String> toColor) {
        return toColor.stream().map(s -> text(s)).collect(Collectors.toList());
    }

}
