package sermon;

public class DemoInheritance {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("Phuc", "lmht721@gmail.com", "English");
        System.out.println(childClass.getName());
        childClass.setName("Cong");
        System.out.println(childClass.getName());
        childClass.play();
        childClass.play("LMHT");
        childClass.say();
    }
}
