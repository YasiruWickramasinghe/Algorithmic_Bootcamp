package Data_Structures._4_Trees._1_Binary_Trees._1_Binary_Tree;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     BinaryTree tree = new BinaryTree();
     tree.populate(scanner);
     tree.prettyDisplay();
  }
}