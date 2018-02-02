package io.katho.plugin.commands

import org.bukkit.command.{Command, CommandExecutor, CommandSender}
import org.bukkit.entity.Player

class Ping extends CommandExecutor {

  override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {

    if (sender.isInstanceOf[Player]) {
      sender.sendMessage("Just players can use this commands.")
      return true
    }

    val p : Player = sender.asInstanceOf[Player]
    if (command.getName.equals("ping")) {
        if (args.length == 0) {
          p.sendMessage("§ePong!!")
          return true
        } else {
          p.sendMessage("§c§lUSE: §c/ping")
          return true
        }
    }
    return false
  }
}
