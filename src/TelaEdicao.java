
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaEdicao extends javax.swing.JFrame {

    /**
     * Creates new form TelaEdicao
     */
    private Fase fase;
    private Objeto arrastado = null;
    private Objeto abaixoDoMouse = null;
    public TelaEdicao(Fase fase) {
        this.fase = fase;
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

        NovoCarroPalhacao = new javax.swing.JButton();
        LabelMenuLateral = new javax.swing.JLabel();
        NovoCanhao = new javax.swing.JButton();
        NovaCartola = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Fase = new javax.swing.JMenu();
        Abria = new javax.swing.JMenuItem();
        Exporta = new javax.swing.JMenuItem();
        Ajuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        NovoCarroPalhacao.setText("CarroPalhoco");

        LabelMenuLateral.setText("Novo:");

        NovoCanhao.setText("Canhao");
        NovoCanhao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoCanhaoActionPerformed(evt);
            }
        });

        NovaCartola.setText("Cartolas");
        NovaCartola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovaCartolaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MoveObjeto(evt);
                MarcaObjeto(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SoltaObjeto(evt);
                SelecionaObjeto(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Fase.setText("Fase");

        Abria.setText("Abrir");
        Fase.add(Abria);

        Exporta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        Exporta.setText("Exportar");
        Exporta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportaActionPerformed(evt);
            }
        });
        Fase.add(Exporta);

        jMenuBar1.add(Fase);

        Ajuda.setText("Ajuda");
        jMenuBar1.add(Ajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NovaCartola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NovoCanhao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NovoCarroPalhacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelMenuLateral)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NovoCarroPalhacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NovoCanhao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NovaCartola)
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExportaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExportaActionPerformed

    private void NovoCanhaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoCanhaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NovoCanhaoActionPerformed

    private void MoveObjeto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveObjeto
        
        if(arrastado != null){
            arrastado.setX(evt.getX());
            arrastado.setY(evt.getY());
            Graphics g = jPanel1.getGraphics();
            g.setColor(Color.white);
            g.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
            for(Objeto atuador: fase.getAtuadores()){
                atuador.desenha(g);
            }
            arrastado.desenha(g);
        }
    }//GEN-LAST:event_MoveObjeto

    private void NovaCartolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovaCartolaActionPerformed
        try {
            arrastado = new Cartola(100, 100);
        } catch (IOException ex) {
            System.out.println("Não está achando a cartola!");
            Logger.getLogger(TelaEdicao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NovaCartolaActionPerformed

    private void SoltaObjeto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SoltaObjeto
        if(!fase.getAtuadores().contains(arrastado)){
            fase.adicionaObjeto(arrastado);
            System.out.println("adicionou objeto");
        }
        arrastado=null;
    }//GEN-LAST:event_SoltaObjeto

    private void SelecionaObjeto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelecionaObjeto
        if(abaixoDoMouse != null && arrastado == null){
            arrastado = abaixoDoMouse;
            System.out.println("chou novo abaixo do mouse");
        }
    }//GEN-LAST:event_SelecionaObjeto

    private void MarcaObjeto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarcaObjeto
        Objeto aux = null;
        for(Objeto atuador: fase.getAtuadores()){
                if(atuador.colisao(evt.getX(), evt.getY())){
                    aux = abaixoDoMouse;
                    
                }
            
        }
        abaixoDoMouse=aux;
    }//GEN-LAST:event_MarcaObjeto

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abria;
    private javax.swing.JMenu Ajuda;
    private javax.swing.JMenuItem Exporta;
    private javax.swing.JMenu Fase;
    private javax.swing.JLabel LabelMenuLateral;
    private javax.swing.JButton NovaCartola;
    private javax.swing.JButton NovoCanhao;
    private javax.swing.JButton NovoCarroPalhacao;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
