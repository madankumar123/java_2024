

    class Circle{
        public int radius;
        Circle(){                                           //default constructor
            System.out.println("I am non param of circle");
        }
        Circle(int r){
            System.out.println("I am circle parameterized constructor");
            this.radius = r;
        }

        public double area(){
            return Math.PI*this.radius*this.radius;
        }
    }

    class Cylinder1 extends Circle{
        public int height;
        Cylinder1(int r, int h){
            super(r);
            System.out.println("I am cylinder1 parameterized constructor");
            this.height = h;
        }
        public double volume(){
            return Math.PI*this.radius*this.radius*this.height;
        }
    }
    public class WAP_CH10_PracticrSet {
        public static void main(String[] args) {
            // Problem 1
            // Circle objC = new Circle(12);
            Cylinder1 obj = new Cylinder1(12, 4);

            //prblm 2
            System.out.println(obj.volume());
            System.out.println(obj.area());
        }
    }

