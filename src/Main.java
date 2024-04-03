import Models.User;

public class Main {
    public static void main(String[] args) {
        User sergey = new User("Сергій", 11, 2, 1990, "sergey@gmail.com",
                513212943L, "Дулгер", 75, 120, 10000);
        User stepan = new User("Степан", 3, 12, 1991, "stepan@gmail.com",
                574923743L, "Євчук", 87, 120, 15000);
        User maksim = new User("Максим", 30, 5, 1986, "maksim@gmail.com",
                419034123L, "Волков", 91, 130, 6000);
        User artem = new User("Артем", 22, 9, 1977, "artem@gmail.com",
                621743273L, "Слободянюк", 68, 110, 1000);
        User dmitro = new User("Дмитро", 4, 3, 1995, "dmitro@gmail.com",
                519302654L, "Титар", 70, 115, 20000);
        sergey.printAccountInfo();
        stepan.printAccountInfo();
        maksim.printAccountInfo();
        artem.printAccountInfo();
        dmitro.printAccountInfo();
        sergey.setPressure(115);
        sergey.setWeight(70);
        sergey.setNumberOfStepsTakenPerDay(10000);
        sergey.printAccountInfo();
        stepan.setSurname("Корольов");
        stepan.setWeight(62);
        stepan.setPressure(120);
        stepan.setNumberOfStepsTakenPerDay(11000);
        stepan.printAccountInfo();
    }
}