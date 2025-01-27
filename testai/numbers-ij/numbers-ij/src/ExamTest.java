import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.test.BaseTest;

public class ExamTest extends BaseTest {
    @java.lang.Override
    protected Exercises createExercises() {
        return new ExercisesImpl();
    }
}
