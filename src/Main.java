public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 25;
        System.out.println("Если возраст человека равен " + age + " то, " );
        if (age >= 18) {
            System.out.println("он совершеннолетний ");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 25;
        System.out.println("На улице " + temperature + " градусов, " );
        if (temperature <= 5) {
            System.out.println(" нужно надеть шапку ");
        } else {
            System.out.println("можно идти без шапки");
        }

        byte speed = 120;
        System.out.println("Если скорость " + speed + " км/ч,то " );
        if (speed <= 60) {
            System.out.println("можно ездить спокойно ");
        } else {
            System.out.println("придется заплатить штраф");
        }


        int ages =32;
        System.out.println("Если возраст человека равен " + ages + " ,то ");
        if (ages < 2) {
            System.out.println("ему пора спать. ");
        }
        if (ages >= 2 && ages <= 6) {
            System.out.println("ему нужно ходить в детский сад. ");
        }
        if (ages >= 7 && ages <= 18) {
            System.out.println("то ему нужно ходить в школу. ");
        }
        if (ages > 18 && ages < 24) {
            System.out.println("его место в университете. ");
        }
        if (ages > 24 && ages <= 60) {
            System.out.println("ему пора ходить на работу. ");
        }
        if (ages > 60) {
            System.out.println("он может отдохнуть. ");
        }


        int ageOfTheChild = 13;
        System.out.println("Если возраст ребенка равен "+ageOfTheChild+" то, ");
        if (ageOfTheChild < 5) {
            System.out.println("он не может кататься на аттракционе. ");
        }
        if (ageOfTheChild >= 5 && ageOfTheChild < 14) {
            System.out.println("он может кататься только в сопровождении взрослого. ");
        }
        if (ageOfTheChild > 14) {
            System.out.println("он может кататься без сопровождения взрослого. ");
        }


        int passengers = 122;
        System.out.println("Если в вагоне " + passengers+" пассажиров, то ");
        if (passengers < 60) {
            System.out.println("Есть сидячие места");
        }
        if (passengers >=60 && passengers < 120) {
            System.out.println("остались только стоячие места");
        }
        if (passengers == 120) {
            System.out.println("вагон полностью забит");
        }


        int one = 14;
        int two = 17;
        int three = 13;
        System.out.println(one);
        if (one>two && one>three) {
            System.out.println("первое число больше второго и третьего");
        }
        if (three>two && one<three) {
            System.out.println("третье число больше второго и первого");
        }
        if (one<two && two>three) {
            System.out.println("второе число больше первого и третьего");
        }




    }
}