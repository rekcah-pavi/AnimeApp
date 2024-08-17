class Link{
    int id;
    Link next;

    public Link(int id){
        this.id = id;
    }

}


class Linklist{
    private Link first;

    public Linklist(){
        this.first = null;
    }

    public Link getFirst(){
        return first;
    }

    public boolean isEmpty(){
        return first == null;
    } 

    public void print(){
        Link current = first;
        while(current != null){
            System.out.println(current.id);
            current = current.next;
        }

    }

    public void insertFirst(int id){
        Link tmp = new Link(id);
        tmp.next = first;
        first = tmp;
    }

    public void insertLast(int id){
        Link tmp = new Link(id);
        if (isEmpty()){
            first = tmp;
            return;
        }
        Link current = first;
        while(current.next!= null){           
            current = current.next;
        }
        
        current.next = tmp;

    }

    public Link deleteFirst(){
        if (isEmpty()){
            System.out.println("Error linked list is empty");
            return null;
        }
        Link tmp = first;
        first = first.next;
        return tmp;
    }

    public void insertBefore(int target,int id){
        if (isEmpty()){
            System.out.println("Error linked list is empty");
            return;
        }

        if (first.id == target){
            insertFirst(id);
            return;
        }

        Link current = first;
         while(current.next!= null){
            if(current.next.id == target){
                Link tmp = new Link(id);
                tmp.next = current.next;
                current.next = tmp;
                return;

            }
            current = current.next;
         }
        
        System.out.println("Error target id not found");

    }

    public Link find(int id){
        if (isEmpty()){
            System.out.println("Error linked list is empty");
            return null;
        }

        Link current = first;
        while(current != null){
            if(current.id == id){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Link delete(int id){
        if (isEmpty()){
            System.out.println("Error linked list is empty");
            return null;
        }


        if (first.id == id){
            return deleteFirst();
        }



        Link current = first;
        while(current.next != null){
            if(current.next.id == id){
                Link tmp = current.next;
                current.next = current.next.next;
                return tmp;
            }
            current = current.next;
        }

        System.out.println("Id not found");
        return null;



    }

    


}

class test{
    public static void main(String args[]){
        Linklist a = new Linklist();
        
        a.insertLast(8);
        a.insertLast(9);
        a.insertLast(10);
        a.deleteFirst();
        a.insertBefore(10,55);
        a.delete(10);
        a.delete(9);
        a.insertLast(80);
        a.insertFirst(90);
        Link dd = a.find(80);
        if (dd != null){
            System.out.println("found"+dd.id);
        }
        
        a.print();
        
    }
}