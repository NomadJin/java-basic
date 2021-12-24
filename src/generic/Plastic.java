package generic;

public class Plastic extends Material{

    public String toString() {
        return "재료는 Plastic 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic 프린팅입니다.");
    }
}
