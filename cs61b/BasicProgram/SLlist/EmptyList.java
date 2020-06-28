package June.cs61b.BasicProgram.SLlist;

public class EmptyList {
    public IntNode first;
    private int size;

    public EmptyList(){
        first = null;
        size = 0;
    }

    public void addFirst(int x){
        /**Add to front line of the code*/
        first = new IntNode(x, first);
        size += 1;
    }

    public int getFirst(){
        /**Retrieves the front item from the list.*/
        return first.item;
    }

    public void addLast(int x){
        size += 1;
        IntNode p = first;
        while (p.next != null){
            p = p.next;
        }

        p.next = new IntNode(x,null);
    }

    public int size(){
        return size;
    }


    public static void main(String[] args) {
        IntList L1 = new IntList(5, null);
        SLlist L2 = new SLlist(5);
        L2.addLast(100);


    }
}
