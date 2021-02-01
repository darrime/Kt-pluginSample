package com.darrime.Test

import org.bukkit.plugin.java.JavaPlugin



class test: JavaPlugin() {
    override fun onEnable() {
        logger.info("Kt plugin enabled")
    }

    override fun onDisable() {
        logger.info("Kt plugin disabled")
    }
}