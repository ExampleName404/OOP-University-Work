package Pr10;

public class RoleSystemDemo {
    public static void main(String[] args) {
        AdminRole admin = new AdminRole();
        ModeratorRole moderator = new ModeratorRole();
        BasicUserRole user = new BasicUserRole();

        admin.printPermissions();
        System.out.println();

        moderator.printPermissions();
        System.out.println();

        user.printPermissions();
        System.out.println();

        System.out.println("Does moderator have DELETE permission? " + moderator.hasPermission(Permission.DELETE));
    }
}