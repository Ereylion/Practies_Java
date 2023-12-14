package Pr_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Working_File {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = "data.txt";

        try {
            while (true) {
                System.out.println("\nМеню:");
                System.out.println("1. Записать информацию в файл");
                System.out.println("2. Вывести информацию из файла");
                System.out.println("3. Заменить информацию в файле");
                System.out.println("4. Добавить текст в конец файла");
                System.out.println("5. Выход");

                System.out.println("Введите номер команды из меню:");
                String input = reader.readLine();
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        // Запись информации в файл
                        FileWriter fileWriter = new FileWriter(filePath);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                        System.out.println("Введите информацию для записи в файл:");
                        input = reader.readLine();

                        bufferedWriter.write(input);

                        bufferedWriter.close();
                        fileWriter.close();
                        System.out.println("Информация успешно записана в файл.");
                        break;

                    case 2:
                        // Вывод информации из файла на экран
                        FileReader fileReader = new FileReader(filePath);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);

                        System.out.println("\nИнформация из файла:");
                        String line;
                        while ((line = bufferedReader.readLine()) != null) {
                            System.out.println(line);
                        }

                        bufferedReader.close();
                        fileReader.close();
                        break;

                    case 3:
                        // Замена информации в файле
                        System.out.println("\nВведите новую информацию для замены в файле:");
                        input = reader.readLine();

                        fileWriter = new FileWriter(filePath, false); // Очистка файла
                        bufferedWriter = new BufferedWriter(fileWriter);

                        bufferedWriter.write(input);

                        bufferedWriter.close();
                        fileWriter.close();
                        System.out.println("Информация успешно заменена в файле.");
                        break;

                    case 4:
                        // Добавление текста в конец исходного файла
                        System.out.println("\nВведите текст для добавления в конец файла:");
                        input = reader.readLine();

                        fileWriter = new FileWriter(filePath, true); // Добавление в конец файла
                        bufferedWriter = new BufferedWriter(fileWriter);

                        bufferedWriter.newLine(); // Новая строка перед добавляемым текстом
                        bufferedWriter.write(input);

                        bufferedWriter.close();
                        fileWriter.close();
                        System.out.println("Текст успешно добавлен в конец файла.");
                        break;

                    case 5:
                        // Выход из программы
                        System.out.println("Выход из программы.");
                        return;

                    default:
                        System.out.println("Неверный номер команды. Пожалуйста, выберите команду из меню.");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Произошла ошибка при закрытии потока ввода: " + e.getMessage());
            }
        }
    }
}
