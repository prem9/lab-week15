package com.example;

// node for a graph
class Node {

  final int maxFriend = 5;

  private String name;
  private int numFriend;
  private Node friend[];

  // constructor
  Node(String s) {
    this.name = s;
    friend = new Node[maxFriend];
  }

  // getter for the value of the node
  public String name() {
    return name;
  }

  // add a node
  public void addFriend(Node f) {
    if (f != this) {
      if (numFriend < maxFriend) {
        // add node
        friend[numFriend] = f;
        numFriend++;
      } else {
        System.out.printf(
          "ERROR: You have reached the maximum allowable friends in our network."
        );
      }
    } else {
      System.out.printf("ERROR: %s can not friend yourself.", name);
    }
  }

  // print
  public void print() {
    // print all of a nodes friends
    System.out.printf("node name = %s has the friends:\n", name);
    if (numFriend == 0) {
      System.out.printf("\t[No friends]\n");
    } else {
      for (int i = 0; i < numFriend; i++) {
        if (friend[i] != null) {
          System.out.printf("\t%s\n", friend[i].name());
        }
      }
    }
  }
}
