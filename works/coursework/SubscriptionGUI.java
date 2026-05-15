import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;

/**
 * This is the main gui class 
 *
 * @author (Aashutosh Singh)
 * @version (a version number or a date)
 */


public class SubscriptionGUI extends JFrame implements ActionListener {

    
    ArrayList<AIModel> planList = new ArrayList<AIModel>();

   
    JTextField txtModelName     = new JTextField(15);
    JTextField txtPrice         = new JTextField(10);
    JTextField txtParameters    = new JTextField(10);
    JTextField txtContextWindow = new JTextField(10);
    JTextField txtTokens        = new JTextField(10); 
    JTextField txtTeamSlots     = new JTextField(10); 

    
    JTextField txtIndex         = new JTextField(5);
    JTextField txtPromptText    = new JTextField(20);
    JTextField txtOutputTokens  = new JTextField(10);
    JTextField txtMemberName    = new JTextField(15);

    JTextArea txtDisplay = new JTextArea(12, 45);

   
    JButton btnAddPersonal   = new JButton("Add Personal Plan");
    JButton btnAddPro        = new JButton("Add Pro Plan");
    JButton btnDisplayAll    = new JButton("Display All");
    JButton btnClear         = new JButton("Clear");
    JButton btnGivePrompt    = new JButton("Give a Prompt");
    JButton btnAddMember     = new JButton("Add Team Member");
    JButton btnRemoveMember  = new JButton("Remove Team Member");
    JButton btnCheckType     = new JButton("Check Plan Type");
    JButton btnExport        = new JButton("Export to File");
    JButton btnLoad          = new JButton("Load From File");

    /**
     * Constructor - builds and shows the GUI window.
     */
    public SubscriptionGUI() {
        setTitle("Aashutosh AI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        Font font = new Font("Segoe UI", Font.PLAIN, 14);
        
        UIManager.put("Label.font", font);
        UIManager.put("Button.font", font);
        UIManager.put("TextField.font", font);
        UIManager.put("TextArea.font", font);
        
        getContentPane().setBackground(new Color(230, 240, 250));
        
        txtDisplay.setFont(new Font("Consolas", Font.PLAIN, 13));
        txtDisplay.setBackground(new Color(10, 20, 30));
        txtDisplay.setForeground(Color.GREEN);

        JPanel topPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        topPanel.setBorder(BorderFactory.createTitledBorder("Enter Model Details"));

        topPanel.add(new JLabel("Model Name:"));
        topPanel.add(txtModelName);

        topPanel.add(new JLabel("Price (NPR per 1 Lakh tokens):"));
        topPanel.add(txtPrice);

        topPanel.add(new JLabel("Parameter Count (Billions):"));
        topPanel.add(txtParameters);

        topPanel.add(new JLabel("Context Window (tokens):"));
        topPanel.add(txtContextWindow);

        topPanel.add(new JLabel("Available Tokens (Personal Plan only):"));
        topPanel.add(txtTokens);

        topPanel.add(new JLabel("Team Slots (Pro Plan only):"));
        topPanel.add(txtTeamSlots);

        JPanel planButtonPanel = new JPanel(new FlowLayout());
        planButtonPanel.setBorder(BorderFactory.createTitledBorder("Plan Management"));
        planButtonPanel.add(btnAddPersonal);
        planButtonPanel.add(btnAddPro);
        planButtonPanel.add(btnDisplayAll);
        planButtonPanel.add(btnClear);

         JPanel actionPanel = new JPanel(new GridLayout(0, 2, 5, 5));
        actionPanel.setBorder(BorderFactory.createTitledBorder("Actions"));

        actionPanel.add(new JLabel("Index Number:"));
        actionPanel.add(txtIndex);

        actionPanel.add(new JLabel("Prompt Text:"));
        actionPanel.add(txtPromptText);

        actionPanel.add(new JLabel("Expected Output Tokens:"));
        actionPanel.add(txtOutputTokens);

        actionPanel.add(btnGivePrompt);
        actionPanel.add(btnCheckType);

        actionPanel.add(new JLabel("Team Member Name:"));
        actionPanel.add(txtMemberName);

        actionPanel.add(btnAddMember);
        actionPanel.add(btnRemoveMember);

        actionPanel.add(btnExport);
        actionPanel.add(btnLoad);

        txtDisplay.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtDisplay);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Output"));

          btnAddPersonal.addActionListener(this);
        btnAddPro.addActionListener(this);
        btnDisplayAll.addActionListener(this);
        btnClear.addActionListener(this);
        btnGivePrompt.addActionListener(this);
        btnAddMember.addActionListener(this);
        btnRemoveMember.addActionListener(this);
        btnCheckType.addActionListener(this);
        btnExport.addActionListener(this);
        btnLoad.addActionListener(this);

       
        JPanel topContainer = new JPanel(new BorderLayout());
        topContainer.add(topPanel, BorderLayout.CENTER);
        topContainer.add(planButtonPanel, BorderLayout.SOUTH);

        add(topContainer, BorderLayout.NORTH);
        add(actionPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAddPersonal) {
            addPersonalPlan();
        } else if (e.getSource() == btnAddPro) {
            addProPlan();
        } else if (e.getSource() == btnDisplayAll) {
            displayAll();
        } else if (e.getSource() == btnClear) {
            clearFields();
        } else if (e.getSource() == btnGivePrompt) {
            givePrompt();
        } else if (e.getSource() == btnAddMember) {
            addTeamMember();
        } else if (e.getSource() == btnRemoveMember) {
            removeTeamMember();
        } else if (e.getSource() == btnCheckType) {
            int index = getDisplayNumber();
            if (index != -1) {
                checkPlanType(index);
            }
        } else if (e.getSource() == btnExport) {
            exportToFile();
        } else if (e.getSource() == btnLoad) {
            loadFromFile();
        }
    }

    public int getDisplayNumber() {
        int index = -1;

        try {
            index = Integer.parseInt(txtIndex.getText());

             if (index < 0 || index >= planList.size()) {
                JOptionPane.showMessageDialog(this, "Index out of range. Please enter a number between 0 and " + (planList.size() - 1) + ".", "Index Error", JOptionPane.ERROR_MESSAGE);
                return -1;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid whole number for the index.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }

        return index;
    }

   
    public void addPersonalPlan() {
        try {
            String name    = txtModelName.getText();
            double price   = Double.parseDouble(txtPrice.getText());
            int params     = Integer.parseInt(txtParameters.getText());
            int context    = Integer.parseInt(txtContextWindow.getText());
            int tokens     = Integer.parseInt(txtTokens.getText());

            PersonalPlan newPlan = new PersonalPlan(name, price, params, context, tokens);
            planList.add(newPlan);

            txtDisplay.setText("Personal Plan added!\n\n" + newPlan.display());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields with valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addProPlan() {
        try {
            String name   = txtModelName.getText();
            double price  = Double.parseDouble(txtPrice.getText());
            int params    = Integer.parseInt(txtParameters.getText());
            int context   = Integer.parseInt(txtContextWindow.getText());
            int slots     = Integer.parseInt(txtTeamSlots.getText());

            ProPlan newPlan = new ProPlan(name, price, params, context, slots);
            planList.add(newPlan);

            txtDisplay.setText("Pro Plan added!\n\n" + newPlan.display());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields with valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public void displayAll() {
        if (planList.size() == 0) {
            txtDisplay.setText("No plans have been added yet.");
            return;
        }

        String output = "";
        for (int i = 0; i < planList.size(); i++) {
            output = output + "Index: " + i + "\n";
            output = output + planList.get(i).display();
            output = output + "\n\n";
        }

        txtDisplay.setText(output);
    }

   
    public void clearFields() {
        txtModelName.setText("");
        txtPrice.setText("");
        txtParameters.setText("");
        txtContextWindow.setText("");
        txtTokens.setText("");
        txtTeamSlots.setText("");
        txtIndex.setText("");
        txtPromptText.setText("");
        txtOutputTokens.setText("");
        txtMemberName.setText("");
    }

    
    public void givePrompt() {
    int index = getDisplayNumber();

    if (index == -1) {
        return;
    }

    AIModel selectedPlan = planList.get(index);

    try {
        int outputTokens = Integer.parseInt(txtOutputTokens.getText());
        String prompt = txtPromptText.getText();

       
        if (selectedPlan instanceof PersonalPlan) {

            PersonalPlan p = (PersonalPlan) selectedPlan;

            String result = p.enterPrompt(prompt, outputTokens);

           
            if (result.startsWith("INSUFFICIENT_TOKENS")) {

                JOptionPane.showMessageDialog(
                        this,
                        "You don't have enough tokens!",
                        "Token Error",
                        JOptionPane.WARNING_MESSAGE
                );

                int choice = JOptionPane.showConfirmDialog(
                        this,
                        "Do you want to buy tokens?",
                        "Buy Tokens",
                        JOptionPane.YES_NO_OPTION
                );

                if (choice == JOptionPane.YES_OPTION) {

                    String input = JOptionPane.showInputDialog(
                            this,
                            "Enter tokens to buy:"
                    );

                    try {
                        int buy = Integer.parseInt(input);

                        // IMPORTANT: add tokens via your model method
                        JOptionPane.showMessageDialog(
                                this,
                                p.purchaseTokens(buy)
                        );

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(
                                this,
                                "Invalid number entered!"
                        );
                    }
                }

                return;
            }

            txtDisplay.setText(result);
        }

       
        else if (selectedPlan instanceof ProPlan) {

            ProPlan pro = (ProPlan) selectedPlan;
            String result = pro.enterPrompt(prompt, outputTokens);
            txtDisplay.setText(result);

        }

       
        else {
            JOptionPane.showMessageDialog(
                    this,
                    "This operation is only available for Personal and Pro plans.",
                    "Plan Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(
                this,
                "Please enter valid number for output tokens.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
    
    public void addTeamMember() {
        int index = getDisplayNumber();

        if (index == -1) {
            return;
        }

        AIModel selectedPlan = planList.get(index);

        if (selectedPlan instanceof ProPlan) {
            ProPlan pp = (ProPlan) selectedPlan;
            String memberName = txtMemberName.getText();
            String result = pp.addTeamMember(memberName);
            txtDisplay.setText(result);
        } else {
            JOptionPane.showMessageDialog(this, "Team management is only available for Pro Plan subscriptions.", "Plan Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   
    public void removeTeamMember() {
        int index = getDisplayNumber();

        if (index == -1) {
            return;
        }

        AIModel selectedPlan = planList.get(index);

        if (selectedPlan instanceof ProPlan) {
            ProPlan pp = (ProPlan) selectedPlan;
            String memberName = txtMemberName.getText();
            String result = pp.removeTeamMember(memberName);
            txtDisplay.setText(result);
        } else {
            JOptionPane.showMessageDialog(this, "Team management is only available for Pro Plan subscriptions.", "Plan Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public void checkPlanType(int index) {
        AIModel selectedPlan = planList.get(index);

        if (selectedPlan instanceof PersonalPlan) {
            JOptionPane.showMessageDialog(this, "The plan at index " + index + " is a Personal Plan.", "Plan Type", JOptionPane.INFORMATION_MESSAGE);
        } else if (selectedPlan instanceof ProPlan) {
            JOptionPane.showMessageDialog(this, "The plan at index " + index + " is a Pro Plan.", "Plan Type", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Unknown plan type at index " + index + ".", "Plan Type", JOptionPane.WARNING_MESSAGE);
        }
    }

    
    public void exportToFile() {
        if (planList.size() == 0) {
            JOptionPane.showMessageDialog(this, "There are no plans to export.", "Export Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            FileWriter fw = new FileWriter("subscriptions.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < planList.size(); i++) {
                bw.write("Index: " + i);
                bw.newLine();
                bw.write(planList.get(i).display());
                bw.newLine();
                bw.newLine();
            }

            bw.close();
            JOptionPane.showMessageDialog(this, "Plans saved to subscriptions.txt successfully!", "Export Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Something went wrong while saving the file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    public void loadFromFile() {
        try {
            FileReader fr = new FileReader("subscriptions.txt");
            BufferedReader br = new BufferedReader(fr);

            String output = "";
            String line = br.readLine();

            while (line != null) {
                output = output + line + "\n";
                line = br.readLine();
            }

            br.close();
            txtDisplay.setText(output);
            JOptionPane.showMessageDialog(this, "File loaded successfully!", "Load Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "File not found. Please export first before loading.", "File Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Something went wrong while reading the file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public static void main(String[] args) {
        new SubscriptionGUI();
    }
}
