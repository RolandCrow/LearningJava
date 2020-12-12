package StreamAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class CurrentProcessInfo {
    public static void main(String[] args) {
        ProcessHandle current = ProcessHandle.current();
        printInfo(current);

    }




    public static void printInfo(ProcessHandle handle) {
        long pid = handle.pid();
        boolean isAlive = handle.isAlive();

        ProcessHandle.Info info = handle.info();
        String command = info.command().orElse("");
        String[] args = info.arguments().orElse(new String[]{});
        String commandLine = info.commandLine().orElse("");
        ZonedDateTime startTime = info.startInstant().orElse(Instant.now())
                .atZone(ZoneId.systemDefault());
        Duration duration = info.totalCpuDuration()
                            .orElse(Duration.ZERO);
        String owner = info.user().orElse("Unknown");
        long childrenCount = handle.children().count();

        System.out.printf("PID: %d%n", pid);
        System.out.printf("isALive: %d%n", isAlive);
        System.out.printf("Команда: %s%n", command);
        System.out.printf("Аргумент: %s%n", Arrays.toString(args));
        System.out.printf("Командная строка: %s%n", commandLine);
        System.out.printf("Время запуск: %s%n", startTime);
        System.out.printf("Время ЦП: %s%n", duration);
        System.out.printf("Владелец: %s%n", owner);
        System.out.printf("Число прямых потомков: %d%n", childrenCount);


    }


}
