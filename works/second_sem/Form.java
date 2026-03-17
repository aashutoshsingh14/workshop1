
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class one here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Form extends JFrame
{
    private String[] buttons={"Add","Create","Edit"};
    public Form()
    {

        setTitle("Layout Demo");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JPanel titlePanel = new JPanel();
        JLabel titleLabel= new JLabel("Welcome to this page");
        titlePanel.add(titleLabel);
        
        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel,BoxLayout.Y_AXIS));
        for(String button: buttons)
        {
            JButton btn = new JButton(button);
            btn.setMaximumSize(new Dimension(120,40));
            sidePanel.add(btn);
            sidePanel.add(Box.createVerticalStrut(10));
        }
        JLabel sideLabel = new JLabel("side bar");
        sidePanel.add(sideLabel);
        
        JPanel formPanel= new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel,BoxLayout.Y_AXIS));
        
        JPanel row1= new JPanel();
        row1.setLayout(new BoxLayout(row1,BoxLayout.X_AXIS));
        row1.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField(15);
        nameField.setMaximumSize(new Dimension(100,30));
        
        row1.add(nameLabel);
        row1.add(nameField);
        
        
        
        JPanel row2= new JPanel();
        row2.setLayout(new BoxLayout(row2,BoxLayout.X_AXIS));
        row2.setAlignmentX(Component.LEFT_ALIGNMENT); 
        
        JLabel genderLabel = new JLabel("Gender:");
        row2.add(genderLabel);
        
        
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        JRadioButton otherRadio = new JRadioButton("Other");
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);
        
        
        row2.add(maleRadio);
        row2.add(femaleRadio);
        row2.add(otherRadio);
        
        JPanel row3= new JPanel();
        row3.setLayout(new BoxLayout(row3,BoxLayout.X_AXIS));
        row3.setAlignmentX(Component.LEFT_ALIGNMENT);
        JLabel deptLabel = new JLabel("Department:");
        String[] departments = {"CS", "IT", "Business", "Engineering", "Math", 
                                "Physics", "Chemistry", "Biology", "Arts", "Law", "Medicine", "Education"};
        JComboBox<String> deptCombo = new JComboBox<>(departments);
        deptCombo.setMaximumSize(new Dimension(150, 25));
        
        row3.add(deptLabel);
        row3.add(deptCombo);
        
        
        JPanel row4= new JPanel();
        row4.setLayout(new BoxLayout(row4,BoxLayout.X_AXIS));
        row4.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel skillLabel = new JLabel("Programming Skills:");
        JCheckBox javaCheck = new JCheckBox("Java");
        JCheckBox pythonCheck = new JCheckBox("Python");
        JCheckBox cppCheck = new JCheckBox("C++");
        JCheckBox cSharpCheck = new JCheckBox("C#");
        JCheckBox javascriptCheck = new JCheckBox("JavaScript");
        JPanel skillPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        skillPanel.add(javaCheck);
        skillPanel.add(pythonCheck);
        skillPanel.add(cppCheck);
        skillPanel.add(cSharpCheck);
        skillPanel.add(javascriptCheck);
        row4.add(skillPanel);
        
        formPanel.add(row1);
        formPanel.add(row2);
        formPanel.add(row3);
        formPanel.add(row4);
        
        add(titlePanel, BorderLayout.NORTH);
        add(formPanel,BorderLayout.EAST);
        add(sidePanel,BorderLayout.WEST);
    }
    public static void main(String[] args)
    {
        new Form().setVisible(true);
        
    }
}