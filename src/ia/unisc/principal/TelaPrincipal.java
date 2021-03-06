/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia.unisc.principal;

import ia.unisc.controles.ControlePrincipal;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Machine
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exercicioBox = new javax.swing.JComboBox<>();
        legumesBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        tabagismoBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        telaInformacoes = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        reconhecerButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sexoBox = new javax.swing.JComboBox<>();
        idadeBox = new javax.swing.JComboBox<>();
        gestacionalBox = new javax.swing.JComboBox<>();
        familiaBox = new javax.swing.JComboBox<>();
        cinturaBox = new javax.swing.JComboBox<>();
        pressaoBox = new javax.swing.JComboBox<>();
        massaBox = new javax.swing.JComboBox<>();
        glicoseBox = new javax.swing.JComboBox<>();
        medicamentoBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        intermedBox = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        aprendBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        baixoButton = new javax.swing.JButton();
        elevadoButton = new javax.swing.JButton();
        moderadoButton = new javax.swing.JButton();
        altoButton = new javax.swing.JButton();
        muitoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RNA Diabetes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        exercicioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        exercicioBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exercicioBoxActionPerformed(evt);
            }
        });

        legumesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos os dias", "Nem todo dia" }));
        legumesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                legumesBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Idade");

        tabagismoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Fumante", "Ex-fumante", "Fumante" }));
        tabagismoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabagismoBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Diabetes Gestacional");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Número Neurônio", "Valor Saída"
            }
        ));
        jScrollPane1.setViewportView(resultTable);

        jLabel4.setText("Diabéticos na família");

        jLabel5.setText("Circunferência da cintura(abaixo das costelas)");

        telaInformacoes.setColumns(20);
        telaInformacoes.setRows(5);
        jScrollPane2.setViewportView(telaInformacoes);

        jLabel6.setText("Pressão Alta");

        jLabel7.setText("Massa Corporal");

        reconhecerButton.setText("Reconhecer");
        reconhecerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reconhecerButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Caso de glicose alta");

        jLabel9.setText("Algum remédio para pressão alta");

        jLabel10.setText("30 minutos de exercícios físicos");

        jLabel11.setText("Ingeri legumes");

        jLabel12.setText("Tabagismo");

        sexoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mulher", "Homem" }));

        idadeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menos de 45", "45-54", "54-64", "Mais de 64" }));
        idadeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeBoxActionPerformed(evt);
            }
        });

        gestacionalBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        familiaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim(avós/tias/tios/primos)", "Sim(pais/irmãos/filhos)" }));

        cinturaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menos de 94 cm", "94-102 cm", "Mais de 102 cm" }));

        pressaoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        massaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menos que 25 kg/m²", "25-30 kg/m²", "Mais que 30kg/m²" }));
        massaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massaBoxActionPerformed(evt);
            }
        });

        glicoseBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        glicoseBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glicoseBoxActionPerformed(evt);
            }
        });

        medicamentoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        medicamentoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicamentoBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Sexo");

        intermedBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        jLabel13.setText("Neurônios Intermediários");

        jLabel14.setText("Taxa Aprendizado");

        aprendBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.55", "0.60", "0.65", "0.70", "0.75", "0.80", "0.85", "0.90", "0.95", "1.00" }));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        baixoButton.setText("Baixo");
        baixoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baixoButtonActionPerformed(evt);
            }
        });

        elevadoButton.setText("Pouco Elevado");
        elevadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevadoButtonActionPerformed(evt);
            }
        });

        moderadoButton.setText("Moderado");
        moderadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moderadoButtonActionPerformed(evt);
            }
        });

        altoButton.setText("Alto");
        altoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altoButtonActionPerformed(evt);
            }
        });

        muitoButton.setText("Muito Alto");
        muitoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muitoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reconhecerButton)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aprendBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sexoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gestacionalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(familiaBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 172, Short.MAX_VALUE)
                                        .addComponent(cinturaBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pressaoBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(massaBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(glicoseBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(medicamentoBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(exercicioBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(legumesBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tabagismoBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(elevadoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(baixoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(muitoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(altoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(moderadoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(intermedBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sexoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idadeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(gestacionalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(familiaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cinturaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(pressaoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(massaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(glicoseBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(medicamentoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(exercicioBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(legumesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tabagismoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(baixoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(elevadoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moderadoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(altoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(muitoButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(intermedBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(aprendBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reconhecerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exercicioBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exercicioBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exercicioBoxActionPerformed

    private void legumesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_legumesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_legumesBoxActionPerformed

    private void tabagismoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabagismoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabagismoBoxActionPerformed

    private void reconhecerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reconhecerButtonActionPerformed

        String entradas = "";
        ControlePrincipal principal = new ControlePrincipal();
        double[] saidas;
        String saidaCriptografada;
        ArrayList<String> informacoes;
        String texto;

        //Sexo
        if (sexoBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0");
        } else if (sexoBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("1");
        }
        entradas = entradas.concat(",");
        //Idade
        if (idadeBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0,0,0");
        } else if (idadeBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("0,0,1");
        } else if (idadeBox.getSelectedIndex() == 2) {
            entradas = entradas.concat("0,1,0");
        } else if (idadeBox.getSelectedIndex() == 3) {
            entradas = entradas.concat("0,1,1");
        }
        entradas = entradas.concat(",");
        //Diabetes Gestacional
        if (gestacionalBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0");
        } else if (gestacionalBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("1");
        }
        entradas = entradas.concat(",");
        //Membros da Família
        if (familiaBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0,0");
        } else if (familiaBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("0,1");
        } else if (familiaBox.getSelectedIndex() == 2) {
            entradas = entradas.concat("1,0");
        }
        entradas = entradas.concat(",");
        //Cintura
        if (cinturaBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0,0");
        } else if (cinturaBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("0,1");
        } else if (cinturaBox.getSelectedIndex() == 2) {
            entradas = entradas.concat("1,0");
        }
        entradas = entradas.concat(",");
        //Pressão Alta
        if (pressaoBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0");
        } else if (pressaoBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("1");
        }
        entradas = entradas.concat(",");
        //Massa Coporal
        if (massaBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0,0");
        } else if (massaBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("0,1");
        } else if (massaBox.getSelectedIndex() == 2) {
            entradas = entradas.concat("1,0");
        }
        entradas = entradas.concat(",");
        //Glicose
        if (glicoseBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0");
        } else if (glicoseBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("1");
        }
        entradas = entradas.concat(",");
        //Medicamento
        if (medicamentoBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0");
        } else if (medicamentoBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("1");
        }
        entradas = entradas.concat(",");
        //Exercícios
        if (exercicioBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0");
        } else if (exercicioBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("1");
        }
        entradas = entradas.concat(",");
        //Legumes
        if (legumesBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0");
        } else if (legumesBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("1");
        }
        entradas = entradas.concat(",");
        //Tabagismo
        if (tabagismoBox.getSelectedIndex() == 0) {
            entradas = entradas.concat("0,0");
        } else if (tabagismoBox.getSelectedIndex() == 1) {
            entradas = entradas.concat("0,1");
        } else if (tabagismoBox.getSelectedIndex() == 2) {
            entradas = entradas.concat("1,0");
        }
        try {

            //Mostra os neurônios de saída na tabela
            principal.trainingRNA(Integer.valueOf(intermedBox.getSelectedItem().toString()), Double.valueOf(aprendBox.getSelectedItem().toString()));//Começa o treinamento da RNA
            saidas = principal.processingInput(entradas);//pega o resultado dos neurônios de entrada que foram selecionados
            DefaultTableModel model = new DefaultTableModel();//Instancia o modelo da tabela de resultados
            JTable table = new JTable(model);//Instancia a tabela de resultados

            model.addColumn("Numéro Neurônios");
            model.addColumn("Valor Saída");

            model.addRow(new Object[]{1, saidas[0]});//Popula da tabela de resultados
            model.addRow(new Object[]{2, saidas[1]});
            model.addRow(new Object[]{3, saidas[2]});

            resultTable.setModel(model);//Mostra na tabela os resultados

            informacoes = principal.getInformationAboutSearch();//Pega a taxa de erro, taxa de aprendizado, número de iterações máxima, e número de iterações para chegar ao resultado
            saidaCriptografada = principal.criptografaSaida(saidas);//Criptografa a saida para (Baixo, Pouco Elevado, Moderado, Alto, Muito Alto)

            texto = "Taxa de erro: " + (Double.parseDouble(informacoes.get(0)) * 100) + "%\n"//Mostra as informações do adrena
                    + "Número de iterações: " + informacoes.get(1) + "\n"
                    + "Número de iterações máximo: " + informacoes.get(2) + "\n"
                    + "Taxa de aprendizado: " + (Double.parseDouble(informacoes.get(3))) + "%\n"
                    + "Probabilidade de diabetes: " + saidaCriptografada;

            telaInformacoes.setText(texto);//Mostra as informações do adrena na tela

        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reconhecerButtonActionPerformed

    private void idadeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeBoxActionPerformed

    private void massaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_massaBoxActionPerformed

    private void glicoseBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glicoseBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_glicoseBoxActionPerformed

    private void medicamentoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicamentoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicamentoBoxActionPerformed

    private void baixoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baixoButtonActionPerformed
        sexoBox.setSelectedIndex(0);
        idadeBox.setSelectedIndex(0);
        gestacionalBox.setSelectedIndex(0);
        familiaBox.setSelectedIndex(0);
        cinturaBox.setSelectedIndex(0);
        pressaoBox.setSelectedIndex(0);
        massaBox.setSelectedIndex(0);
        glicoseBox.setSelectedIndex(0);
        medicamentoBox.setSelectedIndex(0);
        exercicioBox.setSelectedIndex(1);
        legumesBox.setSelectedIndex(0);
        tabagismoBox.setSelectedIndex(0);
    }//GEN-LAST:event_baixoButtonActionPerformed

    private void elevadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevadoButtonActionPerformed
        sexoBox.setSelectedIndex(1);
        idadeBox.setSelectedIndex(3);
        gestacionalBox.setSelectedIndex(0);
        familiaBox.setSelectedIndex(0);
        cinturaBox.setSelectedIndex(0);
        pressaoBox.setSelectedIndex(0);
        massaBox.setSelectedIndex(0);
        glicoseBox.setSelectedIndex(0);
        medicamentoBox.setSelectedIndex(0);
        exercicioBox.setSelectedIndex(0);
        legumesBox.setSelectedIndex(0);
        tabagismoBox.setSelectedIndex(0);
    }//GEN-LAST:event_elevadoButtonActionPerformed

    private void moderadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moderadoButtonActionPerformed
        sexoBox.setSelectedIndex(1);
        idadeBox.setSelectedIndex(3);
        gestacionalBox.setSelectedIndex(0);
        familiaBox.setSelectedIndex(0);
        cinturaBox.setSelectedIndex(0);
        pressaoBox.setSelectedIndex(0);
        massaBox.setSelectedIndex(0);
        glicoseBox.setSelectedIndex(0);
        medicamentoBox.setSelectedIndex(0);
        exercicioBox.setSelectedIndex(0);
        legumesBox.setSelectedIndex(1);
        tabagismoBox.setSelectedIndex(2);
    }//GEN-LAST:event_moderadoButtonActionPerformed

    private void altoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altoButtonActionPerformed
        sexoBox.setSelectedIndex(1);
        idadeBox.setSelectedIndex(3);
        gestacionalBox.setSelectedIndex(0);
        familiaBox.setSelectedIndex(2);
        cinturaBox.setSelectedIndex(0);
        pressaoBox.setSelectedIndex(0);
        massaBox.setSelectedIndex(0);
        glicoseBox.setSelectedIndex(0);
        medicamentoBox.setSelectedIndex(0);
        exercicioBox.setSelectedIndex(1);
        legumesBox.setSelectedIndex(1);
        tabagismoBox.setSelectedIndex(2);
    }//GEN-LAST:event_altoButtonActionPerformed

    private void muitoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muitoButtonActionPerformed
        sexoBox.setSelectedIndex(1);
        idadeBox.setSelectedIndex(3);
        gestacionalBox.setSelectedIndex(0);
        familiaBox.setSelectedIndex(2);
        cinturaBox.setSelectedIndex(0);
        pressaoBox.setSelectedIndex(1);
        massaBox.setSelectedIndex(2);
        glicoseBox.setSelectedIndex(0);
        medicamentoBox.setSelectedIndex(0);
        exercicioBox.setSelectedIndex(0);
        legumesBox.setSelectedIndex(1);
        tabagismoBox.setSelectedIndex(2);
    }//GEN-LAST:event_muitoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altoButton;
    private javax.swing.JComboBox<String> aprendBox;
    private javax.swing.JButton baixoButton;
    private javax.swing.JComboBox<String> cinturaBox;
    private javax.swing.JButton elevadoButton;
    private javax.swing.JComboBox<String> exercicioBox;
    private javax.swing.JComboBox<String> familiaBox;
    private javax.swing.JComboBox<String> gestacionalBox;
    private javax.swing.JComboBox<String> glicoseBox;
    private javax.swing.JComboBox<String> idadeBox;
    private javax.swing.JComboBox<String> intermedBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> legumesBox;
    private javax.swing.JComboBox<String> massaBox;
    private javax.swing.JComboBox<String> medicamentoBox;
    private javax.swing.JButton moderadoButton;
    private javax.swing.JButton muitoButton;
    private javax.swing.JComboBox<String> pressaoBox;
    private javax.swing.JButton reconhecerButton;
    private javax.swing.JTable resultTable;
    private javax.swing.JComboBox<String> sexoBox;
    private javax.swing.JComboBox<String> tabagismoBox;
    private javax.swing.JTextArea telaInformacoes;
    // End of variables declaration//GEN-END:variables
}
