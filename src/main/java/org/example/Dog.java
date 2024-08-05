package org.example;

public class Dog extends Pet{
    private boolean vac;
    private String kind;

    public Dog(){
        vac = false;
        kind = "";
    }

    public Dog(String name, int age, String kind){
        super(name, age);
        this.kind = kind;
        vac = false;
    }

    public boolean isVac() {
        return vac;
    }

    public void setVac(boolean vac) {
        this.vac = vac;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {

        return "이름: " + getName() + "\n" +
                "나이: " + getAge() + "\n" +
                "품종'" + kind + "'\n" +
                (vac ? "예방주사를 맞았다," : "예방주사를 맞지 않았았다");
    }
}
