package com.example;

public class AppGraph {

  public static void main(String[] args) {

    // create graph
    Node prash = new Node("Prashant Singh");
    Node vinh = new Node("Vinh Nguyen");
    Node chi = new Node("Chi Tse");
    Node viv = new Node("Viviana Jaime");

    // add friends
    prash.addFriend(viv);
    viv.addFriend(chi);
    viv.addFriend(vinh);
    viv.addFriend(prash);
    vinh.addFriend(chi);
    vinh.addFriend(viv);

    // print graph
    prash.print();
    viv.print();
    vinh.print();
    chi.print();

  }
}
