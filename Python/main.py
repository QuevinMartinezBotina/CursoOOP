from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("AMS123", Account("Andres Paredes", "AD1"))
    print(vars(car))
    print(vars(car.driver))


""" if __name__ == "__main__":
    print("Hola mundo")

     Instanciando un objeto 1 
    car = Car()
    car.license = "AMS221"
    car.driver = "Benito Cruz"
    print(vars(car))

     Instanciando un objeto 2 
    car2 = Car()
    car2.license = "fgh123"
    car2.driver = "Pedro Velez"
    print(vars(car2)) """
