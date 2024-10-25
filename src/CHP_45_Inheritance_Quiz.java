
    class Base{
        public int x;

        public int getX() {
            return x;
        }
        public void setX(int x) {
            System.out.println("I am in base and setting x now");
            this.x = x;
        }
    }

    class Derived extends Base{
        public int y;

        public int getY() {
            return y;
        }
        public void setY(int y) {
            this.y = y;
        }
    }
    public class CHP_45_Inheritance_Quiz {
        public static void main(String[] args) {
            // Creating an Object of base class
            Base b = new Base();
            b.setX(4);
            System.out.println(b.getX());

            // Creating an object of derived class
            Derived d = new Derived();
            d.setY(42);                         // derived
            System.out.println(d.getY());

            d.setX(41);                            //base
            System.out.println(d.getX());
        }
    }
//    I am in base and setting x now   base
//    4                                 base
//    42                                 derived
//    I am in base and setting x now     derived base
//    41                                  derived base
