import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

class AppointmentScheduler {

    private final static DateTimeFormatter scheduleParser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private final static DateTimeFormatter descriptionParser = DateTimeFormatter.ofPattern(
            "'You have an appointment on' EEEE, MMMM d, yyyy, 'at' h:mm a."
    );

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, scheduleParser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return descriptionParser.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }

}
