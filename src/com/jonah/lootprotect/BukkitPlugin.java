package com.jonah.lootprotect;

import com.jonah.lootprotect.cmd.LootProtectCommand;
import com.jonah.lootprotect.util.Col;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
//import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
//import java.util.stream.Collectors;

public class BukkitPlugin extends JavaPlugin implements Listener {

    private static BukkitPlugin bukkitPlugin;
    private Map<UUID, Item> itemMap;

    @Override
    public void onEnable() {
        bukkitPlugin = this;
        this.getCommand("lpt").setExecutor(new LootProtectCommand());
        itemMap = new HashMap<>();
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    public static BukkitPlugin getInstance() {
        return bukkitPlugin;
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player victim = event.getEntity();
        Player attacker = victim.getKiller();

        Bukkit.getPlayer("Sphro").sendMessage("Death of " + victim.getName());

    }

    @EventHandler
    public void onItemDropped(ItemSpawnEvent ev) {
        //Player p = (Player) ev.getEntity().getNearbyEntities(1, 1, 1).stream().filter(e -> e instanceof Player).collect(Collectors.toList());
        if (true) {

        } else {
            System.out.println("Hi");
        }

    }

}
