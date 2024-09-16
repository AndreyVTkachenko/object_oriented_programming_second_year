package lesson.example_07;

public class Priest extends BaseHero {

    private int elixir;
    private int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.r.nextInt(101) + 100);  // Генерация числа от 100 до 200
        this.maxElixir = Magician.r.nextInt(101) + 50;  // Генерация числа от 50 до 150
        this.elixir = maxElixir;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
