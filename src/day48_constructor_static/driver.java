package day48_constructor_static;

public class driver {


        private String name;

        public driver() {
        }

        public driver(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Driver{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
