package unit5_TestCollections.Inheritance;

import Unit4Assessemnt.B;

    public class Test extends B {

        public static void main(String[] args) {

            data obj = new data();
            obj.setName("Cybertek");
            System.out.println(obj.getName());
        }
    }
    class data {
        private String name;

        public  String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }

