package by.savik.L24_03_2025.permission;

import java.util.EnumMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        EnumMap<Role, Integer> roleEnumMap = new EnumMap<>(Role.class);

        roleEnumMap.put(Role.USER, 10);
        roleEnumMap.put(Role.GUEST, 30);
        roleEnumMap.put(Role.ADMIN, 3);

        System.out.println("Количество пользователей по ролям");
        for (Map.Entry<Role, Integer> entry : roleEnumMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Role user = Role.USER;
        for (Permission permission : user.getPermissions()) {
            System.out.println(permission + " : " + permission.getDescription());
        }

        boolean hasDeletePermission = user.hasPermissoin(Permission.DELETE);
        System.out.println(hasDeletePermission);

        for (Role value : Role.values()) {
            System.out.println(value.name());
        }

        int ordinal = user.ordinal();
        System.out.println(ordinal);


    }
}
