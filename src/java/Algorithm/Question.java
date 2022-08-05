package java.Algorithm;
import java.util.HashSet;
public class Question {

    void deleteDuplicate(LinkList ll){
      HashSet<Integer> hs = new HashSet();
      Node current = ll.head;
      Node previous = null;
      while (current != null){
        int currVal = current.value;
        if(hs.contains(currVal)){
          previous.next = current.next;
          ll.size--;
        }else{
          hs.add(currVal);
          previous = current;
        }
        current = current.next;
      }
    }
    // nth to the last time
    Node nthToLast(LinkList ll, int n){
        Node p1 = ll.head;
        Node p2 = ll.head;
        for (int i = 0; i<n; i++){
            if(p2 == null) return null;
            p2 = p2.next;
        }
        while (p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    // partitioning
    LinkList partition(LinkList ll, int x){
        Node currentNode = ll.head;
        ll.tail = ll.head;
        while (currentNode != null){
            Node next = currentNode.next;
            if(currentNode.value < x ){
                currentNode.next = ll.head;
                ll.head = currentNode;
            }else{
                ll.tail.next = currentNode;
                ll.tail = currentNode;
            }
            currentNode = next;
        }
        ll.tail.next = null;
        return ll;
    }

    // sum of Two linkedList
    LinkList sumList(LinkList llA, LinkList llB){
        Node n1 = llA.head;
        Node n2 = llB.head;
        int carry = 0;
        LinkList resultLL = new LinkList();
        while (n1 != null || n2 != null){
            int result = carry;
            if(n1 != null){
                result += n1.value;
                n1 = n1.next;
            }
            if(n2 != null){
                result += n2.value;
                n2 = n2.next;
            }
            resultLL.insertNode(result%10);
            carry = 10;
        }
        return resultLL;

    }
//
    Node getKthNode(Node head, int k){
        Node current = head;
        while(k>0 && current != null){
            current = current.next;
            k--;
        }
        return current;
    }


  }