package common;

import java.util.UUID;

public class Product {
public String id;
public String title;
public int cost;
public Product(String title,int cost){

            UUID uuid = UUID.randomUUID(); ;
            this.id = uuid.toString();
    this.cost = cost;
    this.title = title;
}

public String toDispl() {
    return "{"+id+"} " + title + ", cost " + cost;
}

}

