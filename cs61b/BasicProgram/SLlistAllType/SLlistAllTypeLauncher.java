package June.cs61b.BasicProgram.SLlistAllType;

public class SLlistAllTypeLauncher {
    public static void main(String[] args) {
        SLlistAllType<String> s1 = new SLlistAllType<>("bone");
        s1.addFirst("check");
        s1.addLast("Down check.");

        for (int i = 0; i < s1.size(); i++) {
            System.out.println(s1.getFirst());

        }
    }
}
