public class Variant {
    class People{
        String name, lastname;
        int age;
        void getInfo(){
            System.out.println("Я " + this.lastname +" " + this.name +". Мне " + this.age +" ");
        }
        void walk(){
            System.out.println("Я умею ходить");
        }
        void voice(){
            System.out.println("Я умею кричать");
        }
        void run(){
            System.out.println("Я умею бегать");
        }
        People(){
            name= "Default";
            lastname = "Default";
            age = 0;
        }
        People(String name, String lastname, int age ){
            this.age=age;
            this.lastname=lastname;
            this.name=name;
        }
    }
    class Student extends People{
        Student(String name, String lastname, int age ){
            super(name, lastname,age);
        }
        void learn(){
            System.out.println("Я умею учиться");
        }
    }
    class Teacher extends People{
        Teacher(String name, String lastname, int age ){
            super(name, lastname,age);
        }
        void teach(){
            System.out.println("Я умею учить");
        }
    }

    public class Lab8 {
        public static void main(String[] args) {
            People Nobody = new People();
            Nobody.getInfo();
            Nobody.run();
            Nobody.voice();
            Nobody.walk();
            System.out.println();

            People Daniil = new People("Daniil","Davydov",19 );
            Daniil.getInfo();
            Daniil.run();
            Daniil.voice();
            Daniil.walk();
            System.out.println();

            Student Deky = new Student("Deky","Midoriya",16);
            Deky.getInfo();
            Deky.run();
            Deky.voice();
            Deky.walk();
            Deky.learn();
            System.out.println();

            Teacher Aizawa = new Teacher("Shota","Aizawa",30);
            Aizawa.getInfo();
            Aizawa.run();
            Aizawa.voice();
            Aizawa.walk();
            Aizawa.teach();
            System.out.println();
        }
    }
}
