package Method;

class MathodOverloding {
    // int id;
    // String name;

    void color() {
        System.out.println("There is no color there");
    }

    void color(int id, String name) {
        System.out.println("id=" + id + " " + "name=" + name);

    }

    public static void main(String[] args) {
        MathodOverloding obj = new MathodOverloding();
        obj.color();
        obj.color(28, "shoaibv");

    }
}
