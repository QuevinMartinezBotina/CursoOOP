class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("asd123", new Account("Juan Valez", "AD123"));
        /*
         * 
         * Esta es la manera de como se imprime sin constructor, al implementarl se
         * vuelve mas sencillo todo
         * 
         * car.license = "uz883"; car.driver = "Andre Herrera";
         */
        car.passegenger = 4;
        /* System.out.println("Car license:" + car.license); */
        car.printDataCar();

        Car car2 = new Car("QSD578", new Account("Juan Pinto", "JP456"));
        car2.passegenger = 8;
        /* System.out.println("Car2 license:" + car2.license); */
        car2.printDataCar();
    }
}