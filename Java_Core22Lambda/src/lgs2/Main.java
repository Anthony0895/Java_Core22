package lgs2;

public class Main {
	public static void main(String[] args) {

		Amphibia fish = new Frog("shark");
		System.out.println(fish);

		fish.eat();
		fish.sleep();
		fish.walk();
		fish.swin();
	}
}
