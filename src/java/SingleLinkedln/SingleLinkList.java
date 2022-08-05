public class SingleLinkList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList (int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;

      }

    // insertion algorithm explained
    // nodeValue location value and node location; 
    // create a node
    // assign value
    // check if head is null insert at the beginning
    // if not null check location = first, node.next = head head = node
    // if lastLocation node.next = null; last.next = node; tail = node
    // if location not first or last loop, current.next = node; node.next = nextNode
    public void insertInLinkList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
          createSingleLinkedList(nodeValue);
          return;
        } else if (location == 0) {
          node.next = head;
          head = node;
        } else if (location >= size) {
          node.next = null;
          tail.next = node;
          tail = node;
        }else {
          Node tempNode = head;
          int index = 0;
          while (index < location - 1) {
            tempNode = tempNode.next;
            index++;
        }
        Node nextNode = tempNode.next;
        tempNode.next = node;
        node.next = nextNode;
      }
      size++;
     }

     public void transverseSinglyLinkListList(){
        if(head == null){
          System.out.println("SLL does not exist");
        }else {
          Node tempNode = head;
          for(int i = 0; i<size; i++){
            System.out.print(tempNode.value);
            if(i != size - 1){
              System.out.print("->");
            }
            tempNode = tempNode.next;
          }
        }
        System.out.println("\n");
      }
}   