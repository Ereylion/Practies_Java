package Pr_17;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class LabClassUI extends JFrame {

    private ArrayList<Student> students;
    private JTable studTable;

    public LabClassUI(ArrayList<Student> students){
        // Создание окна
        super("Студенты");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(840, 680);
        setLocationRelativeTo(null);

        this.students = students;

        // Создание кнопок
        JPanel pN = new JPanel(new FlowLayout());
        JButton addStudentBtn = new JButton("Добавить студента");
        JButton remStudentBtn = new JButton("Удалить студента");
        JButton findStudentBtn = new JButton("Найти студента");
        JButton sortBtn = new JButton("Сортировать по среднему баллу");

        pN.add(addStudentBtn);
        pN.add(remStudentBtn);
        pN.add(findStudentBtn);
        pN.add(sortBtn);

        addStudentBtn.addActionListener(e -> {
            try {
                addBtnClicked();
            }catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        remStudentBtn.addActionListener(e-> remBtnClicked());

        findStudentBtn.addActionListener(e->{
            try{
                findBtnClicked();
            }catch (StudentNotFoundException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });
        sortBtn.addActionListener(e -> {
            sortStudents(Student.AVG_COMP);
        });

        Object[] headers = new String[] {"ФИО", "Возраст", "Группа", "Средний балл"};
        Object [][] startStudents = new String[students.size()][4];
        for(int i = 0; i < students.size(); i++){
            startStudents[i][0] = students.get(i).getFio();
            startStudents[i][1] = ((Integer)(students.get(i).getAge())).toString();
            startStudents[i][2] = ((Integer)(students.get(i).getGroupNum())).toString();
            startStudents[i][3] = ((Integer)(students.get(i).getAvgPoint())).toString();
        }
        studTable = new JTable( new DefaultTableModel(startStudents, headers)){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };

        JTableHeader header = studTable.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);

        // Adding comps
        getContentPane().add(new JScrollPane(studTable), BorderLayout.CENTER);

        getContentPane().add(pN, BorderLayout.NORTH);

        setVisible(true);
    }
    //Метод сортировки по среднему баллу
    private void sortStudents(Comparator<Student> comp) {
        Student temp;
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i-1;
            for(; j >= 0 && comp.compare(current, students.get(j)) < 0; j--) {
                students.set(j+1, students.get(j));
            }
            students.set(j+1, current);
        }
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < students.size(); i++) {
            dtm.addRow(new Object[]{students.get(i).getFio(), students.get(i).getAge(), students.get(i).getGroupNum(), students.get(i).getAvgPoint()});
        }
    }
    //Метод нахождения студента по фио
    private void findBtnClicked() throws StudentNotFoundException {
        String s = JOptionPane.showInputDialog("Введите искомые ФИО");
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getFio().equals(s)){
                JOptionPane.showMessageDialog(this, "Найден студент: "+
                        students.get(i).toString());
                return;
            }
        }
        throw new StudentNotFoundException(s);
    }
    //Метод удаления студента
    private void remBtnClicked() {
        int c = studTable.getSelectedRowCount();
        if(c != 1) {
            JOptionPane.showMessageDialog(this, "Выберете ровно одну строку!");
            return;
        }
        c = studTable.getSelectedRow();
        students.remove(c);
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();
        dtm.removeRow(c);
    }
    //Метод добавления студента
    private void addBtnClicked() throws IllegalArgumentException {
        String fio = JOptionPane.showInputDialog("Пожалуйста, введите фио!");
        if(fio.equals("")) throw new EmptyStringException();
        String age = JOptionPane.showInputDialog("Пожалуйста, введите возраст!");
        String group = JOptionPane.showInputDialog("Пожалуйста, введите номер группы!");
        String avg = JOptionPane.showInputDialog("Пожалуйста, введите средний балл!");

        int avgI =0;
        int groupI = 0;
        int ageI =0;
        try {
            avgI = Integer.parseInt(avg);
            groupI = Integer.parseInt(group);
            ageI = Integer.parseInt(age);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Невозможно строку "+e.getMessage().substring(17) + " в число!");
        }

        students.add(new Student(fio, avgI, groupI, ageI));

        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        dtm.addRow(new Object[]{fio, age, group, avg});
    }
}
