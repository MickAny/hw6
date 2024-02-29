package gb.hw6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameProcess {
    Random random = new Random();
    List<Integer> doors;
    boolean victory;
    int victoryCellItem = 1;
    int count;




    public GameProcess() {
        doors = new ArrayList<>(Arrays.asList(0, 0, 0));
        doors.set(random.nextInt(0, 3), victoryCellItem);
        this.count = 0;
        this.victory = false;

        System.out.println("=".repeat(30));
        System.out.println(doors + " ");
        result(doors);
        System.out.println("Пользователь выиграл с " + count + " попытки");
    }

    public int result(List<Integer> list){
        int userChoice = random.nextInt(1, 4);
        System.out.println("Пользователь выбрал номер " + userChoice + "  ");

        if(doors.get(userChoice - 1) == 1){
            return count++;
        }else{
            for (int i = 0; i < doors.size(); i++) {
                if(i != (userChoice - 1) & doors.get(i) != 1){
                    doors.remove(i);
                    break;
                }
            }
            count++;
        }

        userChoice = random.nextInt(1, 3);

        if(doors.get(userChoice - 1) == 1){
            System.out.println("Пользователь поменял номер ");
            return count++;
        }else{
            System.out.println("Пользователь оставил прежний номер ");
            count += 2;
            return count;
        }
    }
}
