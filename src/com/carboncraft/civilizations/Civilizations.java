/*
 * Copyright (C) 2012 Arjun Govindjee.
 */

package com.carboncraft.civilizations;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Server;

import java.util.logging.Logger;
import java.util.logging.Level;

import java.io.IOException;

public class Civilizations extends JavaPlugin {

    private final Logger log = Logger.getLogger("Minecraft.Civilizations");
    private Server server;
  
    public void onEnable() {
        log.setLevel(Level.INFO);
        server = getServer();
    }

    public void onDisable() {
    }
}
