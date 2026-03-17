
/**
 * Write a description of class todomanager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class TaskItem {
    String name;
    String priority;
    JCheckBox check;
    JPanel panel;

    TaskItem(String n, String p) {
        name = n;
        priority = p;
        check = new JCheckBox(n);
        panel = new JPanel();
    }
}

public class TodoManager extends JFrame {

    JTextField taskField;
    JComboBox priorityBox;
    JPanel taskPanel;

    ArrayList<TaskItem> tasks = new ArrayList<>();

    public TodoManager() {

        setTitle("My ToDo Manager");
        setSize(700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("My ToDo Manager", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setOpaque(true);
        title.setBackground(new Color(200,210,230));
        add(title, BorderLayout.NORTH);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5,1,5,5));

        JButton allBtn = new JButton("All Tasks");
        JButton completedBtn = new JButton("Completed");
        JButton pendingBtn = new JButton("Pending");
        JButton importantBtn = new JButton("Important");

        leftPanel.add(allBtn);
        leftPanel.add(completedBtn);
        leftPanel.add(pendingBtn);
        leftPanel.add(importantBtn);

        add(leftPanel, BorderLayout.WEST);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();

        JLabel taskLabel = new JLabel("Task:");
        taskField = new JTextField(20);

        String p[] = {"High","Medium","Low"};
        priorityBox = new JComboBox(p);

        JButton addBtn = new JButton("Add Task");
        addBtn.setBackground(Color.GREEN);

        inputPanel.add(taskLabel);
        inputPanel.add(taskField);
        inputPanel.add(priorityBox);
        inputPanel.add(addBtn);

        centerPanel.add(inputPanel, BorderLayout.NORTH);

        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));

        JScrollPane scroll = new JScrollPane(taskPanel);
        centerPanel.add(scroll, BorderLayout.CENTER);

        add(centerPanel, BorderLayout.CENTER);

        JLabel footer = new JLabel("Developed using Java Swing", JLabel.CENTER);
        add(footer, BorderLayout.SOUTH);

        addBtn.addActionListener(e -> addTask());

        allBtn.addActionListener(e -> showAll());
        completedBtn.addActionListener(e -> showCompleted());
        pendingBtn.addActionListener(e -> showPending());
        importantBtn.addActionListener(e -> showImportant());

        setVisible(true);
    }

    void addTask() {

        String name = taskField.getText();
        String priority = priorityBox.getSelectedItem().toString();

        if(name.equals(""))
            return;

        TaskItem task = new TaskItem(name, priority);

        JButton del = new JButton("Delete");
        del.setBackground(Color.PINK);

        task.panel.add(task.check);
        task.panel.add(del);

        tasks.add(task);
        taskPanel.add(task.panel);

        del.addActionListener(e -> {
            tasks.remove(task);
            taskPanel.remove(task.panel);
            taskPanel.revalidate();
            taskPanel.repaint();
        });

        taskField.setText("");
        taskPanel.revalidate();
    }

    void showAll() {
        taskPanel.removeAll();
        for(TaskItem t : tasks)
            taskPanel.add(t.panel);
        refresh();
    }

    void showCompleted() {
        taskPanel.removeAll();
        for(TaskItem t : tasks)
            if(t.check.isSelected())
                taskPanel.add(t.panel);
        refresh();
    }

    void showPending() {
        taskPanel.removeAll();
        for(TaskItem t : tasks)
            if(!t.check.isSelected())
                taskPanel.add(t.panel);
        refresh();
    }

    void showImportant() {
        taskPanel.removeAll();
        for(TaskItem t : tasks)
            if(t.priority.equals("High"))
                taskPanel.add(t.panel);
        refresh();
    }

    void refresh() {
        taskPanel.revalidate();
        taskPanel.repaint();
    }

    public static void main(String[] args) {
        new TodoManager();
    }
}