package UI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public int getInt(String message) {
        System.out.println(message);
        int returnNumber = 0;
        try {
            returnNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("숫자 값을 입력해주세요.");
        }
        return returnNumber;
    }
    
    public String[] getCarNames(String message){
        System.out.println(message);
        String carNames = "";
        String[] returnNames = null;
        try {
            carNames = scanner.nextLine();
            validateStringVoid(carNames);
            returnNames = spliteCarNames(carNames);
        } catch (Exception e) {
            throw new IllegalArgumentException("올바른 값을 입력해주세요.");
        }
        return returnNames;
    }

    private void validateStringVoid(String s) {
        if (s == null || s.trim().isEmpty()) {
            throw new IllegalArgumentException("빈값을 입력받았습니다.");
        }
    }

    private String[] spliteCarNames(String carNames){
        String[] stplitedCarName = carNames.split(",");
        for (int i = 0; i < stplitedCarName.length; i++) {
            String carName = stplitedCarName[i].trim();
            validateStringVoid(carName);
            stplitedCarName[i] = carName;
        }
        return stplitedCarName;
    }

}
