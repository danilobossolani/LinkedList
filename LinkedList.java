package aula13.pkg3;

public class LinkedList {
    Node head = null;
    
    void insert(String value){
        Node node = new Node(); //|Cria novo nó|
        node.data = value;
        node.next = head; //|Após ele, vira o 1st elemento da lista
        
        head = node;//|Novo nó passa a ser o 1st|
       }
    void print(){
        Node n = head;
//|Começa pelo 1st da Lista|

        while (n != null){
            System.out.println(n.data + " -> ");
            n = n.next;//-> Aponta para o prox|
        }
        System.out.println("null");
    }
    //Remover
    void remove(String value) {
        if (head == null)
            return;
///|Encerra se a lista tiver vazia|
        
        
        if(value.equals(head.data)){
            head = head.next;
            return;
//| Verifica se é o primeiro da Lista |
            
        }
        Node n = head;
        
        while(n.next != null){
            if( value.equals(n.next.data)){
                n.next = n.next.next;
//|Se Encontrou, aponta para o seguinte DESTE,
//Dessa forma, Pulando ESTE|
                return;
            }
            n = n.next;
        }
    }
   //|BUSCA|//
    Node find(String value){
        Node n = head;
        
        while(n != null){
            if (value.equals(n.data)){
                return n;
            }
            n = n.next;
        }
        return null;
    }
    void append(String value){
        Node novoNo = new Node();
        novoNo.data = value;
        novoNo.next = null;
        
        if (head == null){
            head = novoNo;
            return; 
                    }
        Node Last = head;
        while(Last.next != null){
            Last = Last.next;
        }
        Last.next = novoNo;
        }
    int size(){
        int contador = 0;
        Node Last = head;
        while(Last != null){
            Last = Last.next;
            contador++;
        }
        return contador;
                }
    boolean isEmpty(){
        if(head == null){
             return true;
        }
        return false;
    }
    int indexOf(String value){
        int posicao=1;
        Node n = head;
        while(n != null){
            if(value.equals(n.data)){
                return posicao;
        } posicao++;
                    n = n.next;
        } return -1;
         }   
    int count(String value){
        Node n = head;
        int contador=0;
        while(n != null){
           if(value.equals(n.data)){
               contador++;
           }
            n = n.next;

        }
         return contador;
    }
}
    
    