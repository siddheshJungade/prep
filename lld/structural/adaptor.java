public abstract class BasePizz {
    public abstract int const();
} 

public class VegPizza extends BasePizza {
    public int cost() {
        return 100;
    }
}
public class NonVegPizza extends BasePizza {
    public int cost() {
        return 150;
    }
}

public abstract class TopingDecorator extends BasePizza {

}
public class ExtraCheese extends TopingDecorator {
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return basePizza.cost() + 10;
    }
}
public class ExtraVeggies extends TopingDecorator {
    BasePizza basePizza;
    public ExtraVeggies(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return basePizza.cost() + 20;
    }
}
public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new VegPizza();
        System.out.println(basePizza.cost());

        basePizza = new ExtraCheese(basePizza);
        System.out.println(basePizza.cost());

        basePizza = new ExtraVeggies(basePizza);
        System.out.println(basePizza.cost());
    }
}