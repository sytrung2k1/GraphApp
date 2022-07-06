package hedspi.oop.group6.Model;

public class Vertex {
    private int id;
    private int color = -1 ;
    // 0 là đỏ 1 là xanh -1 là chưa tô
    public Vertex() {
    }

    public Vertex(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public boolean equals(Vertex v) {
    	return this.id == v.getId();
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        String i = String.valueOf(this.getId());
        return i;
    }
}
