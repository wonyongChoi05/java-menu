package menu.view;

import camp.nextstep.edu.missionutils.Console;

/**
 * @author 최원용
 * @version 2.0.0
 * @Created by 최원용 on 2022. 12. 17.
 */

public class InputView {

    public static String getCoaches() {
        OutputView.printInputCoach();
        String coaches = Console.readLine();
        return coaches;
    }
}