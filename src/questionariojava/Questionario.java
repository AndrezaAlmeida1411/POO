package questionariojava;
/**
 *
 * @author almei
 */
public class Questionario extends javax.swing.JFrame {

    public Questionario() {
        initComponents();
        
        this.Entrevistados.setText(String.valueOf("Total de Entrevistados: " + Perguntas1.entrevistados));
        
        this.R1.setText(String.valueOf(Perguntas1.porc1mb + "%"));
        this.R2.setText(String.valueOf(Perguntas1.porc2mb + "%"));
        this.R3.setText(String.valueOf(Perguntas1.porc3mb + "%"));
        this.R4.setText(String.valueOf(Perguntas1.porc4mb + "%"));
        this.R5.setText(String.valueOf(Perguntas1.porc5mb + "%"));
        this.R6.setText(String.valueOf(Perguntas1.porc6mb + "%"));
        this.R7.setText(String.valueOf(Perguntas1.porc7mb + "%"));
        this.R8.setText(String.valueOf(Perguntas1.porc8mb + "%"));
        this.R9.setText(String.valueOf(Perguntas1.porc9mb + "%"));
        this.R10.setText(String.valueOf(Perguntas1.porc10mb + "%"));
        
        this.R1B.setText(String.valueOf(Perguntas1.porc1b + "%"));
        this.R2B.setText(String.valueOf(Perguntas1.porc2b + "%"));
        this.R3B.setText(String.valueOf(Perguntas1.porc3b + "%"));
        this.R4B.setText(String.valueOf(Perguntas1.porc4b + "%"));
        this.R5B.setText(String.valueOf(Perguntas1.porc5b + "%"));
        this.R6B.setText(String.valueOf(Perguntas1.porc6b + "%"));
        this.R7B.setText(String.valueOf(Perguntas1.porc7b + "%"));
        this.R8B.setText(String.valueOf(Perguntas1.porc8b + "%"));
        this.R9B.setText(String.valueOf(Perguntas1.porc9b + "%"));
        this.R10B.setText(String.valueOf(Perguntas1.porc10b + "%"));
        
        this.R1M.setText(String.valueOf(Perguntas1.porc1m + "%"));
        this.R2M.setText(String.valueOf(Perguntas1.porc2m + "%"));
        this.R3M.setText(String.valueOf(Perguntas1.porc3m + "%"));
        this.R4M.setText(String.valueOf(Perguntas1.porc4m + "%"));
        this.R5M.setText(String.valueOf(Perguntas1.porc5m + "%"));
        this.R6M.setText(String.valueOf(Perguntas1.porc6m + "%"));
        this.R7M.setText(String.valueOf(Perguntas1.porc7m + "%"));
        this.R8M.setText(String.valueOf(Perguntas1.porc8m + "%"));
        this.R9M.setText(String.valueOf(Perguntas1.porc9m + "%"));
        this.R10M.setText(String.valueOf(Perguntas1.porc10m + "%"));
  
        this.R1R.setText(String.valueOf(Perguntas1.porc1r + "%"));
        this.R2R.setText(String.valueOf(Perguntas1.porc2r + "%"));
        this.R3R.setText(String.valueOf(Perguntas1.porc3r + "%"));
        this.R4R.setText(String.valueOf(Perguntas1.porc4r + "%"));
        this.R5R.setText(String.valueOf(Perguntas1.porc5r + "%"));
        this.R6R.setText(String.valueOf(Perguntas1.porc6r + "%"));
        this.R7R.setText(String.valueOf(Perguntas1.porc7r + "%"));
        this.R8R.setText(String.valueOf(Perguntas1.porc8r + "%"));
        this.R9R.setText(String.valueOf(Perguntas1.porc9r + "%"));
        this.R10R.setText(String.valueOf(Perguntas1.porc10r + "%"));
 
        
        this.R1MR.setText(String.valueOf(Perguntas1.porc1mr + "%"));
        this.R2MR.setText(String.valueOf(Perguntas1.porc2mr + "%"));
        this.R3MR.setText(String.valueOf(Perguntas1.porc3mr + "%"));
        this.R4MR.setText(String.valueOf(Perguntas1.porc4mr + "%"));
        this.R5MR.setText(String.valueOf(Perguntas1.porc5mr + "%"));
        this.R6MR.setText(String.valueOf(Perguntas1.porc6mr + "%"));
        this.R7MR.setText(String.valueOf(Perguntas1.porc7mr + "%"));
        this.R8MR.setText(String.valueOf(Perguntas1.porc8mr + "%"));
        this.R9MR.setText(String.valueOf(Perguntas1.porc9mr + "%"));
        this.R10MR.setText(String.valueOf(Perguntas1.porc10mr + "%"));

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VoltarQ = new javax.swing.JButton();
        Perg3 = new javax.swing.JLabel();
        Perg4 = new javax.swing.JLabel();
        Perg5 = new javax.swing.JLabel();
        Perg6 = new javax.swing.JLabel();
        Perg7 = new javax.swing.JLabel();
        Perg8 = new javax.swing.JLabel();
        Perg9 = new javax.swing.JLabel();
        Perg10 = new javax.swing.JLabel();
        Perg1 = new javax.swing.JLabel();
        Perg2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        R1 = new javax.swing.JLabel();
        R2 = new javax.swing.JLabel();
        R3 = new javax.swing.JLabel();
        R4 = new javax.swing.JLabel();
        R5 = new javax.swing.JLabel();
        R6 = new javax.swing.JLabel();
        R7 = new javax.swing.JLabel();
        R8 = new javax.swing.JLabel();
        R9 = new javax.swing.JLabel();
        R10 = new javax.swing.JLabel();
        R2B = new javax.swing.JLabel();
        R1B = new javax.swing.JLabel();
        R3B = new javax.swing.JLabel();
        R4B = new javax.swing.JLabel();
        R5B = new javax.swing.JLabel();
        R6B = new javax.swing.JLabel();
        R7B = new javax.swing.JLabel();
        R8B = new javax.swing.JLabel();
        R9B = new javax.swing.JLabel();
        R10B = new javax.swing.JLabel();
        R1M = new javax.swing.JLabel();
        R2M = new javax.swing.JLabel();
        R3M = new javax.swing.JLabel();
        R4M = new javax.swing.JLabel();
        R5M = new javax.swing.JLabel();
        R6M = new javax.swing.JLabel();
        R7M = new javax.swing.JLabel();
        R8M = new javax.swing.JLabel();
        R9M = new javax.swing.JLabel();
        R10M = new javax.swing.JLabel();
        R1R = new javax.swing.JLabel();
        R2R = new javax.swing.JLabel();
        R3R = new javax.swing.JLabel();
        R4R = new javax.swing.JLabel();
        R5R = new javax.swing.JLabel();
        R6R = new javax.swing.JLabel();
        R7R = new javax.swing.JLabel();
        R8R = new javax.swing.JLabel();
        R9R = new javax.swing.JLabel();
        R10R = new javax.swing.JLabel();
        R1MR = new javax.swing.JLabel();
        R2MR = new javax.swing.JLabel();
        R3MR = new javax.swing.JLabel();
        R4MR = new javax.swing.JLabel();
        R5MR = new javax.swing.JLabel();
        R6MR = new javax.swing.JLabel();
        R7MR = new javax.swing.JLabel();
        R8MR = new javax.swing.JLabel();
        R9MR = new javax.swing.JLabel();
        R10MR = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Entrevistados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Perguntas da pesquisa");

        VoltarQ.setText("Voltar");
        VoltarQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarQActionPerformed(evt);
            }
        });

        Perg3.setText("3 ) Em relação aos inventimentos com saúde sua opinião é?");

        Perg4.setText("4 ) Qual seu grau de satisfação em relação infraestrutura da cidade?");

        Perg5.setText("5 ) Sua opinião em relação a educação pública é?");

        Perg6.setText("6 ) Como você considera a conservação dos patrimônios públicos de nossa cidade?");

        Perg7.setText("7 ) Quanto a disponibilidade de vagas de empregos qual sua opinião?");

        Perg8.setText("8 ) Em relação ao comércio, considerando a variedade e qualidade de produtos, qual seu nível de satisfação?");

        Perg9.setText("9 ) Considerando o entretenimento qual seu nível de satisfação?");

        Perg10.setText("10 ) Como você considera a segurança pública de nossa cidade?");

        Perg1.setText("1 ) Qual seu nível de satisfação em relação ao atual desenvolvimento da cidade?");

        Perg2.setText("2 ) Como você considera o trânsito da cidade?");

        jLabel2.setText("Resposta mais votada");

        R1.setText("jLabel3");
        R1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                R1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        R2.setText("jLabel3");

        R3.setText("jLabel3");

        R4.setText("jLabel3");

        R5.setText("jLabel3");

        R6.setText("jLabel3");

        R7.setText("jLabel3");

        R8.setText("jLabel3");

        R9.setText("jLabel3");

        R10.setText("jLabel3");

        R2B.setText("jLabel3");

        R1B.setText("jLabel3");

        R3B.setText("jLabel3");

        R4B.setText("jLabel3");

        R5B.setText("jLabel3");

        R6B.setText("jLabel3");

        R7B.setText("jLabel3");

        R8B.setText("jLabel3");

        R9B.setText("jLabel3");

        R10B.setText("jLabel3");

        R1M.setText("jLabel3");

        R2M.setText("jLabel3");

        R3M.setText("jLabel3");

        R4M.setText("jLabel3");

        R5M.setText("jLabel3");

        R6M.setText("jLabel3");

        R7M.setText("jLabel3");

        R8M.setText("jLabel3");

        R9M.setText("jLabel3");

        R10M.setText("jLabel3");

        R1R.setText("jLabel3");

        R2R.setText("jLabel3");

        R3R.setText("jLabel3");

        R4R.setText("jLabel3");

        R5R.setText("jLabel3");

        R6R.setText("jLabel3");

        R7R.setText("jLabel3");

        R8R.setText("jLabel3");

        R9R.setText("jLabel3");

        R10R.setText("jLabel3");

        R1MR.setText("jLabel3");

        R2MR.setText("jLabel3");

        R3MR.setText("jLabel3");

        R4MR.setText("jLabel3");

        R5MR.setText("jLabel3");

        R6MR.setText("jLabel3");

        R7MR.setText("jLabel3");

        R8MR.setText("jLabel3");

        R9MR.setText("jLabel3");

        R10MR.setText("jLabel3");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Muito Bom");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Bom");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Médio");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Ruim");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Muito Ruim");

        Entrevistados.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Entrevistados.setText("Total de Entrevistados:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Perg2)
                                            .addComponent(Perg1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(218, 218, 218)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(R1)
                                            .addComponent(R2)))
                                    .addComponent(Perg3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Perg4)
                                            .addComponent(Perg5)
                                            .addComponent(Perg6)
                                            .addComponent(Perg7)
                                            .addComponent(Perg8)
                                            .addComponent(Perg9)
                                            .addComponent(Perg10))
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(R5)
                                            .addComponent(R4)
                                            .addComponent(R6)
                                            .addComponent(R7)
                                            .addComponent(R8)
                                            .addComponent(R9)
                                            .addComponent(R10)
                                            .addComponent(R3))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(R2R)
                                            .addComponent(R1R)
                                            .addComponent(R3R)
                                            .addComponent(R4R)
                                            .addComponent(R5R)
                                            .addComponent(R6R)
                                            .addComponent(R7R)
                                            .addComponent(R8R)
                                            .addComponent(R9R)
                                            .addComponent(R10R))
                                        .addGap(41, 41, 41))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(48, 48, 48))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(175, 175, 175)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(R1B)
                                            .addComponent(R2B)
                                            .addComponent(R3B)
                                            .addComponent(R4B)
                                            .addComponent(R5B)
                                            .addComponent(R6B)
                                            .addComponent(R7B)
                                            .addComponent(R8B)
                                            .addComponent(R9B)
                                            .addComponent(R10B))
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(R1M)
                                            .addComponent(jLabel7)
                                            .addComponent(R2M)
                                            .addComponent(R3M)
                                            .addComponent(R4M)
                                            .addComponent(R5M)
                                            .addComponent(R6M)
                                            .addComponent(R7M)
                                            .addComponent(R8M)
                                            .addComponent(R9M)
                                            .addComponent(R10M))
                                        .addGap(61, 61, 61)))
                                .addGap(80, 80, 80)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(45, 54, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(R2MR)
                                    .addComponent(R1MR)
                                    .addComponent(R3MR)
                                    .addComponent(R4MR)
                                    .addComponent(R5MR)
                                    .addComponent(R6MR)
                                    .addComponent(R7MR)
                                    .addComponent(R8MR)
                                    .addComponent(R9MR)
                                    .addComponent(R10MR))
                                .addGap(65, 65, 65))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VoltarQ, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Entrevistados, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perg1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R1B))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perg2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R2)
                            .addComponent(R2B)
                            .addComponent(R2M)
                            .addComponent(R2R)
                            .addComponent(R2MR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perg3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R3)
                            .addComponent(R3B)
                            .addComponent(R3M)
                            .addComponent(R3R)
                            .addComponent(R3MR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perg4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R4)
                            .addComponent(R4B)
                            .addComponent(R4M)
                            .addComponent(R4R)
                            .addComponent(R4MR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perg5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R5)
                            .addComponent(R5B)
                            .addComponent(R5M)
                            .addComponent(R5R)
                            .addComponent(R5MR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perg6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R6)
                            .addComponent(R6B)
                            .addComponent(R6M)
                            .addComponent(R6R)
                            .addComponent(R6MR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perg7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R7)
                            .addComponent(R7B)
                            .addComponent(R7M)
                            .addComponent(R7R)
                            .addComponent(R7MR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perg8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R8)
                            .addComponent(R8B)
                            .addComponent(R8M)
                            .addComponent(R8R)
                            .addComponent(R8MR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perg9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R9)
                            .addComponent(R9B)
                            .addComponent(R9M)
                            .addComponent(R9R)
                            .addComponent(R9MR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Perg10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R10)
                            .addComponent(R10B)
                            .addComponent(R10M)
                            .addComponent(R10R)
                            .addComponent(R10MR)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R1M)
                            .addComponent(R1R)
                            .addComponent(R1MR))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarQ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Entrevistados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarQActionPerformed
        VoltarQ.addActionListener(e -> this.dispose());
        new Entrada().setVisible(true);
    }//GEN-LAST:event_VoltarQActionPerformed

    private void R1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_R1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_R1AncestorAdded

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
            java.util.logging.Logger.getLogger(Questionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Entrevistados;
    private javax.swing.JLabel Perg1;
    private javax.swing.JLabel Perg10;
    private javax.swing.JLabel Perg2;
    private javax.swing.JLabel Perg3;
    private javax.swing.JLabel Perg4;
    private javax.swing.JLabel Perg5;
    private javax.swing.JLabel Perg6;
    private javax.swing.JLabel Perg7;
    private javax.swing.JLabel Perg8;
    private javax.swing.JLabel Perg9;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel R10;
    private javax.swing.JLabel R10B;
    private javax.swing.JLabel R10M;
    private javax.swing.JLabel R10MR;
    private javax.swing.JLabel R10R;
    private javax.swing.JLabel R1B;
    private javax.swing.JLabel R1M;
    private javax.swing.JLabel R1MR;
    private javax.swing.JLabel R1R;
    private javax.swing.JLabel R2;
    private javax.swing.JLabel R2B;
    private javax.swing.JLabel R2M;
    private javax.swing.JLabel R2MR;
    private javax.swing.JLabel R2R;
    private javax.swing.JLabel R3;
    private javax.swing.JLabel R3B;
    private javax.swing.JLabel R3M;
    private javax.swing.JLabel R3MR;
    private javax.swing.JLabel R3R;
    private javax.swing.JLabel R4;
    private javax.swing.JLabel R4B;
    private javax.swing.JLabel R4M;
    private javax.swing.JLabel R4MR;
    private javax.swing.JLabel R4R;
    private javax.swing.JLabel R5;
    private javax.swing.JLabel R5B;
    private javax.swing.JLabel R5M;
    private javax.swing.JLabel R5MR;
    private javax.swing.JLabel R5R;
    private javax.swing.JLabel R6;
    private javax.swing.JLabel R6B;
    private javax.swing.JLabel R6M;
    private javax.swing.JLabel R6MR;
    private javax.swing.JLabel R6R;
    private javax.swing.JLabel R7;
    private javax.swing.JLabel R7B;
    private javax.swing.JLabel R7M;
    private javax.swing.JLabel R7MR;
    private javax.swing.JLabel R7R;
    private javax.swing.JLabel R8;
    private javax.swing.JLabel R8B;
    private javax.swing.JLabel R8M;
    private javax.swing.JLabel R8MR;
    private javax.swing.JLabel R8R;
    private javax.swing.JLabel R9;
    private javax.swing.JLabel R9B;
    private javax.swing.JLabel R9M;
    private javax.swing.JLabel R9MR;
    private javax.swing.JLabel R9R;
    private javax.swing.JButton VoltarQ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
