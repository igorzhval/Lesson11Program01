package Models;

public class User {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final long phoneNumber;
    private String surname;
    private int weight;
    private int pressure;
    private int numberOfStepsTakenPerDay;

    public void printAccountInfo() {
        System.out.println("Клієнт:");
        System.out.printf("Ім'я: %s, Прізвищє: %s, Дата народження: %d.%d.%d, \nВік: %d, Телефон: %d, Емейл: %s, \n" +
                        "Вага: %d, Тиск: %d, Кількість пройдених за день кроків: %d\n", name, surname,
                dayOfBirth, monthOfBirth, yearOfBirth, getAge(), phoneNumber, email, weight,
                pressure, numberOfStepsTakenPerDay);
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getNumberOfStepsTakenPerDay() {
        return numberOfStepsTakenPerDay;
    }

    public void setNumberOfStepsTakenPerDay(int numberOfStepsTakenPerDay) {
        this.numberOfStepsTakenPerDay = numberOfStepsTakenPerDay;
    }

    public int getAge() {
        int age = 2020 - getYearOfBirth();
        return age;
    }

    public User(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, long phoneNumber,
                   String surname, int weight, int pressure, int numberOfStepsTakenPerDay) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numberOfStepsTakenPerDay = numberOfStepsTakenPerDay;
    }

}