package example.abstraction;

class Cat extends Animal {

	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
	void purr() {
        System.out.println("Cat purrs");
    }
}
