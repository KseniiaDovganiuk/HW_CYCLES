package ru.netology.javaqa.javaqamvn.services;

public class Main {
    public static void main(String[] args) {
        CalculateVacationService service = new CalculateVacationService();

        int income = 100_000;     // Доход
        int expenses = 60_000;    // Обязательные месячные траты
        int threshold = 150_000;  // Порог для отпусков

        // Вычисление количества месяцев отдыха
        int vacation = CalculateVacationService.calculateMonthOfVacation(income, expenses, threshold);

        // Вывод результата
        System.out.println("Количество месяцев отдыха: " + vacation);
    }
}