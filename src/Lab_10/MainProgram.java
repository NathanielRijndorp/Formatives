package Lab_10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.*;
import java.time.Month;
import java.time.Year;
import java.util.Vector;

public class MainProgram extends MyFrame implements ActionListener, MouseListener, KeyListener, WindowListener {
    /** ALL CODE SEVERELY COMMENTED OUT  IS CODE THAT BASICALLY
     *  GOT UPGRADED THROUGHOUT THE PDF PROCESS
     */

    // data fields
    private JLabel lblID, lblName, lblType, lblGender, lblColor, lblBreed, lblPrice, lblAge, lblSearch;
    private JTextField txtID, txtName, txtColor, txtPrice, txtSearch;
    private JComboBox cboGender, cboType, cboBreed;
    private Font f = new Font("Arial", Font.BOLD, 16);
    //data fields -panelBirthdate
    private JTextField txtAge;
    // data fields -panelTable
    private JTable tbl_Pet;
    // for easier table access and manipulation
    private DefaultTableModel model_pet;
    private Vector columns, rowData;
    private TableRowSorter tbl_sort;
    private JComboBox cboMonth, cboDay, cboYear;
    private int age;
    //get current year
    private int current_year = Year.now().getValue();
    // data fields -panelButtons
    private JButton btnAdd, btnClear, btnUpdate, btnDelete, btnClose;
    // JPanel objects
    private JPanel panelPetInfo, panelBirthdate, panelButtons, panelSearch, panelTable;
    // instantiation for the database
    private Database db = new Database("Pet.txt");

    // constructor
    public static void main(String[] args) {
        new MainProgram();
    } // end of main
    public MainProgram() {
        initializedComponents(); // method for components
        petInfo();
        add(panelPetInfo).setBounds(10,10,300,250);

        panelBirthdate(); // method call for birthdate panel
        // adding panel to Frame
        add(panelBirthdate).setBounds(10,260,300,80);
        panelPetButtons(); // method call for pet buttons
        // adding panel to Frame
        add(panelButtons).setBounds(40,340,600,30);
        // calling method directly as it returns JPanel
        add(panelPetSearch()).setBounds(320,20,300,30);
        // calling method directly as it returns JPanel
        add(panelPetTable()).setBounds(320,50,550,290);
        add(setBackgroundImage("src/Images/bg1.jpg"));
        setMyFrame("Pet Registration Form", 900, 400, true);
        setLocationRelativeTo(null);
        setBackgroundColor(100, 210, 95, 90);
        // set the value of your txtID as the table adds up new records
        txtID.setText(getRowCount());
        // register your buttons to ActionListener
        btnAdd.addActionListener(this);
        btnClear.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnClose.addActionListener(this);
        tbl_Pet.addMouseListener(this);
        txtSearch.addKeyListener(this);

        txtName.addKeyListener(this);
        txtPrice.addKeyListener(this);
        txtColor.addKeyListener(this);
        txtColor.addMouseListener(this);
        addWindowListener(this);
        resetComponents();
        db = new Database("Pet.txt");
        db.displayRecords(model_pet);
        //pack();
    } // end of constructor
    public void initializedComponents() {
        // label components
        lblID = new JLabel("ID: ");
        lblName = new JLabel("Name: ");
        lblType = new JLabel("Type: ");
        lblGender = new JLabel("Gender: ");
        lblColor = new JLabel("Color: ");
        lblBreed = new JLabel("Breed: ");
        lblPrice = new JLabel("Price: ");
        //text components
        txtID = new JTextField(20);
        txtID.setEditable(false);
        txtName = new JTextField(20);
        txtColor = new JTextField(20);
        txtPrice = new JTextField(20);
        //combo box components
        cboGender = new JComboBox();
        cboType = new JComboBox();
        cboBreed = new JComboBox();
        loadToComboBox();
        // buttons with icons
        btnAdd = new JButton("Add New", new ImageIcon("src/Icons/add_user.png"));
        btnClear = new JButton("Clear", new ImageIcon("src/Icons/clear.png"));
        // buttons w/o icons
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
        btnClose = new JButton("Close");
    }
    public void petInfo() {
        // initialized variables
        panelPetInfo = new JPanel();
        panelPetInfo.setBorder(BorderFactory.createTitledBorder("Pet Registration Form"));
        panelPetInfo.setLayout(new GridLayout(7,2));
        panelPetInfo.setFont(f);
        panelPetInfo.setOpaque(false);
        // added components
        panelPetInfo.add(lblID); panelPetInfo.add(txtID);
        panelPetInfo.add(lblName); panelPetInfo.add(txtName);
        panelPetInfo.add(lblGender); panelPetInfo.add(cboGender);
        panelPetInfo.add(lblType); panelPetInfo.add(cboType);
        panelPetInfo.add(lblBreed); panelPetInfo.add(cboBreed);
        panelPetInfo.add(lblColor); panelPetInfo.add(txtColor);
        panelPetInfo.add(lblPrice); panelPetInfo.add(txtPrice);
    } // end of method
    public void loadToComboBox() {
        // gender items
        cboGender.addItem("Male");
        cboGender.addItem("Female");
        // pet type items
        db = new Database("Type.txt");
        db.fillToComboBox(cboType);
//        cboType.addItem("Dog");
//        cboType.addItem("Cat");
//        cboType.addItem("Bird");
//        cboType.addItem("Fish");

        // breed items
        db = new Database("Breed.txt");
        db.fillToComboBox(cboBreed);
//        cboBreed.addItem("Persian");
//        cboBreed.addItem("Siamese");
//        cboBreed.addItem("Askal");
//        cboBreed.addItem("Siberian");
//        cboBreed.addItem("Bulldog");
    } // end of method
    public void panelBirthdate() {
        panelBirthdate = new JPanel();
        lblAge = new JLabel("Age");
        txtAge = new JTextField("0",5); // initial value and no. of column via width.
        txtAge.setEditable(false);
        txtAge.setToolTipText("Age");
        // Loads the month to comboBox from built-in enumeration (Month)
        cboMonth = new JComboBox(Month.values());
        cboDay = new JComboBox();
        cboYear = new JComboBox();
        // Panel layout
        panelBirthdate.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
        panelBirthdate.setBorder(BorderFactory.createTitledBorder("Birthdate"));
        panelBirthdate.add(cboMonth);
        panelBirthdate.add(cboDay);
        panelBirthdate.add(cboYear);
        panelBirthdate.add(lblAge);
        panelBirthdate.add(txtAge);
        for (int i = 1; i <=31; i++) {
            cboDay.addItem(i);
            cboYear.addItem(i+1970);
        }
        // let user type instead of choosing items from options
        cboYear.addActionListener(this); // register to action listener
        cboYear.setEditable(true);
    } // end of method
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(cboYear)) {
            age = current_year-Integer.parseInt(cboYear.getSelectedItem().toString());
            txtAge.setText(age+"");
        } else if (e.getSource().equals(btnAdd)) {
            getData();
            model_pet.addRow(rowData);
            txtID.setText(getRowCount());
            resetComponents();
        } else if (e.getSource().equals(btnClear)) {
            resetComponents();
        } else if (e.getSource().equals(btnUpdate)) {
            int i = tbl_Pet.getSelectedRow();
            /** This changes the records of your table based on the selected row
             * Whatever changes you invoked in your swing components
             * like changing the name in the textfield, gender, price, color, etc
             * will alter that row or record in the table
             */
            tbl_Pet.setValueAt(txtName.getText(), i , 1);
            tbl_Pet.setValueAt(cboGender.getSelectedItem(), i , 2);
            tbl_Pet.setValueAt(cboType.getSelectedItem(), i , 3);
            tbl_Pet.setValueAt(cboBreed.getSelectedItem(), i , 4);
            tbl_Pet.setValueAt(txtColor.getText(), i , 5);
            tbl_Pet.setValueAt(txtPrice.getText(), i , 6);
            tbl_Pet.setValueAt(cboMonth.getSelectedItem(), i , 7);
            tbl_Pet.setValueAt(cboDay.getSelectedItem(), i , 8);
            tbl_Pet.setValueAt(cboYear.getSelectedItem(), i , 9);
            tbl_Pet.setValueAt(txtAge.getText(), i , 10);

            getData();
            // starts with 1 sicne we don't allow changing the ID
            for(int col = 1; col < tbl_Pet.getColumnCount(); col++) {
                tbl_Pet.setValueAt(rowData.get(col), i, col);
            }
            resetComponents();
        } else if (e.getSource().equals(btnDelete)) {
            int i = tbl_Pet.getSelectedRow();
            model_pet.removeRow(i);
            resetComponents();
        } else if (e.getSource().equals(btnClose)) {
//            String records = "";
//            // 0 to number of rows or records
//            for (int r = 0; r < model_pet.getRowCount(); r++) {
//                // 0 to number of columns or fields
//                for (int c = 0; c < model_pet.getColumnCount(); c++) {
//                    /** concatenation of values from table as it fetches the record
//                     * and separator for delimeter #
//                     */
//                    records+= model_pet.getValueAt(r, c) + "#";
//                } // end of inner loop
//                records+="\n"; // concatenate each entire record of the table to the next line
//                // save the read records/values from table to textfile
//            } // end of outer loop
//            db.storeToFile(records);
            process();
            System.exit(0);
        } // end of if
    } // end of method
    public void panelPetButtons() {
        panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(1,5,4,2));
        panelButtons.add(btnAdd);
        panelButtons.add(btnClear);
        // creates empty label (invisible) as a separator
        panelButtons.add(new JLabel(""));
        panelButtons.add(btnUpdate);
        panelButtons.add(btnDelete);
        panelButtons.add(btnClose);
    } // end of method
    public JPanel panelPetSearch() {
        panelSearch = new JPanel();
        lblSearch = new JLabel("Search");
        txtSearch = new JTextField(10);
        panelSearch.setLayout(new FlowLayout(FlowLayout.LEFT,2,1));
        panelSearch.add(lblSearch);
        panelSearch.add(txtSearch);
        panelSearch.setOpaque(false);
        return panelSearch;
    } // end of method
    public JPanel panelPetTable() {
        panelTable = new JPanel();
        tbl_Pet = new JTable();
        model_pet = new DefaultTableModel();
        panelTable.setLayout(new BorderLayout());
        panelTable.add(new JScrollPane(tbl_Pet), BorderLayout.CENTER);
        String cols[] = {"ID","Name","Gender","Type","Breed","Color","Price","Month","Day","Year","Age"};
        columns = new Vector<>();
        // for each loop, store array elements to vector columns
        for (String val:cols) {
            columns.add(val);
        }
        // set column to table via model_pet DefaultTableModel
        model_pet.setColumnIdentifiers(columns);
        // bind jTable and DefaultTableModel
        tbl_Pet.setModel(model_pet);
        // sets all the column width the same
        tbl_Pet.setAutoResizeMode(tbl_Pet.AUTO_RESIZE_OFF);
        return panelTable;
    }
    public String getRowCount() {
        return "10" + model_pet.getRowCount();
    }
    public void getData() {
        rowData = new Vector<String>();
        rowData.add(txtID.getText());
        rowData.add(txtName.getText());
        rowData.add(cboGender.getSelectedItem());
        rowData.add(cboType.getSelectedItem());
        rowData.add(cboBreed.getSelectedItem());
        rowData.add(txtColor.getText());
        rowData.add(txtPrice.getText());
        rowData.add(cboMonth.getSelectedItem());
        rowData.add(cboDay.getSelectedItem());
        rowData.add(cboYear.getSelectedItem());
        rowData.add(txtAge.getText());

    }
    public void resetComponents() {
        txtID.setText(getRowCount());

        btnAdd.setEnabled(true);
        btnClear.setEnabled(true);
        btnClose.setEnabled(true);

        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        // clear the swing components
        txtName.setText("");
        txtPrice.setText("");
        txtColor.setText("");
        txtAge.setText("");
        // setting values by default to first index
        cboGender.setSelectedItem(0);
        cboType.setSelectedItem(0);
        cboBreed.setSelectedItem(0);
        cboMonth.setSelectedItem(0);
        cboDay.setSelectedItem(0);
        cboYear.setSelectedItem(0);
    } // end of method
    /** Whenever the table is clicked,
     * the update and delete buttons are enabled
     */
    public void tableClick() {
        txtID.setText(getRowCount());
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }
    public void process() {
        String records = "";
        // 0 to number of rows of records
        for (int r = 0; r < model_pet.getRowCount(); r++) {
            // 0 to number of columns or fields
            for (int c = 0; c < model_pet.getColumnCount(); c++) {
                /** concatenation of values from table as it fetches the record
                 * and separator delimter #
                 */
                records+= model_pet.getValueAt(r, c) + "#";
            } // end of inner loop
            records+="\n"; // concatenate each entire record of the table to the next line
            // save the read records/values from the table to textfile
        } // end of outer loop
        db.storeToFile(records);
    } // end of method
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(tbl_Pet)) {
            int i = tbl_Pet.getSelectedRow();
            // JOptionPane.showMessageDialog(null, "Row " + i + " is selected");
            /** Set the text of the swing components based on the table selection
             * i - row selected
             * while the numerical values represent the columns of your table
             */
            txtID.setText(tbl_Pet.getValueAt(i, 0) + "");
            txtName.setText(tbl_Pet.getValueAt(i, 1) + "");
            cboGender.setSelectedItem((tbl_Pet.getValueAt(i, 2) + ""));
            cboType.setSelectedItem((tbl_Pet.getValueAt(i, 3) + ""));
            cboBreed.setSelectedItem((tbl_Pet.getValueAt(i, 4) + ""));
            txtColor.setText((tbl_Pet.getValueAt(i, 5) + ""));
            txtPrice.setText((tbl_Pet.getValueAt(i, 6) + ""));
            cboMonth.setSelectedItem((tbl_Pet.getValueAt(i, 7) + ""));
            cboDay.setSelectedItem((tbl_Pet.getValueAt(i, 8) + ""));
            cboYear.setSelectedItem((tbl_Pet.getValueAt(i, 9) + ""));
            txtAge.setText((tbl_Pet.getValueAt(i, 10) + ""));

            tableClick();
        } else if (e.getSource().equals(txtColor)) {
            Color color = JColorChooser.showDialog(null, "Choose", Color.black);

            txtColor.setBackground(color);
            txtColor.setText("");
        } // end of if statement
    } // end of method

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource().equals(txtPrice)) {
            // if number only
            if (e.getKeyChar()>='a' && e.getKeyChar()<='z') {
                e.consume();
            }
        } else if (e.getSource().equals(txtName) || e.getSource().equals(txtColor)) {
            // if character only
            char ch = e.getKeyChar();
            if (!((Character.isWhitespace(ch) || e.getKeyChar()>='a' || e.getKeyChar()>='A') &&
                    (e.getKeyChar()<='z' || e.getKeyChar()<='Z'))) {
                e.consume();
            } // end of if
        } // end of if
    } // end of method

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto Generated method stub
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource().equals(txtSearch)) {
            String search = txtSearch.getText();
            // binding TableRowSorter and DefaultTabModel
            tbl_sort = new TableRowSorter(model_pet);
            // setting the jTable with TableRowSorter for sorting/searching
            tbl_Pet.setRowSorter(tbl_sort);

            /** setting the TableRowSorter which filters the data in the table via value typed in search
             *  search - the keyword to be searched and find
             *  intger (0) - the column you want to look into. it can have as much as values as it can
             *  can also be written as (search, 0,1) to use the first two columns.
             *  0 representing the id and 1 representing the name column.
             */
            tbl_sort.setRowFilter(RowFilter.regexFilter(search, 0,1));
        }
    } // end of method

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        process();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
} // end of class
