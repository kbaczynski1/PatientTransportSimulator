package classes;

import java.awt.geom.Point2D;
import java.util.Comparator;

public class Boundary {
    protected int id;
    protected String name;
    protected Point2D.Double cords;

    Boundary(int id, String name, Point2D.Double cords){
        this.id = id;
        this.name = name;
        this.cords = cords;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Point2D.Double getCords() {
        return cords;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + name + "\tCords: " + cords.getX() + "\t" + cords.getY();
    }

    public static Comparator<Boundary> SortByXAsc = new Comparator<Boundary>(){
        public int compare(Boundary one, Boundary two) {
            return Double.compare(one.getCords().getX(), two.getCords().getX());
        }
    };

    public static Comparator<Boundary> SortByYAsc = new Comparator<Boundary>() {
        public int compare(Boundary one, Boundary two) {
            return Double.compare(one.getCords().getY(), two.getCords().getY());
        }
    };

    public static Comparator<Boundary> SortByXDesc = new Comparator<Boundary>(){
        public int compare(Boundary one, Boundary two) {
            return Double.compare(two.getCords().getX(), one.getCords().getX());
        }
    };

    public static Comparator<Boundary> SortByYDesc = new Comparator<Boundary>() {
        public int compare(Boundary one, Boundary two) {
            return Double.compare(two.getCords().getY(), one.getCords().getY());
        }
    };

}