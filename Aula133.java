package aula13.pkg3;

public class Aula133 {
    
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert("Danilo");
        list.insert("Lucas");
       list.insert("Matheus");
       list.insert("Kaua");
       list.insert("Danilo");
        System.out.println("Lista completa: ");
                list.print();
               System.out.println("Qual o tamanho da lista? "+list.size());
               System.out.println("Lista esta vazia? "+list.isEmpty());
               System.out.println("Posicao de "+list.indexOf("Danilo"));
               System.out.println("Quantas vezes aparece Danilo? "+list.count("Danilo"));
        }
    }
