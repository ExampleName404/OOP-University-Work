package Pr10;

public interface PermissionChecker {
    boolean hasPermission(Permission permission);
    void printPermissions();
}