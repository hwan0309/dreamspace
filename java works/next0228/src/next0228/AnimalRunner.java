package next0228;

public class AnimalRunner {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {	//animalSound -> AnimalSOund 자동타입변환
		animal.sound();	//재정의된 메소드 호출
	}

}
