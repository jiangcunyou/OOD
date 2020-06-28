/** Something about how to make a list with pointer and space for storage numbers and next pointer.*/
package June.cs61b.BasicProgram.SLlist;

public class SLlist {
    public IntNode first;

    public SLlist(int x){
        first = new IntNode(x,null);
    }

    public void addFirst(int x){
        /**Add to front line of the code*/
        first = new IntNode(x, first);
    }

    public int getFirst(){
        /**Retrieves the front item from the list.*/
        return first.item;
    }

//    public int getLast(IntNode p){
//        while (p.next != null)
//            p = p.next;
//
//        return p.item;
//    }
//    public int getLast(){
//        return getLast(first);
//    }

    public void addLast(int x){
        IntNode p = first;
        while (p.next != null){
            p = p.next;
        }

        p.next = new IntNode(x,null);
    }

    public int getLast(){
        while(first.next != null){
            first = first.next;
        }
        return first.item;
    }

    private static int size(IntNode p){
        if (p.next ==null)
            return 1;

        return 1 + size(p.next);
    }

    public int size(){
        return size(first);
    }


    public static void main(String[] args) {
        IntList L1 = new IntList(5, null);
        SLlist L2 = new SLlist(5);
        L2.addFirst(10);
        L2.addFirst(15);
        L2.addLast(25);
        L2.addLast(100);

        System.out.println(L2.first.item);
        System.out.println(L2.getLast());

    }
}
