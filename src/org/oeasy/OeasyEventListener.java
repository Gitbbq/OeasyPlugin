package org.oeasy;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;



public final class OeasyEventListener implements Listener{
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage("welcome "+event.getPlayer().getName());
        Player player = event.getPlayer(); // The player who joined
        PlayerInventory inventory = player.getInventory(); // The player's inventory
        ItemStack itemstack = new ItemStack(Material.DRAGON_EGG, 1); // A stack of diamonds
            
        // if (inventory.contains(itemstack)) {
        inventory.addItem(itemstack); // Adds a stack of diamonds to the player's inventory
        player.sendMessage("Welcome! You seem to be reeeally rich, so we gave you some more diamonds!");
        //}
    }
    
}