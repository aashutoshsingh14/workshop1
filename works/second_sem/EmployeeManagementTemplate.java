import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class EmployeeManagementTemplate extends JFrame {

    private ArrayList<Employee> employees = new ArrayList<>();
    private JLabel headerLabel;
    private JTextField empIdField, nameField, salaryField;
    private JRadioButton fullTime, partTime, contract;
    private JCheckBox healthInsurance, dentalInsurance, retirementPlan;
    private JComboBox<String> departmentBox;
    private JTextArea displayArea;
    private JLabel charCountLabel, mousePositionLabel, statusLabel;

    public EmployeeManagementTemplate() {
        setTitle("Employee Management System");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 700);

        // ===== Header =====
        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headerLabel = new JLabel("<html><h1>Employee Management System</h1></html>");
        header.add(headerLabel);
        header.setBackground(new Color(70, 130, 200));
        headerLabel.setForeground(Color.WHITE);
        add(header, BorderLayout.NORTH);

        // Header Mouse Effects
        header.addMouseListener(new MouseAdapter() {
            Color originalColor = header.getBackground();
            String originalText = headerLabel.getText();

            @Override
            public void mouseEntered(MouseEvent e) {
                headerLabel.setText("<html><h1>Employee Records View</h1></html>");
                header.setBackground(new Color(255, 140, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                headerLabel.setText(originalText);
                header.setBackground(originalColor);
            }
        });

        // ===== Sidebar =====
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setPreferredSize(new Dimension(200, 0));
        sidebar.setBackground(new Color(240, 240, 240));
        sidebar.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

        JButton addBtn = new JButton("Add Employee");
        JButton viewBtn = new JButton("View Employees");
        JButton updateBtn = new JButton("Update Employee");
        JButton deleteBtn = new JButton("Delete Employee");
        JButton searchBtn = new JButton("Search Employee");

        JButton[] sidebarButtons = {addBtn, viewBtn, updateBtn, deleteBtn, searchBtn};
        for (JButton btn : sidebarButtons) {
            btn.setFocusPainted(false);
            btn.setBackground(new Color(200, 200, 200));
            btn.setForeground(Color.BLACK);
            btn.setOpaque(true);
            btn.setBorderPainted(false);
            btn.addMouseListener(new MouseAdapter() {
                Color originalBg = btn.getBackground();
                Color originalFg = btn.getForeground();

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(Color.GREEN);
                    btn.setForeground(Color.WHITE);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(originalBg);
                    btn.setForeground(originalFg);
                }
            });
            sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
            sidebar.add(btn);
        }
        sidebar.add(Box.createVerticalGlue());
        add(sidebar, BorderLayout.WEST);

        // ===== Form Panel =====
        JPanel form = new JPanel();
        form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
        form.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        form.setBackground(Color.WHITE);

        // Mouse Motion Listener
        form.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mousePositionLabel.setText("<html><h3>Mouse Position: (" + e.getX() + ", " + e.getY() + ")</h3></html>");
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                mousePositionLabel.setText("<html><h3>Mouse Position: (" + e.getX() + ", " + e.getY() + ")</h3></html>");
            }
        });

        // Name Field
        nameField = new JTextField(20);
        nameField.setText("Enter full name");
        nameField.setForeground(Color.GRAY);
        nameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (nameField.getText().equals("Enter full name")) {
                    nameField.setText("");
                    nameField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (nameField.getText().isEmpty()) {
                    nameField.setText("Enter full name");
                    nameField.setForeground(Color.GRAY);
                }
            }
        });
        nameField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                charCountLabel.setText("<html><h3>Characters: " + nameField.getText().length() + "</h3></html>");
            }
        });
        JPanel namePanel = createFieldPanel("Full Name:", nameField);
        form.add(namePanel);
        form.add(Box.createRigidArea(new Dimension(0, 10)));

        // Salary Field
        salaryField = new JTextField(20);
        salaryField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume(); // only allow digits and dot
                }
            }
        });
        JPanel salaryPanel = createFieldPanel("Salary:", salaryField);
        form.add(salaryPanel);
        form.add(Box.createRigidArea(new Dimension(0, 10)));

        // Employment Type
        JPanel employmentPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        employmentPanel.add(new JLabel("Employment Type:"));
        fullTime = new JRadioButton("Full-Time");
        partTime = new JRadioButton("Part-Time");
        contract = new JRadioButton("Contract");
        ButtonGroup empGroup = new ButtonGroup();
        empGroup.add(fullTime);
        empGroup.add(partTime);
        empGroup.add(contract);
        employmentPanel.add(fullTime);
        employmentPanel.add(partTime);
        employmentPanel.add(contract);
        form.add(employmentPanel);
        form.add(Box.createRigidArea(new Dimension(0, 10)));

        // Benefits
        JPanel benefitsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        benefitsPanel.add(new JLabel("Benefits:"));
        healthInsurance = new JCheckBox("Health Insurance");
        dentalInsurance = new JCheckBox("Dental Insurance");
        retirementPlan = new JCheckBox("Retirement Plan");
        benefitsPanel.add(healthInsurance);
        benefitsPanel.add(dentalInsurance);
        benefitsPanel.add(retirementPlan);
        form.add(benefitsPanel);
        form.add(Box.createRigidArea(new Dimension(0, 10)));

        // Department
        JPanel deptPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        deptPanel.add(new JLabel("Department:"));
        String[] departments = {"IT", "HR", "Finance", "Marketing", "Operations"};
        departmentBox = new JComboBox<>(departments);
        deptPanel.add(departmentBox);
        form.add(deptPanel);
        form.add(Box.createRigidArea(new Dimension(0, 10)));

        // Buttons
        JButton registerBtn = new JButton("Register Employee");
        JButton clearFormBtn = new JButton("Clear Form");
        JButton clearAllBtn = new JButton("Clear All Records");

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton[] formButtons = {registerBtn, clearFormBtn, clearAllBtn};
        for (JButton btn : formButtons) {
            btn.setFocusPainted(false);
            btn.setBackground(new Color(200, 200, 200));
            btn.setForeground(Color.BLACK);
            btn.setOpaque(true);
            btn.setBorderPainted(false);
            btn.addMouseListener(new MouseAdapter() {
                Color originalBg = btn.getBackground();
                Color originalFg = btn.getForeground();

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(Color.GREEN);
                    btn.setForeground(Color.WHITE);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(originalBg);
                    btn.setForeground(originalFg);
                }
            });
            btnPanel.add(btn);
        }
        form.add(btnPanel);

        add(form, BorderLayout.CENTER);

        // ===== Display Area =====
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setPreferredSize(new Dimension(400, 0));
        displayArea = new JTextArea(20, 30);
        displayArea.setEditable(false);
        displayArea.setWrapStyleWord(true);
        displayArea.setLineWrap(true);
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        displayArea.setBackground(new Color(252, 252, 252));
        rightPanel.add(new JScrollPane(displayArea), BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);

        // ===== Footer =====
        JPanel footer = new JPanel(new GridLayout(1, 2));
        footer.setBackground(new Color(60, 60, 60));
        footer.setPreferredSize(new Dimension(0, 60));
        charCountLabel = new JLabel("<html><h3>Characters: 0</h3></html>");
        mousePositionLabel = new JLabel("<html><h3>Mouse Position: (0, 0)</h3></html>");
        statusLabel = new JLabel("<html><h3>Status: Ready</h3></html>");
        charCountLabel.setForeground(Color.WHITE);
        mousePositionLabel.setForeground(Color.WHITE);
        statusLabel.setForeground(Color.WHITE);

        JPanel leftFooter = new JPanel(new FlowLayout(FlowLayout.LEFT));
        leftFooter.setBackground(new Color(60, 60, 60));
        leftFooter.add(charCountLabel);
        leftFooter.add(mousePositionLabel);

        JPanel rightFooter = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rightFooter.setBackground(new Color(60, 60, 60));
        rightFooter.add(statusLabel);

        footer.add(leftFooter);
        footer.add(rightFooter);
        add(footer, BorderLayout.SOUTH);

        // ===== Button Actions =====
        registerBtn.addActionListener(e -> registerEmployee());
        viewBtn.addActionListener(e -> viewEmployees());
        addBtn.addActionListener(e -> registerBtn.doClick());
        deleteBtn.addActionListener(e -> deleteEmployee());
        searchBtn.addActionListener(e -> searchEmployee());
        updateBtn.addActionListener(e -> updateEmployee());
        clearFormBtn.addActionListener(e -> clearForm());
        clearAllBtn.addActionListener(e -> clearAllRecords());

        setVisible(true);
    }

    private JPanel createFieldPanel(String label, JTextField field) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel jlabel = new JLabel(label);
        jlabel.setPreferredSize(new Dimension(120, 25));
        panel.add(jlabel);
        field.setPreferredSize(new Dimension(300, 30));
        panel.add(field);
        panel.setBackground(Color.WHITE);
        return panel;
    }

    // ===== NAME EXCEPTION =====
    private void checkName(String name) {
        if (name.trim().isEmpty() || name.equals("Enter full name")) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                throw new IllegalArgumentException("Name must contain only alphabets");
            }
        }
    }

    // ===== SALARY EXCEPTION =====
    private void checkSalary(String salary) {
        double s;
        try {
            s = Double.parseDouble(salary);
        } catch (Exception e) {
            throw new IllegalArgumentException("Salary must be a number");
        }
        if (s <= 0) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        }
    }

    // ===== Button Action Methods =====
    private void registerEmployee() {
        try {
            String name = nameField.getText();
            String salaryText = salaryField.getText();

            if (name.trim().isEmpty() || name.equals("Enter full name") || salaryText.trim().isEmpty()) {
                throw new IllegalArgumentException("All fields must be filled");
            }

            checkName(name);
            checkSalary(salaryText);

            double salary = Double.parseDouble(salaryText);
            String type = fullTime.isSelected() ? "Full-Time" :
                          partTime.isSelected() ? "Part-Time" :
                          contract.isSelected() ? "Contract" : "";
            ArrayList<String> benefitsList = new ArrayList<>();
            if (healthInsurance.isSelected()) benefitsList.add("Health");
            if (dentalInsurance.isSelected()) benefitsList.add("Dental");
            if (retirementPlan.isSelected()) benefitsList.add("Retirement");

            Employee emp = new Employee("E" + (employees.size() + 1), name, salary, type, benefitsList,
                    (String) departmentBox.getSelectedItem());
            employees.add(emp);
            statusLabel.setText("<html><h3>Status: Employee Registered</h3></html>");

        } catch (IllegalArgumentException ex) {
           
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
            statusLabel.setText("<html><h3>Status: Error</h3></html>");
        }
    }

    private void viewEmployees() {
        displayArea.setText("");
        for (Employee emp : employees) {
            displayArea.append(emp.toString() + "\n----------------\n");
        }
        statusLabel.setText("<html><h3>Status: Viewing Employees</h3></html>");
    }

    private void deleteEmployee() {
        if (!employees.isEmpty()) {
            employees.remove(employees.size() - 1);
            statusLabel.setText("<html><h3>Status: Employee Deleted</h3></html>");
        } else {
            statusLabel.setText("<html><h3>Status: No Employees</h3></html>");
        }
    }

    private void searchEmployee() {
        String key = nameField.getText().toLowerCase();
        displayArea.setText("");
        for (Employee emp : employees) {
            if (emp.toString().toLowerCase().contains(key)) {
                displayArea.append(emp.toString() + "\n----------------\n");
            }
        }
        statusLabel.setText("<html><h3>Status: Search Complete</h3></html>");
    }

    private void updateEmployee() {
        String name = nameField.getText();
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            if (emp.toString().contains(name)) {
                employees.set(i, new Employee(emp.toString(), emp.toString(), 0, emp.toString(), new ArrayList<>(), emp.toString()));
                statusLabel.setText("<html><h3>Status: Employee Updated</h3></html>");
                return;
            }
        }
        statusLabel.setText("<html><h3>Status: Not Found</h3></html>");
    }

    private void clearForm() {
        if (nameField.getText().trim().isEmpty() && salaryField.getText().trim().isEmpty()) {
            statusLabel.setText("<html><h3>Status: Andho xas muji clear form lai clear garna khojeko re</h3></html>");
            return;
        }
        nameField.setText("Enter full name");
        nameField.setForeground(Color.GRAY);
        salaryField.setText("");
        fullTime.setSelected(false);
        partTime.setSelected(false);
        contract.setSelected(false);
        healthInsurance.setSelected(false);
        dentalInsurance.setSelected(false);
        retirementPlan.setSelected(false);
        departmentBox.setSelectedIndex(0);
        statusLabel.setText("<html><h3>Status: Form Cleared</h3></html>");
    }

    private void clearAllRecords() {
        employees.clear();
        displayArea.setText("");
        statusLabel.setText("<html><h3>Status: All Records Cleared</h3></html>");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EmployeeManagementTemplate());
    }
}