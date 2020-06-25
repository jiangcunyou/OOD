/** Something about how to make a list with pointer and space for storage numbers and next pointer.*/
package cs61b.BasicProgram.SLlist;

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

    public static void main(String[] args) {
        IntList L1 = new IntList(5, null);
        SLlist L2 = new SLlist(5);
        L2.addFirst(10);
        L2.addFirst(15);


        System.out.println(L2.getFirst());
    }
}
