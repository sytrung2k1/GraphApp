package hedspi.oop.group6.Model;

public class Edge {
    private Vertex from;
    private Vertex to;
    private int weight;

    public Edge() {
    }

    public Edge(Vertex from, Vertex to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex getFrom() {
        return from;
    }

    public void setFrom(Vertex from) {
        this.from = from;
    }

    public Vertex getTo() {
        return to;
    }

    public void setTo(Vertex to) {
        this.to = to;
    }
    
    @Override
    public String toString(){
        return "Edge: " + this.getFrom() + " - " + this.getTo() + " : " + this.getWeight();
    }
}
