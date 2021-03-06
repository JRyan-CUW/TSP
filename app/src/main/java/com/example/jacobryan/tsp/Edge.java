package com.example.jacobryan.tsp;

/**
 * Created by JacobRyan on 5/4/17.
 */

public class Edge
{
    private Vertex destination;
    private int weight;

    public Edge(Vertex destination, int weight)
    {
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex getDestination()
    {
        return destination;
    }

    public int getWeight()
    {
        return weight;
    }
}
