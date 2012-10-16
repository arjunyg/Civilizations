
package com.carboncraft.civilizations;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

import org.bukkit.ChatColor;

import com.massivecraft.factions.FLocation;

import com.massivecraft.factions.event.LandClaimEvent;

public class LandClaimListener implements Listener {

    @EventHandler (priority = EventPriority.NORMAL)
    public void onLandClaim(LandClaimEvent event) {
        FLocation loc = event.getLocation();
        event.getFPlayer().getPlayer().sendMessage(ChatColor.RED+loc.getCoordString());
    }
}
