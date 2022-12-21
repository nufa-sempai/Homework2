public class Main {
    public static void main(String[] args) {
        taskHw2();
    }
    public static void taskHw2 () {
//задача 1
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//задача 2
        System.out.println("\nЗадание 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//задача 3
        System.out.println("\nЗадание 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
//задача 4
        System.out.println("\nЗадание 4");
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);
//задача 5
        System.out.println("\nЗадание 5");
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);
//задача 6
        System.out.println("\nЗадание 6");
        var fighter1 = 72.2;
        var fighter2 = 82.7;
        System.out.println ("Вес бойца 1 = " + fighter1 + " кг");
        System.out.println ("Вес бойца 2 = " + fighter2 + " кг");
        var totalWeight = fighter1 + fighter2;
        System.out.println ("Общий вес бойцов - " + totalWeight + " кг");
        var differenceWeight = fighter1 - fighter2;
        System.out.println("Разница в весе бойцов - " + differenceWeight + " кг");
//задача 7
        System.out.println("\nЗадание 7");
//нахожу максимальное значение
        var maxWeight = Math.max(fighter1, fighter2);
        System.out.println(maxWeight);
//нахожу минимальное значение
        var minWeight = Math.min(fighter1, fighter2);
        System.out.println(minWeight);
        differenceWeight = maxWeight - minWeight;
        System.out.println("Разница в весе бойцов - " + differenceWeight + " кг");
        differenceWeight = maxWeight % minWeight;
        System.out.println("Разница в весе бойцов - " + differenceWeight + " кг");
//*** нахождение максимального и минимального значения через if
        if (fighter1 > fighter2) {
            differenceWeight = fighter1 - fighter2;
            System.out.println(differenceWeight);
        } else { differenceWeight = fighter2 - fighter1;
            System.out.println("\nРазница в весе бойцов - " + differenceWeight + " кг");
        }

//задание 8
        System.out.println("\nЗадание 8");
        var totalHours = 640;
        var workingDay = 8;
        var totalPerson = totalHours / workingDay;
        System.out.println("Всего работников в компании — " + totalPerson + " человек.");

        totalPerson = totalPerson + 94;
        totalHours = totalPerson * workingDay;
        System.out.println("Если в компании работает " + totalPerson + " человека, то всего "
                + totalHours + " часа работы может быть поделено между сотрудниками");

    }

}