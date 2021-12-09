package io.github.monun.sample.plugin

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

/**
 * 초농이는 바보
 */
class SamplePlugin : JavaPlugin() {
    override fun onEnable() {

        logger.info("asdf")
        Bukkit.getPluginManager().registerEvents(Events(), this)

    }

    override fun onDisable() {

        logger.info("plugin is disable")

    }
}