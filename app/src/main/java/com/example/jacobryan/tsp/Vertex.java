package com.example.jacobryan.tsp;

import java.util.LinkedList;

/**
 * Created by JacobRyan on 5/4/17.
 */

public class Vertex
{
    private LinkedList<Edge> theEdges = new LinkedList<Edge>();
    private Vertex root;

    public Vertex(Vertex root)
    {
        this.root = root;
    }

    public void addEdge(Vertex destination, int weight)
    {
        this.theEdges.add(new Edge(destination, weight));
    }
}
