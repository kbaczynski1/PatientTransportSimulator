package classes;

import java.awt.geom.Point2D;

public class Node {
    private int id;
    private Point2D.Double cords;
    private boolean visited;

    Node(int ID, Point2D.Double cor, boolean vis){
        id = ID;
        cords = cor;
        visited = vis;
    }

    public int getId(){ return id;}
    public Point2D.Double getCords(){ return cords;}

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

}
