package questionariojava;

import java.util.ArrayList;
import javax.swing.JLabel;
import questionariojava.ClasseNovasPerguntas;
/**
 *
 * @author almei
 */
public class Perguntas1 extends javax.swing.JFrame {

    public static int entrevistados = 1;

//..............................................................................
    public static int porc1mb = 0;
    public static int porc2mb = 0;
    public static int porc3mb = 0;
    public static int porc4mb = 0;
    public static int porc5mb = 0;
    public static int porc6mb = 0;
    public static int porc7mb = 0;
    public static int porc8mb = 0;
    public static int porc9mb = 0;
    public static int porc10mb = 0;

    public static int porc1b = 0;
    public static int porc2b = 0;
    public static int porc3b = 0;
    public static int porc4b = 0;
    public static int porc5b = 0;
    public static int porc6b = 0;
    public static int porc7b = 0;
    public static int porc8b = 0;
    public static int porc9b = 0;
    public static int porc10b = 0;

    public static int porc1m = 0;
    public static int porc2m = 0;
    public static int porc3m = 0;
    public static int porc4m = 0;
    public static int porc5m = 0;
    public static int porc6m = 0;
    public static int porc7m = 0;
    public static int porc8m = 0;
    public static int porc9m = 0;
    public static int porc10m = 0;

    public static int porc1r = 0;
    public static int porc2r = 0;
    public static int porc3r = 0;
    public static int porc4r = 0;
    public static int porc5r = 0;
    public static int porc6r = 0;
    public static int porc7r = 0;
    public static int porc8r = 0;
    public static int porc9r = 0;
    public static int porc10r = 0;

    public static int porc1mr = 0;
    public static int porc2mr = 0;
    public static int porc3mr = 0;
    public static int porc4mr = 0;
    public static int porc5mr = 0;
    public static int porc6mr = 0;
    public static int porc7mr = 0;
    public static int porc8mr = 0;
    public static int porc9mr = 0;
    public static int porc10mr = 0;

//..............................................................................
    public static int p1mb = 0;
    public static int p2mb = 0;
    public static int p3mb = 0;
    public static int p4mb = 0;
    public static int p5mb = 0;
    public static int p6mb = 0;
    public static int p7mb = 0;
    public static int p8mb = 0;
    public static int p9mb = 0;
    public static int p10mb = 0;
    public static int p11mb = 0;

    public static int p1b = 0;
    public static int p2b = 0;
    public static int p3b = 0;
    public static int p4b = 0;
    public static int p5b = 0;
    public static int p6b = 0;
    public static int p7b = 0;
    public static int p8b = 0;
    public static int p9b = 0;
    public static int p10b = 0;
    public static int p11b = 0;

    public static int p1m = 0;
    public static int p2m = 0;
    public static int p3m = 0;
    public static int p4m = 0;
    public static int p5m = 0;
    public static int p6m = 0;
    public static int p7m = 0;
    public static int p8m = 0;
    public static int p9m = 0;
    public static int p10m = 0;
    public static int p11m = 0;

    public static int p1r = 0;
    public static int p2r = 0;
    public static int p3r = 0;
    public static int p4r = 0;
    public static int p5r = 0;
    public static int p6r = 0;
    public static int p7r = 0;
    public static int p8r = 0;
    public static int p9r = 0;
    public static int p10r = 0;
    public static int p11r = 0;

    public static int p1mr = 0;
    public static int p2mr = 0;
    public static int p3mr = 0;
    public static int p4mr = 0;
    public static int p5mr = 0;
    public static int p6mr = 0;
    public static int p7mr = 0;
    public static int p8mr = 0;
    public static int p9mr = 0;
    public static int p10mr = 0;
    public static int p11mr = 0;

    public Perguntas1() {
        initComponents();
    }

    public void ExportarNovaPergunta(ClasseNovasPerguntas NewPergunta) {

        LBNPergunta.setText(NewPergunta.getPerguntaNova());       //importando uma nova pergunta

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        MB1 = new javax.swing.JButton();
        M1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        R1 = new javax.swing.JButton();
        MR1 = new javax.swing.JButton();
        MB2 = new javax.swing.JButton();
        MB3 = new javax.swing.JButton();
        MB4 = new javax.swing.JButton();
        MB5 = new javax.swing.JButton();
        MB6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        MB7 = new javax.swing.JButton();
        MB8 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        M2 = new javax.swing.JButton();
        M3 = new javax.swing.JButton();
        M4 = new javax.swing.JButton();
        M5 = new javax.swing.JButton();
        M6 = new javax.swing.JButton();
        M7 = new javax.swing.JButton();
        M8 = new javax.swing.JButton();
        R2 = new javax.swing.JButton();
        R3 = new javax.swing.JButton();
        R4 = new javax.swing.JButton();
        R5 = new javax.swing.JButton();
        R6 = new javax.swing.JButton();
        R7 = new javax.swing.JButton();
        R8 = new javax.swing.JButton();
        MR2 = new javax.swing.JButton();
        MR3 = new javax.swing.JButton();
        MR4 = new javax.swing.JButton();
        MR5 = new javax.swing.JButton();
        MR6 = new javax.swing.JButton();
        MR7 = new javax.swing.JButton();
        MR8 = new javax.swing.JButton();
        MB9 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        B9 = new javax.swing.JButton();
        M9 = new javax.swing.JButton();
        R9 = new javax.swing.JButton();
        MR9 = new javax.swing.JButton();
        MB10 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        M10 = new javax.swing.JButton();
        R10 = new javax.swing.JButton();
        MR10 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        EncerrarPesq = new javax.swing.JButton();
        ProximoEntr = new javax.swing.JButton();
        LBNPergunta = new javax.swing.JLabel();
        MB11 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        M11 = new javax.swing.JButton();
        R11 = new javax.swing.JButton();
        MR11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pergunta 1 - Qual seu nível de satisfação em relação ao atual desenvolvimento da cidade?");

        jLabel5.setText("Pergunta 3 - Em relação aos inventimentos com saúde sua opinião é?");

        jLabel10.setText("Pergunta 4 - Qual seu grau de satisfação em relação infraestrutura da cidade?");

        jLabel11.setText("Pergunta 2 - Como você considera o trânsito da cidade?");

        jLabel13.setText("Pergunta 6 - Como você considera a conservação dos patrimônios públicos de nossa cidade?");

        jLabel12.setText("Pergunta 5 - Sua opinião em relação a educação pública é?");

        jLabel34.setText("Pergunta 8 - Em relação ao comércio, considerando a variedade e qualidade de produtos, qual seu nível de satisfação?");

        MB1.setText("Muito Bom");
        MB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB1ActionPerformed(evt);
            }
        });

        M1.setText("Médio");
        M1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1ActionPerformed(evt);
            }
        });

        B1.setText("Bom");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        R1.setText("Ruim");
        R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });

        MR1.setText("Muito Ruim");
        MR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR1ActionPerformed(evt);
            }
        });

        MB2.setText("Muito Bom");
        MB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB2ActionPerformed(evt);
            }
        });

        MB3.setText("Muito Bom");
        MB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB3ActionPerformed(evt);
            }
        });

        MB4.setText("Muito Bom");
        MB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB4ActionPerformed(evt);
            }
        });

        MB5.setText("Muito Bom");
        MB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB5ActionPerformed(evt);
            }
        });

        MB6.setText("Muito Bom");
        MB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB6ActionPerformed(evt);
            }
        });

        jLabel15.setText("Pergunta 7 - Quanto a disponibilidade de vagas de empregos qual sua opinião?");

        MB7.setText("Muito Bom");
        MB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB7ActionPerformed(evt);
            }
        });

        MB8.setText("Muito Bom");
        MB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB8ActionPerformed(evt);
            }
        });

        B2.setText("Bom");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setText("Bom");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setText("Bom");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setText("Bom");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B6.setText("Bom");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B7.setText("Bom");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B8.setText("Bom");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        M2.setText("Médio");
        M2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2ActionPerformed(evt);
            }
        });

        M3.setText("Médio");
        M3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M3ActionPerformed(evt);
            }
        });

        M4.setText("Médio");
        M4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M4ActionPerformed(evt);
            }
        });

        M5.setText("Médio");
        M5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M5ActionPerformed(evt);
            }
        });

        M6.setText("Médio");
        M6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M6ActionPerformed(evt);
            }
        });

        M7.setText("Médio");
        M7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M7ActionPerformed(evt);
            }
        });

        M8.setText("Médio");
        M8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M8ActionPerformed(evt);
            }
        });

        R2.setText("Ruim");
        R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2ActionPerformed(evt);
            }
        });

        R3.setText("Ruim");
        R3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3ActionPerformed(evt);
            }
        });

        R4.setText("Ruim");
        R4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4ActionPerformed(evt);
            }
        });

        R5.setText("Ruim");
        R5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5ActionPerformed(evt);
            }
        });

        R6.setText("Ruim");
        R6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6ActionPerformed(evt);
            }
        });

        R7.setText("Ruim");
        R7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7ActionPerformed(evt);
            }
        });

        R8.setText("Ruim");
        R8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8ActionPerformed(evt);
            }
        });

        MR2.setText("Muito Ruim");
        MR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR2ActionPerformed(evt);
            }
        });

        MR3.setText("Muito Ruim");
        MR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR3ActionPerformed(evt);
            }
        });

        MR4.setText("Muito Ruim");
        MR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR4ActionPerformed(evt);
            }
        });

        MR5.setText("Muito Ruim");
        MR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR5ActionPerformed(evt);
            }
        });

        MR6.setText("Muito Ruim");
        MR6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR6ActionPerformed(evt);
            }
        });

        MR7.setText("Muito Ruim");
        MR7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR7ActionPerformed(evt);
            }
        });

        MR8.setText("Muito Ruim");
        MR8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR8ActionPerformed(evt);
            }
        });

        MB9.setText("Muito Bom");
        MB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB9ActionPerformed(evt);
            }
        });

        jLabel36.setText("Pergunta 9 - Considerando o entretenimento qual seu nível de satisfação?");

        B9.setText("Bom");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        M9.setText("Médio");
        M9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M9ActionPerformed(evt);
            }
        });

        R9.setText("Ruim");
        R9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9ActionPerformed(evt);
            }
        });

        MR9.setText("Muito Ruim");
        MR9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR9ActionPerformed(evt);
            }
        });

        MB10.setText("Muito Bom");
        MB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB10ActionPerformed(evt);
            }
        });

        B10.setText("Bom");
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        M10.setText("Médio");
        M10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M10ActionPerformed(evt);
            }
        });

        R10.setText("Ruim");
        R10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R10ActionPerformed(evt);
            }
        });

        MR10.setText("Muito Ruim");
        MR10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR10ActionPerformed(evt);
            }
        });

        jLabel16.setText("Pergunta 10 - Como você considera a segurança pública de nossa cidade?");

        EncerrarPesq.setBackground(new java.awt.Color(204, 255, 204));
        EncerrarPesq.setForeground(new java.awt.Color(0, 153, 0));
        EncerrarPesq.setText("Encerrar");
        EncerrarPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncerrarPesqActionPerformed(evt);
            }
        });

        ProximoEntr.setText("Próximo");
        ProximoEntr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProximoEntrActionPerformed(evt);
            }
        });

        LBNPergunta.setText("Não houve adição de nova pergunta");

        MB11.setText("Muito Bom");
        MB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MB11ActionPerformed(evt);
            }
        });

        B11.setText("Bom");
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        M11.setText("Médio");
        M11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M11ActionPerformed(evt);
            }
        });

        R11.setText("Ruim");
        R11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R11ActionPerformed(evt);
            }
        });

        MR11.setText("Muito Ruim");
        MR11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MB7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MR7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MB4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MR4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MB5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MR5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MB6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MR6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MB8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MR8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MB10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MR10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MB9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MR9))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MB1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MR1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MB3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MR3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(MB2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(M2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(R2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MR2)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ProximoEntr, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EncerrarPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBNPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MB11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(M11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MR11)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MB1)
                    .addComponent(B1)
                    .addComponent(M1)
                    .addComponent(R1)
                    .addComponent(MR1))
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MB2)
                    .addComponent(B2)
                    .addComponent(M2)
                    .addComponent(R2)
                    .addComponent(MR2))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MB3)
                    .addComponent(B3)
                    .addComponent(M3)
                    .addComponent(R3)
                    .addComponent(MR3))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MB4)
                    .addComponent(B4)
                    .addComponent(M4)
                    .addComponent(R4)
                    .addComponent(MR4))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MB5)
                    .addComponent(B5)
                    .addComponent(M5)
                    .addComponent(R5)
                    .addComponent(MR5))
                .addGap(13, 13, 13)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MB6)
                    .addComponent(B6)
                    .addComponent(M6)
                    .addComponent(R6)
                    .addComponent(MR6))
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MB7)
                    .addComponent(B7)
                    .addComponent(M7)
                    .addComponent(R7)
                    .addComponent(MR7))
                .addGap(18, 18, 18)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MB8)
                    .addComponent(B8)
                    .addComponent(M8)
                    .addComponent(R8)
                    .addComponent(MR8))
                .addGap(18, 18, 18)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MB9)
                    .addComponent(B9)
                    .addComponent(M9)
                    .addComponent(R9)
                    .addComponent(MR9))
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MB10)
                    .addComponent(B10)
                    .addComponent(M10)
                    .addComponent(R10)
                    .addComponent(MR10))
                .addGap(18, 18, 18)
                .addComponent(LBNPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MB11)
                    .addComponent(B11)
                    .addComponent(M11)
                    .addComponent(R11)
                    .addComponent(MR11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProximoEntr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EncerrarPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB1ActionPerformed
        Perguntas1.p1mb++;
    }//GEN-LAST:event_MB1ActionPerformed

    private void M1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1ActionPerformed
        Perguntas1.p1m++;
    }//GEN-LAST:event_M1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        Perguntas1.p1b++;
    }//GEN-LAST:event_B1ActionPerformed

    private void R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1ActionPerformed
        Perguntas1.p1r++;
    }//GEN-LAST:event_R1ActionPerformed

    private void MR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR1ActionPerformed
        Perguntas1.p1mr++;
    }//GEN-LAST:event_MR1ActionPerformed

    private void MB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB2ActionPerformed
        Perguntas1.p2mb++;
    }//GEN-LAST:event_MB2ActionPerformed

    private void MB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB3ActionPerformed
        Perguntas1.p3mb++;
    }//GEN-LAST:event_MB3ActionPerformed

    private void MB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB4ActionPerformed
        Perguntas1.p4mb++;
    }//GEN-LAST:event_MB4ActionPerformed

    private void MB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB5ActionPerformed
        Perguntas1.p5mb++;
    }//GEN-LAST:event_MB5ActionPerformed

    private void MB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB6ActionPerformed
        Perguntas1.p6mb++;
    }//GEN-LAST:event_MB6ActionPerformed

    private void MB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB7ActionPerformed
        Perguntas1.p7mb++;
    }//GEN-LAST:event_MB7ActionPerformed

    private void MB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB8ActionPerformed
        Perguntas1.p8mb++;
    }//GEN-LAST:event_MB8ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        Perguntas1.p2b++;
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        Perguntas1.p3b++;
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        Perguntas1.p4b++;
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        Perguntas1.p5b++;
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        Perguntas1.p6b++;
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        Perguntas1.p7b++;
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        Perguntas1.p8b++;
    }//GEN-LAST:event_B8ActionPerformed

    private void M2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2ActionPerformed
        Perguntas1.p2m++;
    }//GEN-LAST:event_M2ActionPerformed

    private void M3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M3ActionPerformed
        Perguntas1.p3m++;
    }//GEN-LAST:event_M3ActionPerformed

    private void M4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M4ActionPerformed
        Perguntas1.p4m++;
    }//GEN-LAST:event_M4ActionPerformed

    private void M5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M5ActionPerformed
        Perguntas1.p5m++;
    }//GEN-LAST:event_M5ActionPerformed

    private void M6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M6ActionPerformed
        Perguntas1.p6m++;
    }//GEN-LAST:event_M6ActionPerformed

    private void M7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M7ActionPerformed
        Perguntas1.p7m++;
    }//GEN-LAST:event_M7ActionPerformed

    private void M8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M8ActionPerformed
        Perguntas1.p8m++;
    }//GEN-LAST:event_M8ActionPerformed

    private void R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2ActionPerformed
        Perguntas1.p2r++;
    }//GEN-LAST:event_R2ActionPerformed

    private void R3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3ActionPerformed
        Perguntas1.p3r++;
    }//GEN-LAST:event_R3ActionPerformed

    private void R4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4ActionPerformed
        Perguntas1.p4r++;
    }//GEN-LAST:event_R4ActionPerformed

    private void R5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5ActionPerformed
        Perguntas1.p5r++;
    }//GEN-LAST:event_R5ActionPerformed

    private void R6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6ActionPerformed
        Perguntas1.p6r++;
    }//GEN-LAST:event_R6ActionPerformed

    private void R7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7ActionPerformed
        Perguntas1.p7r++;
    }//GEN-LAST:event_R7ActionPerformed

    private void R8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8ActionPerformed
        Perguntas1.p8r++;
    }//GEN-LAST:event_R8ActionPerformed

    private void MR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR2ActionPerformed
        Perguntas1.p2mr++;
    }//GEN-LAST:event_MR2ActionPerformed

    private void MR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR3ActionPerformed
        Perguntas1.p3mr++;
    }//GEN-LAST:event_MR3ActionPerformed

    private void MR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR4ActionPerformed
        Perguntas1.p4mr++;
    }//GEN-LAST:event_MR4ActionPerformed

    private void MR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR5ActionPerformed
        Perguntas1.p5mr++;
    }//GEN-LAST:event_MR5ActionPerformed

    private void MR6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR6ActionPerformed
        Perguntas1.p6mr++;
    }//GEN-LAST:event_MR6ActionPerformed

    private void MR7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR7ActionPerformed
        Perguntas1.p7mr++;
    }//GEN-LAST:event_MR7ActionPerformed

    private void MR8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR8ActionPerformed
        Perguntas1.p8mr++;
    }//GEN-LAST:event_MR8ActionPerformed

    private void MB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB9ActionPerformed
        Perguntas1.p9mb++;
    }//GEN-LAST:event_MB9ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        Perguntas1.p9b++;
    }//GEN-LAST:event_B9ActionPerformed

    private void M9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M9ActionPerformed
        Perguntas1.p9m++;
    }//GEN-LAST:event_M9ActionPerformed

    private void R9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9ActionPerformed
        Perguntas1.p9r++;
    }//GEN-LAST:event_R9ActionPerformed

    private void MR9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR9ActionPerformed
        Perguntas1.p9mr++;
    }//GEN-LAST:event_MR9ActionPerformed

    private void MB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB10ActionPerformed
        Perguntas1.p10mb++;
    }//GEN-LAST:event_MB10ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        Perguntas1.p10b++;
    }//GEN-LAST:event_B10ActionPerformed

    private void M10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M10ActionPerformed
        Perguntas1.p10m++;
    }//GEN-LAST:event_M10ActionPerformed

    private void R10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R10ActionPerformed
        Perguntas1.p10r++;
    }//GEN-LAST:event_R10ActionPerformed

    private void MR10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR10ActionPerformed
        Perguntas1.p10mr++;
    }//GEN-LAST:event_MR10ActionPerformed

    private void EncerrarPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncerrarPesqActionPerformed

        Perguntas1.porc1mb = p1mb * 100 / entrevistados;
        Perguntas1.porc2mb = p2mb * 100 / entrevistados;
        Perguntas1.porc3mb = p3mb * 100 / entrevistados;
        Perguntas1.porc4mb = p4mb * 100 / entrevistados;
        Perguntas1.porc5mb = p5mb * 100 / entrevistados;
        Perguntas1.porc6mb = p6mb * 100 / entrevistados;
        Perguntas1.porc7mb = p7mb * 100 / entrevistados;
        Perguntas1.porc8mb = p8mb * 100 / entrevistados;
        Perguntas1.porc9mb = p9mb * 100 / entrevistados;
        Perguntas1.porc10mb = p10mb * 100 / entrevistados;

        Perguntas1.porc1b = p1b * 100 / entrevistados;
        Perguntas1.porc2b = p2b * 100 / entrevistados;
        Perguntas1.porc3b = p3b * 100 / entrevistados;
        Perguntas1.porc4b = p4b * 100 / entrevistados;
        Perguntas1.porc5b = p5b * 100 / entrevistados;
        Perguntas1.porc6b = p6b * 100 / entrevistados;
        Perguntas1.porc7b = p7b * 100 / entrevistados;
        Perguntas1.porc8b = p1b * 100 / entrevistados;
        Perguntas1.porc9b = p9b * 100 / entrevistados;
        Perguntas1.porc10b = p10b * 100 / entrevistados;

        Perguntas1.porc1m = p1m * 100 / entrevistados;
        Perguntas1.porc2m = p2m * 100 / entrevistados;
        Perguntas1.porc3m = p3m * 100 / entrevistados;
        Perguntas1.porc4m = p4m * 100 / entrevistados;
        Perguntas1.porc5m = p5m * 100 / entrevistados;
        Perguntas1.porc6m = p6m * 100 / entrevistados;
        Perguntas1.porc7m = p7m * 100 / entrevistados;
        Perguntas1.porc8m = p8m * 100 / entrevistados;
        Perguntas1.porc9m = p9m * 100 / entrevistados;
        Perguntas1.porc10m = p10m * 100 / entrevistados;

        Perguntas1.porc1r = p1r * 100 / entrevistados;
        Perguntas1.porc2r = p2r * 100 / entrevistados;
        Perguntas1.porc3r = p3r * 100 / entrevistados;
        Perguntas1.porc4r = p4r * 100 / entrevistados;
        Perguntas1.porc5r = p5r * 100 / entrevistados;
        Perguntas1.porc6r = p6r * 100 / entrevistados;
        Perguntas1.porc7r = p7r * 100 / entrevistados;
        Perguntas1.porc8r = p8r * 100 / entrevistados;
        Perguntas1.porc9r = p9r * 100 / entrevistados;
        Perguntas1.porc10r = p10r * 100 / entrevistados;

        Perguntas1.porc1mr = p1mr * 100 / entrevistados;
        Perguntas1.porc2mr = p2mr * 100 / entrevistados;
        Perguntas1.porc3mr = p3mr * 100 / entrevistados;
        Perguntas1.porc4mr = p4mr * 100 / entrevistados;
        Perguntas1.porc5mr = p5mr * 100 / entrevistados;
        Perguntas1.porc6mr = p6mr * 100 / entrevistados;
        Perguntas1.porc7mr = p7mr * 100 / entrevistados;
        Perguntas1.porc8mr = p8mr * 100 / entrevistados;
        Perguntas1.porc9mr = p9mr * 100 / entrevistados;
        Perguntas1.porc10mr = p10mr * 100 / entrevistados;

        EncerrarPesq.addActionListener(e -> this.dispose());
        new Encerrar().setVisible(true);                       //encerra tudo
    }//GEN-LAST:event_EncerrarPesqActionPerformed

    private void ProximoEntrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProximoEntrActionPerformed
        Perguntas1.entrevistados++;
        new Perguntas1().setVisible(true);       //abre nova janela de perguntas
    }//GEN-LAST:event_ProximoEntrActionPerformed

    private void MB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MB11ActionPerformed
        Perguntas1.p11mb++;
    }//GEN-LAST:event_MB11ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        Perguntas1.p11b++;
    }//GEN-LAST:event_B11ActionPerformed

    private void M11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M11ActionPerformed
        Perguntas1.p11m++;
    }//GEN-LAST:event_M11ActionPerformed

    private void R11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R11ActionPerformed
        Perguntas1.p11r++;
    }//GEN-LAST:event_R11ActionPerformed

    private void MR11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR11ActionPerformed
        Perguntas1.p11mr++;
    }//GEN-LAST:event_MR11ActionPerformed

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
            java.util.logging.Logger.getLogger(Perguntas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perguntas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perguntas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perguntas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perguntas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton EncerrarPesq;
    private javax.swing.JLabel LBNPergunta;
    private javax.swing.JButton M1;
    private javax.swing.JButton M10;
    private javax.swing.JButton M11;
    private javax.swing.JButton M2;
    private javax.swing.JButton M3;
    private javax.swing.JButton M4;
    private javax.swing.JButton M5;
    private javax.swing.JButton M6;
    private javax.swing.JButton M7;
    private javax.swing.JButton M8;
    private javax.swing.JButton M9;
    private javax.swing.JButton MB1;
    private javax.swing.JButton MB10;
    private javax.swing.JButton MB11;
    private javax.swing.JButton MB2;
    private javax.swing.JButton MB3;
    private javax.swing.JButton MB4;
    private javax.swing.JButton MB5;
    private javax.swing.JButton MB6;
    private javax.swing.JButton MB7;
    private javax.swing.JButton MB8;
    private javax.swing.JButton MB9;
    private javax.swing.JButton MR1;
    private javax.swing.JButton MR10;
    private javax.swing.JButton MR11;
    private javax.swing.JButton MR2;
    private javax.swing.JButton MR3;
    private javax.swing.JButton MR4;
    private javax.swing.JButton MR5;
    private javax.swing.JButton MR6;
    private javax.swing.JButton MR7;
    private javax.swing.JButton MR8;
    private javax.swing.JButton MR9;
    private javax.swing.JButton ProximoEntr;
    private javax.swing.JButton R1;
    private javax.swing.JButton R10;
    private javax.swing.JButton R11;
    private javax.swing.JButton R2;
    private javax.swing.JButton R3;
    private javax.swing.JButton R4;
    private javax.swing.JButton R5;
    private javax.swing.JButton R6;
    private javax.swing.JButton R7;
    private javax.swing.JButton R8;
    private javax.swing.JButton R9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
