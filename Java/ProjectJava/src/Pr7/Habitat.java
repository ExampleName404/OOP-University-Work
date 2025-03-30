package Pr7;

class Habitat {
    private String name;
    private String location;

    public Habitat(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void describe() {
        System.out.println("Habitat: " + name + " located in " + location);
    }
}