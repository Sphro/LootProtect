package com.jonah.lootprotect.cmd;

import com.jonah.lootprotect.util.Col;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class LootProtectCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        commandSender.sendMessage(Col.text("&aLootProtect by Jonah Madsen"));

        return true;
    }
}
