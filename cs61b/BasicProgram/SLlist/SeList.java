package June.cs61b.BasicProgram.SLlist;

public class SeList {
    private IntNode sentinel;
    private int size;

    public SeList(){
        sentinel = new IntNode(63,null);
        size = 0;
    }

    public SeList(int x){
        sentinel = new IntNode(63,null);
        sentinel.next = new IntNode(x,null);
        size = 1;
    }

    public void addFirst(int x){
        sentinel.next = new IntNode(x,sentinel.next);
        size = size + 1;
    }

    public int getFirst(){
        return sentinel.next.item;
    }

    public void addLast(int x){
        size = size + 1;
        IntNode p = sentinel;
        while (p.next != null){
            p = p.next;
        }

        p.next = new IntNode(x,null);

    }

    public int size()
    {
        return size;
    }

    public static void main(String[] args) {
        SeList L = new SeList();
        L.addLast(20);
        System.out.println(L.size());

    }
}
