package io.github.monun.sample.plugin

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class Events: Listener {

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        val p: Player = e.player

        p.sendMessage("hello" + p.name)
    }

}