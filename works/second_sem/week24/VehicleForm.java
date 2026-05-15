package week24;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class VehicleForm extends JFrame implements ActionListener {

    private JRadioButton carBtn, bikeBtn;
    private JPanel formPanel, topPanel, bottomPanel, btnPanel;

    private JTextField nameField, speedField, seatsField, fuelField, gearField, tankField, distanceField;
    private JCheckBox carrierBox;

    private JButton submitBtn, saveBtn, loadBtn, displayBtn, clearBtn;
    private JButton serializeBtn, deserializeBtn;

    private JTable table;
    private DefaultTableModel model;

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private String selectedType = "";

    private static final String TXT_FILE = "vehicles.txt";
    private static final String DAT_FILE = "vehicles.dat";

    public VehicleForm() {

        setTitle("Vehicle File Handling System");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        topPanel = new JPanel();
        carBtn = new JRadioButton("Car");
        bikeBtn = new JRadioButton("Bike");

        ButtonGroup bg = new ButtonGroup();
        bg.add(carBtn);
        bg.add(bikeBtn);

        topPanel.add(new JLabel("Select Type:"));
        topPanel.add(carBtn);
        topPanel.add(bikeBtn);

        add(topPanel, BorderLayout.NORTH);

        carBtn.addActionListener(e -> showForm("Car"));
        bikeBtn.addActionListener(e -> showForm("Bike"));

        formPanel = new JPanel();
        add(formPanel, BorderLayout.CENTER);

        model = new DefaultTableModel(
                new String[]{"Type", "Name", "Speed", "Fuel / Gear", "Tank / Distance"}, 0);

        table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(800, 150));

        bottomPanel = new JPanel(new BorderLayout());
        btnPanel = new JPanel();

        submitBtn    = new JButton("Add");
        saveBtn      = new JButton("Save");
        loadBtn      = new JButton("Load");
        displayBtn   = new JButton("Display");
        clearBtn     = new JButton("Clear");
        serializeBtn   = new JButton("Serialize");
        deserializeBtn = new JButton("Deserialize");

        btnPanel.add(submitBtn);
        btnPanel.add(saveBtn);
        btnPanel.add(loadBtn);
        btnPanel.add(displayBtn);
        btnPanel.add(clearBtn);
        btnPanel.add(serializeBtn);
        btnPanel.add(deserializeBtn);

        JScrollPane tableScroll = new JScrollPane(table);

        bottomPanel.add(btnPanel, BorderLayout.NORTH);
        bottomPanel.add(tableScroll, BorderLayout.CENTER);

        add(bottomPanel, BorderLayout.SOUTH);

        submitBtn.addActionListener(this);
        saveBtn.addActionListener(e -> saveToFile());
        loadBtn.addActionListener(e -> loadFromFile());
        displayBtn.addActionListener(e -> displayTable());
        clearBtn.addActionListener(e -> clearForm());
        serializeBtn.addActionListener(e -> serializeToFile());
        deserializeBtn.addActionListener(e -> deserializeFromFile());
    }

    private void showForm(String type)
    {
        selectedType = type;
        formPanel.removeAll();
        formPanel.setLayout(new GridLayout(0, 2, 10, 10));

        nameField  = new JTextField();
        speedField = new JTextField();

        formPanel.add(new JLabel("Name"));
        formPanel.add(nameField);

        formPanel.add(new JLabel("Speed"));
        formPanel.add(speedField);

        if (type.equals("Car"))
        {
            seatsField = new JTextField();
            fuelField  = new JTextField();
            tankField  = new JTextField();

            formPanel.add(new JLabel("Seats"));
            formPanel.add(seatsField);

            formPanel.add(new JLabel("Fuel"));
            formPanel.add(fuelField);

            formPanel.add(new JLabel("Tank"));
            formPanel.add(tankField);
        }
        else
        {
            gearField    = new JTextField();
            carrierBox   = new JCheckBox("Carrier");
            distanceField = new JTextField();

            formPanel.add(new JLabel("Gear"));
            formPanel.add(gearField);

            formPanel.add(new JLabel(""));
            formPanel.add(carrierBox);

            formPanel.add(new JLabel("Distance"));
            formPanel.add(distanceField);
        }

        formPanel.revalidate();
        formPanel.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            String name  = nameField.getText().trim();
            int    speed = Integer.parseInt(speedField.getText().trim());

            if (selectedType.equals("Car"))
            {
                int    seats = Integer.parseInt(seatsField.getText().trim());
                double fuel  = Double.parseDouble(fuelField.getText().trim());
                double tank  = Double.parseDouble(tankField.getText().trim());

                vehicles.add(new Car(name, speed, seats, fuel, tank));
            }
            else
            {
                int     gear     = Integer.parseInt(gearField.getText().trim());
                boolean carrier  = carrierBox.isSelected();
                double  distance = Double.parseDouble(distanceField.getText().trim());

                vehicles.add(new Bike(name, speed, carrier, gear, distance));
            }

            JOptionPane.showMessageDialog(this, "Vehicle Added!");
            clearForm();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid Input!");
        }
    }

    //  1: Write ArrayList to text file 
    private void saveToFile()
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(TXT_FILE)))
        {
            for (Vehicle v : vehicles)
            {
                bw.write(v.toCSV());
                bw.newLine();
            }
            JOptionPane.showMessageDialog(this, "Vehicles saved to " + TXT_FILE + " successfully!");
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
        }
    }

    //  2: Read from text file back into ArrayList 
    private void loadFromFile()
    {
        try (BufferedReader br = new BufferedReader(new FileReader(TXT_FILE)))
        {
            vehicles.clear();
            String line;

            while ((line = br.readLine()) != null)
            {
                String[] parts = line.split(",");
                String type = parts[0];

                if (type.equals("CAR"))
                {
                    // car ko name,speed,seats,fuelEfficiency,tankCapacity
                    String name   = parts[1];
                    int    speed  = Integer.parseInt(parts[2]);
                    int    seats  = Integer.parseInt(parts[3]);
                    double fuel   = Double.parseDouble(parts[4]);
                    double tank   = Double.parseDouble(parts[5]);
                    vehicles.add(new Car(name, speed, seats, fuel, tank));
                }
                else if (type.equals("BIKE"))
                {
                    // bike ko name,speed,hasCarrier,gearCount,distance
                    String  name     = parts[1];
                    int     speed    = Integer.parseInt(parts[2]);
                    boolean carrier  = Boolean.parseBoolean(parts[3]);
                    int     gear     = Integer.parseInt(parts[4]);
                    double  distance = Double.parseDouble(parts[5]);
                    vehicles.add(new Bike(name, speed, carrier, gear, distance));
                }
            }
            JOptionPane.showMessageDialog(this, "Vehicles loaded from " + TXT_FILE + " successfully!");
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(this, "Error loading file: " + ex.getMessage());
        }
    }

    //  3: Serialization
    private void serializeToFile()
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DAT_FILE)))
        {
            oos.writeObject(vehicles);
            JOptionPane.showMessageDialog(this, "Vehicles serialized to " + DAT_FILE + " successfully!");
        }
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(this, "Error serializing: " + ex.getMessage());
        }
    }

    //4: Deserialization
    
    @SuppressWarnings("unchecked")
    private void deserializeFromFile()
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DAT_FILE)))
        {
            vehicles = (ArrayList<Vehicle>) ois.readObject();
            JOptionPane.showMessageDialog(this, "Vehicles deserialized from " + DAT_FILE + " successfully!");
        }
        catch (IOException | ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, "Error deserializing: " + ex.getMessage());
        }
    }

    private void displayTable()
    {
        model.setRowCount(0);

        for (Vehicle v : vehicles)
        {
            if (v instanceof Car c)
            {
                model.addRow(new Object[]{"Car", c.getName(), c.getSpeed(), c.getFuel(), c.getTank()});
            }
            else if (v instanceof Bike b)
            {
                model.addRow(new Object[]{"Bike", b.getName(), b.getSpeed(), b.getGear(), b.getDistance()});
            }
        }
    }

    private void clearForm()
    {
        if (nameField     != null) nameField.setText("");
        if (speedField    != null) speedField.setText("");
        if (seatsField    != null) seatsField.setText("");
        if (fuelField     != null) fuelField.setText("");
        if (tankField     != null) tankField.setText("");
        if (gearField     != null) gearField.setText("");
        if (distanceField != null) distanceField.setText("");
        if (carrierBox    != null) carrierBox.setSelected(false);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> new VehicleForm().setVisible(true));
    }
}
