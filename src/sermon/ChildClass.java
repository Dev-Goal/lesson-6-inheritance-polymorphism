package sermon;

public class ChildClass extends ParentClass{
    private String language;
    public ChildClass(String name, String email, String language) {
        super(name, email);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void play() {
        System.out.println("Playing game...");
    }

    public void play(String name) {
        System.out.println("Playing game..." + name);
    }

//    @Override
//    public void say() {
//        System.out.println("Hi");
//    }
}
