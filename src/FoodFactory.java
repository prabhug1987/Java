
class Food {
	protected String name;

	public Food() {
		// TODO Auto-generated constructor stub
	}

	public Food(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void serveFood() {
		System.out.println("I am serving " + name);
	}
	
}

public class FoodFactory extends Food {

	public Food getFood(String type) {
		if (type.equals("FastFood")) {
			return new Food(type);
		} else if (type.equals("Fruit")) {
			return new Food(type);
		}
		return null;
	}

	public static void main(String[] args) {
		Food foodFactory = new FoodFactory();
		Food food1 = ((FoodFactory) foodFactory).getFood("Fruit");
		Food food2 = ((FoodFactory) foodFactory).getFood("FastFood");
		System.out.println(food1.getClass().getName());
		System.out.println(food2.getClass().getName());
		
		System.out.println(((FoodFactory)food2).getClass().getSuperclass());
		food1.serveFood();
		food2.serveFood();
	}

}
