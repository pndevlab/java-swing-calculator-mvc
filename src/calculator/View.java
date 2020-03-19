package calculator;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 * The Calculator View.
 *
 * Created (mostly) automatically by NetBeans.
 *
 * @author Andrés Salinas Lima <i52salia@uco.es>
 */
final class View extends javax.swing.JFrame {

    /**
     * Constructor for the View class.
     */
    public View() {
        initComponents();
        setVisible(true);
        setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resultScrollPane = new javax.swing.JScrollPane();
        resultField = new javax.swing.JTextField();
        operationField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        cleanButton = new javax.swing.JButton();
        signButton = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        mulButton = new javax.swing.JButton();
        subButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();
        num1Button = new javax.swing.JButton();
        num2Button = new javax.swing.JButton();
        num3Button = new javax.swing.JButton();
        num4Button = new javax.swing.JButton();
        num5Button = new javax.swing.JButton();
        num6Button = new javax.swing.JButton();
        num7Button = new javax.swing.JButton();
        num8Button = new javax.swing.JButton();
        num9Button = new javax.swing.JButton();
        num0Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        resultScrollPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resultScrollPane.setFocusable(false);

        resultField.setEditable(false);
        resultField.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        resultField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultField.setText("1234567890,123");
        resultField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        resultField.setFocusable(false);
        resultScrollPane.setViewportView(resultField);

        operationField.setEditable(false);
        operationField.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        operationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        operationField.setText("+");
        operationField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        operationField.setFocusable(false);

        resetButton.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        resetButton.setText("AC");
        resetButton.setFocusable(false);

        cleanButton.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cleanButton.setText("CE");
        cleanButton.setFocusable(false);

        signButton.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        signButton.setForeground(new java.awt.Color(255, 98, 0));
        signButton.setText("+/-");
        signButton.setFocusable(false);

        divButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        divButton.setForeground(new java.awt.Color(255, 98, 0));
        divButton.setText("÷");
        divButton.setFocusable(false);

        mulButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        mulButton.setForeground(new java.awt.Color(255, 98, 0));
        mulButton.setText("×");
        mulButton.setFocusable(false);

        subButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        subButton.setForeground(new java.awt.Color(255, 98, 0));
        subButton.setText("-");
        subButton.setFocusable(false);

        addButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 98, 0));
        addButton.setText("+");
        addButton.setFocusable(false);

        equalButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        equalButton.setForeground(new java.awt.Color(255, 0, 0));
        equalButton.setText("=");
        equalButton.setFocusable(false);

        dotButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        dotButton.setText(".");
        dotButton.setFocusable(false);

        num1Button.setText("1");
        num1Button.setFocusable(false);

        num2Button.setText("2");
        num2Button.setFocusable(false);

        num3Button.setText("3");
        num3Button.setFocusable(false);

        num4Button.setText("4");
        num4Button.setFocusable(false);

        num5Button.setText("5");
        num5Button.setFocusable(false);

        num6Button.setText("6");
        num6Button.setFocusable(false);

        num7Button.setText("7");
        num7Button.setFocusable(false);

        num8Button.setText("8");
        num8Button.setFocusable(false);

        num9Button.setText("9");
        num9Button.setFocusable(false);

        num0Button.setText("0");
        num0Button.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(num0Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(resultScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(operationField))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(num5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(num7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(num8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(num9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(signButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resultScrollPane)
                    .addComponent(operationField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mulButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Returns the addButton button.
     * @return the addButton button.
     */
    public JButton getAddButton() {
        return addButton;
    }

    /**
     * Returns the resetButton button.
     * @return the resetButton button.
     */
    public JButton getResetButton() {
        return resetButton;
    }

    /**
     * Returns the cleanButton button.
     * @return the cleanButton button.
     */
    public JButton getCleanButton() {
        return cleanButton;
    }

    /**
     * Returns the resultField field.
     * @return the resultField field.
     */
    public JTextField getResultField() {
        return resultField;
    }

    /**
     * Returns the resultScrollPane scroll pane.
     * @return the resultScrollPane scroll pane.
     */
    public JScrollPane getResultScrollPane() {
        return resultScrollPane;
    }

    /**
     * Returns the divButton button.
     * @return the divButton button.
     */
    public JButton getDivButton() {
        return divButton;
    }

    /**
     * Returns the dotButton button.
     * @return the dotButton button.
     */
    public JButton getDotButton() {
        return dotButton;
    }

    /**
     * Returns the equalButton button.
     * @return the equalButton button.
     */
    public JButton getEqualButton() {
        return equalButton;
    }

    /**
     * Returns the mulButton button.
     * @return the mulButton button.
     */
    public JButton getMulButton() {
        return mulButton;
    }

    /**
     * Returns the num0Button button.
     * @return the num0Button button.
     */
    public JButton getNum0Button() {
        return num0Button;
    }

    /**
     * Returns the num1Button button.
     * @return the num1Button button.
     */
    public JButton getNum1Button() {
        return num1Button;
    }

    /**
     * Returns the num2Button button.
     * @return the num2Button button.
     */
    public JButton getNum2Button() {
        return num2Button;
    }

    /**
     * Returns the num3Button button.
     * @return the num3Button button.
     */
    public JButton getNum3Button() {
        return num3Button;
    }

    /**
     * Returns the num4Button button.
     * @return the num4Button button.
     */
    public JButton getNum4Button() {
        return num4Button;
    }

    /**
     * Returns the num5Button button.
     * @return the num5Button button.
     */
    public JButton getNum5Button() {
        return num5Button;
    }

    /**
     * Returns the num6Button button.
     * @return the num6Button button.
     */
    public JButton getNum6Button() {
        return num6Button;
    }

    /**
     * Returns the num7Button button.
     * @return the num7Button button.
     */
    public JButton getNum7Button() {
        return num7Button;
    }

    /**
     * Returns the num8Button button.
     * @return the num8Button button.
     */
    public JButton getNum8Button() {
        return num8Button;
    }

    /**
     * Returns the num9Button button.
     * @return the num9Button button.
     */
    public JButton getNum9Button() {
        return num9Button;
    }

    /**
     * Returns the operationField field.
     * @return the operationField field.
     */
    public JTextField getOperationField() {
        return operationField;
    }

    /**
     * Returns the signButton button.
     * @return the signButton button.
     */
    public JButton getSignButton() {
        return signButton;
    }

    /**
     * Returns the subButton button.
     * @return the subButton button.
     */
    public JButton getSubButton() {
        return subButton;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cleanButton;
    private javax.swing.JButton divButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JButton mulButton;
    private javax.swing.JButton num0Button;
    private javax.swing.JButton num1Button;
    private javax.swing.JButton num2Button;
    private javax.swing.JButton num3Button;
    private javax.swing.JButton num4Button;
    private javax.swing.JButton num5Button;
    private javax.swing.JButton num6Button;
    private javax.swing.JButton num7Button;
    private javax.swing.JButton num8Button;
    private javax.swing.JButton num9Button;
    private javax.swing.JTextField operationField;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField resultField;
    private javax.swing.JScrollPane resultScrollPane;
    private javax.swing.JButton signButton;
    private javax.swing.JButton subButton;
    // End of variables declaration//GEN-END:variables
}
