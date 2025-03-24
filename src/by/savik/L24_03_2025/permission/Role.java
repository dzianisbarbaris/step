package by.savik.L24_03_2025.permission;

import java.util.EnumSet;

public enum Role {
    GUEST(EnumSet.of(Permission.READ)),
    USER(EnumSet.of(Permission.READ, Permission.WRITE)),
    ADMIN(EnumSet.allOf(Permission.class));
    private final EnumSet<Permission> permissions;

    Role(EnumSet<Permission> permissions) {
        this.permissions = permissions;
    }

    public boolean hasPermissoin (Permission permission){
        return permissions.contains(permission);
    }

    public EnumSet<Permission> getPermissions() {
        return permissions;
    }
}
