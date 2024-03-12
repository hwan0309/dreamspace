package next0228;

public abstract class Phone {
String owner;

Phone(String owner){
	this.owner = owner;
}

void turnOn(){
	System.out.println("power on");
}
void turnOff() {
	System.out.println("power off");
}
}
