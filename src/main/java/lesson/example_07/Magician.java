package lesson.example_07;

public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(101) + 100);  // Генерация числа от 100 до 200
        this.maxMana = Magician.r.nextInt(101) + 50;  // Генерация числа от 50 до 150
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}
