
public class Mobile {
 public static void main (String args[]) {
  Subscriber subscriber1 = new Subscriber("Kashuba","+380343121712","Halych, Shevchenko 5",18);
  Subscriber subscriber2 = new Subscriber("Petrenko","+380342547266","Ivano-Frankivsk, Karpatska 15",20);
  Subscriber subscriber3 = new Subscriber();
  System.out.println(" Surname: "+subscriber1.getSurname()+", phone: "+subscriber1.getPhone()+", address: "+ subscriber1.getAddress()+", age: "+subscriber1.getAge());
  System.out.println(" Surname: "+subscriber2.getSurname()+", phone: "+subscriber2.getPhone()+", address: "+ subscriber2.getAddress()+", age: "+subscriber2.getAge());
  System.out.println(" Surname: "+subscriber3.getSurname()+", phone: "+subscriber3.getPhone()+", address: "+ subscriber3.getAddress()+", age: "+subscriber3.getAge());
  System.out.println(" SURNAME: "+subscriber1.getSurname().toUpperCase()+", PHONE: "+subscriber1.getPhone()+", ADDRESS: "+subscriber1.getAddress().toUpperCase()+" AGE: "+subscriber1.getAge());
  System.out.println(" SURNAME: "+subscriber2.getSurname().toUpperCase()+", PHONE: "+subscriber2.getPhone()+", ADDRESS: "+subscriber2.getAddress().toUpperCase()+" AGE: "+subscriber2.getAge());
  System.out.println(" SURNAME: "+subscriber3.getSurname().toUpperCase()+", PHONE: "+subscriber3.getPhone()+", ADDRESS: "+subscriber3.getAddress().toUpperCase()+" AGE: "+subscriber3.getAge());
  Subscriber[] database = {subscriber1,subscriber2,subscriber3};
  System.out.println("Array");
  for(int i=0;i<database.length;i++) {
	  System.out.println("Sequence number: "+Subscriber.getNumber()+", surname: "+database[i].getSurname()+", phone number: "+database[i].getPhone()+", address: "+database[i].getAddress()+", age: "+database[i].getAge());
  }
 }
}