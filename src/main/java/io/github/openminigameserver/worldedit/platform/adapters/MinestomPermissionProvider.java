package io.github.openminigameserver.worldedit.platform.adapters;

import net.minestom.server.entity.Player;

public class MinestomPermissionProvider {
    public static boolean hasPermission(Player player, String permission) {
        if (player.hasPermission("*") || player.hasPermission("worldedit.*") || player.getPermissionLevel() >= 4)
            return true;
        return player.hasPermission(permission);
    }

    public static boolean hasWorldEditPermission(Player player) {
        return player.hasPermission("*") || player.hasPermission("worldedit") || player.getPermissionLevel() >= 4;
    }

}
