public class Cat {
	private String name;
	private int appetite;
	private boolean fullness;
	public Cat(String name, int appetite) {
		this.name = name;
		this.appetite = appetite;
		this.fullness = false;
	}
	public void eat(Plate p) {
		int food = p.getFood();
		p.decreaseFood(appetite);
		if (p.getFood() + appetite == food){
			appetite = 0;
			fullness = true;
		}
	}
	
	public int getAppetite() {
		return appetite;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isFullness() {
		return fullness;
	}
}
