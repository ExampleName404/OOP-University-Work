package Pr8;

abstract class AbstractTree implements Tree, Comparable<AbstractTree> {
    protected String name;
    protected double height;

    public AbstractTree(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public int compareTo(AbstractTree other) {
        return Double.compare(this.height, other.height);
    }

    @Override
    public String toString() {
        return name + " (Высота: " + height + " м)";
    }
}

// Подкласс ConiferousTree
class ConiferousTree extends AbstractTree {
    public ConiferousTree(String name, double height) {
        super(name, height);
    }

    @Override
    public void grow() {
        height += 0.5;
    }
}

// Подкласс DeciduousTree
class DeciduousTree extends AbstractTree {
    public DeciduousTree(String name, double height) {
        super(name, height);
    }

    @Override
    public void grow() {
        height += 0.3;
    }
}