public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 27;
        if (age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил, и нужно немного подождать.");

        } else if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием");
        }
        System.out.println("Задача 2");
        int age2 = 7;
        if (age2 >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        } else if (age2 >= 18) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } else if (age2 >= 7) {
            System.out.println("ребенок ходит в школу");
        }

        System.out.println("Задача 3");
        int vagonPlaces = 102;
        int sittingPlaces = 60;
        int stayingPlaces = vagonPlaces - sittingPlaces;
        int passengerCount = 110;
        if (passengerCount <= sittingPlaces) {
            sittingPlaces = sittingPlaces - passengerCount;
            if (sittingPlaces != 0) {
                System.out.println("Сидячих мест: " + sittingPlaces + " стоячих мест " + stayingPlaces);
            }
        } else {
            passengerCount = passengerCount - sittingPlaces;
            sittingPlaces = 0;
            if (passengerCount <= stayingPlaces) {
                stayingPlaces = stayingPlaces - passengerCount;
                System.out.println("Сидячих мест " + sittingPlaces + ". стоячих мест " + stayingPlaces);
            } else {
                passengerCount = passengerCount - stayingPlaces;
                System.out.println("вагон уже забит полностью. " + passengerCount + " пассажиров не попали в вагон");
            }
        }
        System.out.println("Задача №4");
        int ageHuman = 3;
        if (ageHuman > 24) {
            System.out.println("ребенку пора ходить на работу");
        } else if (ageHuman > 7 && ageHuman < 18) {
            System.out.println("ребенку нужно ходить в школу");
        } else if (ageHuman > 18 && ageHuman < 24) {
            System.out.println("ребенку место в университете");
        } else if (ageHuman > 2 && ageHuman < 6) {
            System.out.println("ребенку нужно ходить в детский сад");
        }

        System.out.println("Задача №5");
        int childAge = 1;
        if(childAge > 14){
            System.out.println("ребенок может кататься без сопровождения взрослого");
        } else if (childAge >5 && childAge < 14 ) {
            System.out.println("ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (childAge < 5) {
            System.out.println("Ребенку кататься нельзя");

            System.out.println("Задача №6");
            int one = 1;
            int two = 2;
            int free = 3;
            if (one < free && two < free ){
            System.out.println("наибольшее число равно "+free);
            } else if (one > two && one > free) {
                System.out.println("Наибольшее число равно " + one);
            } else if (two > one && two > free) {
                System.out.println("Наибольшее число равно "+two);
            }

        }
        }
            
        }












