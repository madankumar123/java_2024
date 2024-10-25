//public

class CHP_47_ThisKeyword {
        int x;

        //    getter of x
        public  int getX(){
            return  x;
        }

        // Constructor with a parameter
        CHP_47_ThisKeyword(int x) {
            this.x = x;
        }

        // Call the constructor
        public static void main(String[] args) {
            CHP_47_ThisKeyword obj1 = new CHP_47_ThisKeyword(65);
            System.out.println(obj1.getX());

        }
    }

