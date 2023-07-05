import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void isExpired() throws URISyntaxException, IOException, ParseException, InterruptedException{
        Task task1 = new Task("タスク1", "2023/06/06");
        assertTrue(task1.isExpired());
        Task task2 = new Task("タスク2", "2023/05/26");
        assertTrue(task2.isExpired());
        Task task3 = new Task("タスク3", "2023/12/26");
        assertFalse(task3.isExpired());
        Task task4 = new Task("タスク4", "2023/06/07");
        assertFalse(task4.isExpired());
    }

    @Test
    void countToDeadLineDate() throws ParseException{
        Task task1 = new Task("タスク1", "2023/06/10");
        assertEquals(3,task1.countToDeadLineDate());
    }
    @Test
    void onDeadLine() throws URISyntaxException, IOException, ParseException, InterruptedException {
        Calendar c1 = Calendar.getInstance();
        Task task1 = new Task("タスク1", DateUtil.toYYYYMMDD(c1));
        assertTrue(task1.onDeadLine());
        Calendar c2 = Calendar.getInstance();
        c2.add(Calendar.DAY_OF_MONTH, 1);
        Task task2 = new Task("タスク2", DateUtil.toYYYYMMDD(c2));
        assertFalse(task2.onDeadLine());
    }
    @Test
    void getTotalActualTime() {
        Task task1 = new Task("タスク1", "2023/05/26");
        task1.actualMinuteTime = 30;
        Task task2 = new Task("タスク2", "2023/05/29");
        task2.actualMinuteTime = 20;
        Task task3 = new Task("タスク3", "2023/05/31");
        task3.actualMinuteTime = 10;
        Task[] tasks1 = {task1, task2, task3};
        assertEquals(60, Task.getTotalActualTime(tasks1));
        Task[] tasks2 = {task1, task2};
        assertEquals(50, Task.getTotalActualTime(tasks2));
        Task[] tasks3 = {};
        assertEquals(0, Task.getTotalActualTime(tasks3));
    }


    @Test
    void sum() {
        int[] arr1 = {10,20,30};
        assertEquals(60, Task.sum(arr1));
        int[] arr2 = {0,10,15};
        assertEquals(25, Task.sum(arr2));
    }
}