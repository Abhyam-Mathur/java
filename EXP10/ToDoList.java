// File: ToDoList.java
import javax.swing.*;

public class ToDoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        JScrollPane scroll = new JScrollPane(list);
        scroll.setBounds(50, 100, 200, 150);

        JTextField taskField = new JTextField();
        taskField.setBounds(50, 50, 200, 30);

        JButton addButton = new JButton("Add");
        addButton.setBounds(270, 50, 80, 30);

        JButton removeButton = new JButton("Remove");
        removeButton.setBounds(270, 100, 80, 30);

        addButton.addActionListener(e -> {
            String task = taskField.getText();
            if (!task.isEmpty()) {
                model.addElement(task);
                taskField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selected = list.getSelectedIndex();
            if (selected != -1) {
                model.remove(selected);
            }
        });

        frame.add(taskField);
        frame.add(addButton);
        frame.add(removeButton);
        frame.add(scroll);
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
