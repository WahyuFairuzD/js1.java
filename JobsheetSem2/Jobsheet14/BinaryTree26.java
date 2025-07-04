package Jobsheet14;

public class BinaryTree26 {
   Node26 root;

   public BinaryTree26() {
      root = null;
   }

   public boolean isEmpty() {
      return root == null;
   }

   public void add(Student26 data) {
      if (isEmpty()) {
         root = new Node26(data);
      } else {
         Node26 current = root;
         while (true) {
            if (data.ipk < current.data.ipk) {
               if (current.left != null) {
                  current = current.left;

               } else {
                  current.left = new Node26(data);
                  break;
               }
            } else if (data.ipk > current.data.ipk) {
               if (current.right != null) {
                  current = current.right;

               } else {
                  current.right = new Node26(data);
                  break;
               }
            } else {
               break;

            }
         }
      }
   }

   public boolean find(double ipk) {
      boolean result = false;
      Node26 current = root;
      while (current != null) {
         if (current.data.ipk == ipk) {
            result = true;
            break;
         } else if (ipk < current.data.ipk) {
            current = current.left;
         } else {
            current = current.right;
         }
      }
      return result;
   }

   public void traversePreOrder(Node26 node) {
      if (node != null) {
         node.data.print();
         traversePreOrder(node.left);
         traversePreOrder(node.right);

      }
   }

   public void traverseInOrder(Node26 node) {
      if (node != null) {
         traverseInOrder(node.left);
         node.data.print();
         traverseInOrder(node.right);
      }
   }

   public void traversPostOrder(Node26 node) {
      if (node != null) {
         traversPostOrder(node.left);
         traversPostOrder(node.right);
         node.data.print();

      }
   }

   Node26 getSuccessor(Node26 del){
         Node26 successor = del.right;
         Node26 successorParent = del;
         while (successor.left != null) 
         successorParent = successor;
         successor = successor.left;
if(successor != del.right)

   {
      successorParent.left = successor.right;
      successor.right = del.right;
   }return successor;
   }

   public void delete(double ipk) {
      if (isEmpty()) {
         System.out.println("Tree is empty");
         return;

      }
      Node26 parent = root;
      Node26 current = root;
      boolean isLeftChild = false;
      while (current.data.ipk != ipk) {
         parent = current;
         if (ipk < current.data.ipk) {
            isLeftChild = true;
            current = current.left;

         } else {
            isLeftChild = false;
            current = current.right;
         }
         if (current == null) {
            System.out.println("Couldnt find data!");
            return;
         }
      }
      // delete node with no children
      if (current.left == null && current.right == null) {
         if (current == root) {
            root = null;
         } else if (isLeftChild) {
            parent.left = null;
         } else {
            parent.right = null;
         }
      } else if (current.right == null) {// delete node with a left child
         if (current == root) {
            root = current.left;
         } else if (isLeftChild) {
            parent.left = current.left;
         } else {
            parent.right = current.left;
         }
      } else if (current.left == null) {// delete node with a right child
         if (current == root) {
            root = current.right;
         } else if (isLeftChild) {
            parent.left = current.right;
         } else {
            parent.right = current.right;
         }
      } else {// delete node with 2 children
         Node26 successor = getSuccessor(current);
         if (current == root) {
            root = successor;
         } else if (isLeftChild) {
            parent.left = successor;
         } else {
            parent.right = successor;
         }
         successor.left = current.left;
      }
   }
}
