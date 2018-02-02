package io.katho.plugin

import io.katho.plugin.commands.Ping
import org.bukkit.plugin.java.JavaPlugin

class Main extends JavaPlugin {

  override def onEnable(): Unit = {
    getLogger.info("Hello from scala plugin!!")
    getCommand("ping").setExecutor(new Ping())
  }


}
