//клас, що описує абонента
public class Subscriber {
 private String surname;
 private String phone;
 private String address;
 private int age;
 private static int number=0;
 public static int getNumber() { //отримання порядкового номера об'єкта
	return ++number;
}
public String getSurname() { //отримання прізвища абонента
  return surname;
 }
 public void setSurname(String surname) { //присвоєння прізвища абонентові, враховуючи, що прізвище не може бути коротшим за 2 символи
	 if(surname.length()>1) {
		 this.surname = surname;
	 }
	 else {
		 System.out.println("Surname is incorrect for subscriber!");
	 }
 }
 public String getPhone() { //отримання номера телефону абонента
  return phone;
 }
 public void setPhone(String phone) { //присвоєння номера телефону обонентові, враховуючи, що номер складається з 13 символів
	 if(phone.length()==13) {
		 this.phone = phone;
	 }
	 else {
		 System.out.println("Phone number is incorrect for subscriber!");
	 }
 }
 public String getAddress() { //отримання адреси абонента
  return address;
 }
 public void setAddress(String address) { //присвоєння адреси абонентові, враховуючи, що адреса складається щонайменше з 6 символів
	 if(address.length()>5) {
		 this.address = address;
	 }
	 else {
		 System.out.println("Address is incorrect for subscriber!");
	 }
 }
 public int getAge() { //отримання віку абонента
  return age;
 }
 public void setAge(int age) { //присвоєння віку абонентові, враховуючи, що вік людини може бути лише цілим додатнім числом
	 if(age>-1) {
		 this.age = age;
	 }
	 else {
		 System.out.println("Age is incorrect for subscriber!");
	 }
 }
 Subscriber (){ //конструктор за замовчуванням
  surname ="last name";
  phone="‎+380123456789";
  address="home";
  age=0;
 }
 Subscriber (String s, String p, String ad, int ag){ //конструктор, коли значення всіх полів задано
  surname=s;
  phone=p;
  address=ad;
  age=ag;
 }
}