class PersonalComputer{
    private Monitor monitor;
    private Computer computer;
    public PersonalComputer(Monitor monitor, Computer computer) {
        this.monitor = monitor;
        this.computer = computer;
    }
    public void turnOn(){computer.turnOn(); monitor.turnOn();}
    public void printInfo(){computer.printInfo(); monitor.printInfo();}
}
class Monitor{
    private String monitorSize;
    private String color;
    private String power;
    public Monitor(String monitorSize, String color, String power){
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){System.out.println("Turning on the monitor");}
    public void printInfo(){
        System.out.println("the spec of the monitor");
        System.out.println(" Size: " + monitorSize);
        System.out.println(" Color: " + color);
        System.out.println(" power: " + power);
    }
}
class Computer{
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;
    public Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }
    public void turnOn(){System.out.println("Turning on the computer");}
    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.println(" CPU: " + cpu);
        System.out.println(" Memory: " + memory);
        System.out.println(" HDD: " + hd);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}

public class Homework5 {
    public static void main(String[] args){
        PersonalComputer pc = new PersonalComputer(new Monitor("32inch", "Black", "45W"),
                new Computer("Core i7", "32GB", "2TB", "White", "700W"));
        pc.turnOn();
        pc.printInfo();
    }
}
