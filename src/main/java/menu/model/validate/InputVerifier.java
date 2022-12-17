package menu.model.validate;

import menu.error.CoachErrorCode;
import menu.view.OutputView;

import java.util.List;

import static menu.error.CoachErrorCode.*;

/**
 * @author 최원용
 * @version 2.0.0
 * @Created by 최원용 on 2022. 12. 17.
 */

public class InputVerifier {

    public static boolean tryCoachNameIsMin2Max4(String coachName) {
        try {
            coachNameIsMin2Max4(coachName);
        } catch (IllegalArgumentException e) {
            OutputView.printError(e.getMessage());
            return false;
        }
        return true;
    }

    public static void coachNameIsMin2Max4(String coachName) {
        if (coachName.length() < 2 || 4 < coachName.length()) {
            throw new IllegalArgumentException(COACH_NAME_IS_MIN_2_MAX_4.getMessage());
        }
    }

    public static boolean tryCoachesCountMin2Max5(List<String> coachesName) {
        try {
            System.out.println("coachesName.size() = " + coachesName.size());
            coachesCountMin2Max5(coachesName.size());
        } catch (IllegalArgumentException e) {
            OutputView.printError(e.getMessage());
            return false;
        }
        return true;
    }

    private static void coachesCountMin2Max5(int size) {
        if (size < 2 || 5 < size) {
            throw new IllegalArgumentException(COACH_COUNT_MIN_2_MAX_5.getMessage());
        }
    }
}