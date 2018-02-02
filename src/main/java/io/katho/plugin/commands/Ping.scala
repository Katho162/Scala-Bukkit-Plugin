package io.katho.plugin.commands

import org.bukkit.command.{Command, CommandExecutor, CommandSender}
import org.bukkit.entity.Player
import org.bukkit.ChatColor

class Ping extends CommandExecutor {

  override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {

    if (sender.isInstanceOf[Player]) {
      sender.sendMessage("Just players can use this commands.")
      return true
    }

    val p : Player = sender.asInstanceOf[Player]
    if (command.getName.equals("ping")) {
        if (args.length == 0) {
          p.sendMessage(s"${ChatColor.YELLOW}Pong!!")
          return true
        } else {
          p.sendMessage(s"${ChatColor.RED}${ChatColor.BOLD}USE: ${ChatColor.RED}/ping")
          return true
        }
    }
    return false
  }
}
