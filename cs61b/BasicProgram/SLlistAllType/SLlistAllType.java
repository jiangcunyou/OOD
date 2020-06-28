package June.cs61b.BasicProgram.SLlistAllType;

public class SLlistAllType<LochNess> {
    private class StuffNode{
        public LochNess item;
        public StuffNode next;

        public StuffNode(LochNess i, StuffNode n){
            item = i;
            next = n;
        }
    }

    private StuffNode first;
    private int size;

    public SLlistAllType(LochNess l){
        first = new StuffNode(l,null);
        size = 1;
    }

    public void addFirst(LochNess l){
        first = new StuffNode(l,first);
        size += 1;
    }

    public LochNess getFirst(){
        return first.item;
    }

    public void addLast(LochNess l){
        size += 1;
        StuffNode p =  first;

        while (p.next != null){
            p = p.next;
        }
        p.next = new StuffNode(l,null);
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        SLlistAllType<String> s1 = new SLlistAllType<>("bone");
        s1.addFirst("check");
        s1.addLast("Down check.");

        while (s1.first != null){
            System.out.println(s1.first.item);
            s1.first = s1.first.next;
        }
    }
}
